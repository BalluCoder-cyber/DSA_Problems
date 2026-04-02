import java.util.*;


public class Tree_arrList {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }

    }

    public static Node buildTree(ArrayList<Integer> tree, int index){
        if(index >= tree.size()){
            return null;
        }
        Node root = new Node(tree.get(index));
        root.left = buildTree(tree,2*index +1);
        root.right = buildTree(tree,2*index +2);
        return root;
    }

    public static void postorder(Node node){
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

    public static void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr == null){
                System.out.println();   // making levelOrder traversing it is all called BFS traversing ... && pre in or post traversing is called DFS traversing...
                if(q.isEmpty()) {
                    break;
                }else {
                    q.add(null);
                }
            }else{
            System.out.print(curr.data + " ");
            if(curr.left != null) {
                q.add(curr.left);
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            }
        }

    }

    public static void main (String[] args){

        ArrayList<Integer> tree = new ArrayList<>();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);

        Node root = buildTree(tree,0);
        postorder(root);
        System.out.println();
        levelOrder(root);

    }
}
