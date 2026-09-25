
public class LeetCode83 {
    public static  class Node{
        int data;
        Node next;
        Node( int data){
            this.data = data;
            next = null;
        }
    }

    public Node deleteDuplicate(Node head){
        Node curr = head;
        while (curr != null && curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }
        return head;
    }
    public static void main(String args[]){
       Node head = new Node(5);
       head.next = new Node(2);
       head.next.next = new Node(2);
       head.next.next.next = new Node(6);

       LeetCode83 lk= new LeetCode83();
       Node result =  lk.deleteDuplicate(head);
       while (result != null){
           System.out.print(result.data +"->");
           result = result.next;
       }
        System.out.print("NULL");




    }
}
