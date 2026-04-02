public class Tree_array {

    public static class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

    public static Node createTree(int[] arr, int i){
        if(i>=arr.length){
            return null;
        }
        Node root = new Node(arr[i]);                // making arr into tree...
        root.left = createTree(arr,2*i+1);
        root.right = createTree(arr,2*i+2);
        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+ " ");           // making inorder traversal...
        inorder(root.right);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
       //Tree_array treeA = new Tree_array();  // you can make object of class...
       Tree_array.createTree(arr,0);           // but this is a write way to implement function in main...
       Node root = createTree(arr,0);          // Making rootNode ...
        Tree_array.inorder(root);

    }
}
