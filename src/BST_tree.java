public class BST_tree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;                              // creating tree Node...
            left = right = null;
        }
    }
    static void inorder(Node root){
        if(root == null){
            return;
        }
        if(root != null ) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    static boolean searchTree(Node root, int key){
        if(root == null){
            return false;                                  // creating searchTree function...
        }
        if(root.data == key){
            return true;
        }
        boolean searchLeft = searchTree(root.left,key);
            if(searchLeft) return true;
        return searchTree(root.right,key);

    }
    static Node insertNode(Node root, int key){
        if(root == null){
            return new Node(key);                         // creating insertNode function...
        }
        if(key<root.data){
            root.left = insertNode(root.left,key);
        }else {
            root.right = insertNode(root.right,key);
        }
        return root;
    }
    static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");            // creating preorder...
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null){
            return;                                     // creating postorder...
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    static Node getSuccessor(Node root){
        root = root.right;
        while(root != null && root.left != null){
            root= root.left;
        }
        return root;
    }
    static Node delNode(Node root,int x){
        if(root==null) return root;

        if(x < root.data){
            root.left = delNode(root.left,x);           // deleting any node...
        }else if(x > root.data){
            root.right = delNode(root.right, x);
        }else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            Node IS = getSuccessor(root);
            root.data = IS.data;
            root.right = delNode(root.right, IS.data);
        }
        return root;
    }

    public static void main(String[]args){
        Node root = new Node(20);
        root.left = new Node(13);
        root.left.left = new Node(11);
        root.left.left.left = new Node(10);
        root.left.left.right = new Node(12);             // creating treeNode...
        root.left.right = new Node(16);
        root.left.right.left = new Node(15);
        root.left.right.right = new Node(18);
        root.right = new Node(24);
        root.right.left = new Node(21);
        root.right.right = new Node(27);
        root.right.right.left = new Node(25);
        root.right.right.right = new Node(30);

        inorder(root);

        if(searchTree(root,30)){
            System.out.println("\ntrue");
        }else{
            System.out.println("\nfalse");
        }

        insertNode(root,23);
        insertNode(root,55);                            // inserting newNode...
        insertNode(root,9);

        System.out.println("inOrder...");
        inorder(root);
        System.out.println("\npreOrder...");
        preOrder(root);
        System.out.println("\npostOrder...");
        postOrder(root);

        System.out.println("\n delete the node...");
        delNode(root,20);
        delNode(root,55);
        inorder(root);

    }
}
