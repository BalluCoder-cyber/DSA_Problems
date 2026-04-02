public class Link_list {
    static class Node{
        int data;
        Node next;


         Node(int data){
            this.data = data;
            next = null;
        }
    }

    //Insert newNode in first position...
    static Node insertFirstNode(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    // Insert at any position...
    static Node insertAt_pos(Node head, int pos , int vlu){
        Node newNode = new Node(vlu);
        if (pos==1){
            newNode.next = head; //at position 1...
            return newNode;
        }
        Node temp = head;
        for (int i = 1; i < pos-1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null){
            return head;
        }
        //Node newNode = new Node(vlu);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;

    }
    // Traversing function...
     static void traversal(Node head){
         while(head!=null) {
             System.out.println(head.data);
             head = head.next;
         }
     }

    public static void main (String[] args){
        Node head = new Node(7);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head=insertFirstNode(head,1);
        head=insertFirstNode(head,2);
        head = insertAt_pos(head,2,90);
        head= insertFirstNode(head,1);
        traversal(head);


    }
}
