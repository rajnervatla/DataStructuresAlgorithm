package Stack;

/**
 * @author Vishal Singh
 */
public class ArrayImplementation {
    static class Stack{
        private final int size;
        private final int[] arr;
        private int top;
        Stack(int size){
            this.size = size;
            arr = new int[size];
            top = -1;
        }
        void push(int data){
            if(top == size){
                System.out.println("Overflow");
            }
            else{
                arr[top] = data;
                top++;
            }
        }
        int pop(){
            if(top == 0){
                System.out.println("Underflow");
                return -1;
            }
            else{
                int res = arr[top-1];
                top--;
                return res;
            }
        }
        void print(){
            if(top == -1) {
                System.out.println("No element present");
            }
            else{
                for (int i = 0; i < top; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(5);
        s.push(4);
        s.push(3);
        s.print();
        s.push(31);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(1);
        s.print();
    }
}
