import java.util.LinkedList;
import java.util.Queue;      // import queue or Link for level Order traversal...
class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        data = val;        //creating node for tree...
        left = null;
        right = null;
    }
}

public class Binary_tree {
    Node root = null;

     void inorder_traversal(Node node){
        if(node != null){
            inorder_traversal(node.left);
            System.out.print(node.data+" ");       // creating inorder traversal...
            inorder_traversal(node.right);
        }
    }

    void preorder(Node node){
        if(node != null) {
            System.out.print(node.data + " ");    //creating preorder traversal...
            preorder(node.left);
            preorder(node.right);
        }
    }

    void postorder(Node node){
         if(node != null){
            postorder(node.left);               //creating postorder traversal...
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
    int Height(Node root){
        if(root == null) return 0;

        int leftHeight = Height(root.left);       //Height of nodes...
        int rightHeight = Height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);

    }
    int countNode(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = countNode(root.left);      //Total number of Node...
        int rightCount = countNode(root.right);
        return  leftCount + rightCount + 1;
    }
    void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();     //creating levelOrder traversal...
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    int getLevel(Node root, int key, int level){
         if(root == null){
             return -1;
         }
         if(root.data == key){
             return level;
         }
         int leftlevel = getLevel(root.left,key,level+1);   //level of node ....
         if(leftlevel != -1) {
             return leftlevel;
         }
         int rightlevel = getLevel(root.right,key,level+1);
         return rightlevel;
    }
    boolean searchNode(Node root,int target){
         if(root==null){
             return false;
         }
         if(root.data==target){
             return true;                                  // searchNode for searching node exist in tree or not....
         }
         boolean srleft=searchNode(root.left,target);
             if(srleft ) return true;
         boolean srright=searchNode(root.right,target);
         return srright;

    }
    int searchParent(Node root, int target,int parent ){
         if(root==null){
             return -1;
         }
         if(root.data == target){
             return parent;
         }
         int leftparent = searchParent(root.left,target,root.data);      //searching parent node of any child node...
         if(leftparent != -1) {
             return leftparent;
         }
         return  searchParent(root.right, target, root.data);
    }
    void findLeaf(Node root){
         if(root==null)
             return;
         if(root.left == null && root.right == null){                  // searching all leafNode ...
             System.out.println(root.data);
         }
         if(root.left != null){
              findLeaf(root.left);
         }
         if(root.right != null) {
              findLeaf(root.right);
         }
    }
    public static void main(String[] args){
        Binary_tree tree = new Binary_tree();
        Node f = new Node(10);
        Node s = new Node(11);
        Node t = new Node(12);
        Node fr = new Node(7);   //node declaration...
        Node fv = new Node(8);
        Node sx = new Node(1);
        Node sev = new Node(2);
        Node eig = new Node(3);
        Node nin = new Node(4);

        f.left = s;
        f.right = t;
        s.left = fr;
        s.right = fv;            // node connection...
        t.left = sx;
        t.right = sev;
        fv.right = eig;
        sx.right = nin;

        tree.root = f;
        System.out.println("INORDER ");
        tree.inorder_traversal(tree.root);              //calling inorder function...
        System.out.println("\nPREORDER ");
        tree.preorder(tree.root);                       // calling preorder function...
        System.out.println("\nPOSTORDER ");
        tree.postorder(tree.root);                      // calling postorder function...
        System.out.println("\nHeight of tree");
        System.out.println(tree.Height(tree.root));     // calling height function...
        System.out.println("\ntotal Node");
        System.out.println(tree.countNode(tree.root));  // calling countNode function...
        System.out.println("\nlevel Order traversal");
        tree.levelOrder(tree.root);                     // calling levelOrder function...
        System.out.println("\nfind level of node");
        System.out.println(tree.getLevel(tree.root,10,1));      // calling get level function...
        System.out.println("\nsearching node");
        if(tree.searchNode(tree.root,4)) {
            System.out.println(true);                 // calling searchNode function...
        }else{
            System.out.println(false);
        }
        System.out.println("\nParent Node");
        System.out.println(tree.searchParent(tree.root,3,-1));   // calling searchParent...
        System.out.println("\nLeaf Nodes");
        tree.findLeaf(tree.root);                    // calling findLeaf...
     }
}
