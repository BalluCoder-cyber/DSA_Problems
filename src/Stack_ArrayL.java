import java.util.*;
public class Stack_ArrayL {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        public static void push(int data){
            list.add(data);

        }

        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }


    public static void main(String args[]){

        Stack s = new Stack();
        s.push(2);
        s.push(6);
        s.push(7);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());



    }
}
