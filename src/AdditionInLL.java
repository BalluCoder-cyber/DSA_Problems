class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AdditionInLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode currnode = dummy;
        int carry = 0;
        int x = 0;
        int y = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                x = l1.val;
                l1 = l1.next;
            } else {
                x = 0;
            }
            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            } else {
                y = 0;
            }
            int sum = x + y + carry;
            carry = sum / 10;
            currnode.next = new ListNode(sum % 10);
            currnode = currnode.next;


        }
        return dummy.next;
    }
    public void traversal(ListNode head){
        while(head !=null){
            System.out.print(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {

       ListNode l1 = new ListNode(1,new ListNode(3));
       ListNode l2 = new ListNode(2,new ListNode(4));
       AdditionInLL addlist = new AdditionInLL();
       ListNode result = addlist.addTwoNumbers(l1,l2);
        addlist.traversal(result);



    }
}
