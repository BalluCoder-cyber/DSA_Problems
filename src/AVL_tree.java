import java.util.*;
public class AVL_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        int height;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
            height = 1;
        }
    }

    static int height(Node N){
        if(N == null) return 0;                              // HEIGHT FUNCTION...
        return N.height;
    }
    static Node rightRotation(Node y){
        Node x = y.left;
        Node T2 = x.right;                                  // RIGHT ROTATE IMBALANCED NODE...
        x.right = y;
        y.left = T2;

        y.height = 1+Math.max(height(y.left),height(y.right));
        x.height = 1+Math.max(height(x.left),height(x.right));

        return x;
    }
    static Node leftRotation(Node x){
        Node y = x.right;
        Node T2 = y.left;                                      // LEFT ROTATE IMBALANCED NODE...
        y.left = x;
        x.right = T2;

        x.height = 1+Math.max(height(x.left),height(x.right));
        y.height = 1+Math.max(height(y.left),height(y.right));

        return y;
    }
    static int treeBalance(Node N){
                                                          // BALANCING FUNCTION...
        if(N == null){
            return 0;
        }
        return height(N.left)-height(N.right);
    }
    static Node insertNode(Node node, int val){
        // Perform the normal BST insertion...
        if(node == null){                                    //INSERTION IN AVL TREE...
            return new Node(val);
        }
        if(val < node.data){
            node.left = insertNode(node.left,val);
        }else if(val > node.data){
            node.right = insertNode(node.right,val);
        }else{
            return node;
        }

        node.height = 1+Math.max(height(node.left),height(node.right));
        // check the tree is balance or not...
        int balance = treeBalance(node);
        // left_left Case...
        if(balance > 1 && val < node.left.data){
            return rightRotation(node);
        }
        // right_right case...
        if(balance < -1 && val > node.right.data){
            return leftRotation(node);
        }
        // left_right case...
        if(balance > 1 && val > node.left.data){
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        // right_left case...
        if(balance < -1 && val < node.right.data){
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }
    static Node getMinValueNode(Node node){
        Node current = node;
        while(current.left != null){                    // GET THE INORDER SUCCESSOR FOR REPLACE THE DELETED NODE...
            current = current.left;
        }
        return current;
    }
    static Node deleteNode(Node root, int target){
        if(root == null){
            return root;                                    // DELETION IN AVL TREE...
        }
        if(target < root.data){
            root.left = deleteNode(root.left , target);
        }else if (target > root.data){

            root.right = deleteNode(root.right,target);
        }else{
            // if data is same as root data , then this is  the node to be deleted;
            //this is for node have only one or no child;
            if(root.left==null || root.right == null){
                Node temp = root.left != null ? root.left:root.right;
                // no child ;
                if(temp==null){
                    temp = root;
                    root = null;
                }else
                    // only one child;
                    root = temp;
            }else{
                // node with two child;
                 Node temp = getMinValueNode(root.right);
                 root.data = temp.data;
                 root.right = deleteNode(root.right,temp.data);
            }
        }
        // when tree had a only one node;
        if(root == null) return root;

        // update height;
        root.height = 1+Math.max(height(root.left),height(root.right));

        //check balance;
        int balance = treeBalance(root);
        //LL case.
        if(balance > 1 && treeBalance(root.left) >= 0)
            return rightRotation(root);
        //LR case.
        if(balance > 1 && treeBalance(root.left) < 0){
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }
        //RR case.
        if(balance < -1 && treeBalance(root.right) <= 0 )
            return leftRotation(root);
        //RL case.
        if(balance < -1 && treeBalance(root.right) >0 ){
            root.right = rightRotation(root.right);
            return leftRotation(root);
        }
        return root;
    }

    static void inorderTraversal(Node root){
        if(root == null) return;                            // INORDER TRAVERSING...
        if(root != null){
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
    static int countOfGreaterNode(Node root, int val){
        if(root == null) return 0;
        int count = countOfGreaterNode(root.left,val) + countOfGreaterNode(root.right,val);
        if(root.data > val){
            count++;
        }
        return count;
    }
    static int nodeOfTreeHeight(int Height){
        if(Height == 0){
            return 1;
        }
        if(Height == 1){
            return 2;
        }
        int countOfHeight = (1+nodeOfTreeHeight(Height-1) + nodeOfTreeHeight(Height - 2));
        return countOfHeight;
    }
    public static void main (String[] args){
        Node root = new Node(5);
        root= insertNode(root,3);
        root=insertNode(root,6);
        root=insertNode(root,11);
        root=insertNode(root,12);
        root=insertNode(root,24);
        root=insertNode(root,66);
        root=insertNode(root,4);
        root=insertNode(root,9);
        inorderTraversal(root);
        deleteNode(root,4);
        deleteNode(root,11);
        System.out.println("\n after deletion..");
        inorderTraversal(root);
        System.out.println("\nCount Of Greater Node");
        System.out.println(countOfGreaterNode(root,5));
        System.out.println("count of Node in given height ");
        System.out.println(nodeOfTreeHeight(41));
    }
}
