public class Stack {
    static class Node{
         int data;
         Node next;
         public Node(int data){
             this.data= data;
             next = null;
         }
    }

    static class StackData{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main (String[] args){

        //StackData s = new StackData();
        StackData.push(2);
        StackData.push(4);
        StackData.push(5);

        while(!StackData.isEmpty()){
            System.out.println(StackData.peek());
            StackData.pop();
        }





    }
}
