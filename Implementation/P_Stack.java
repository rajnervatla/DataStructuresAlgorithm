package Implementation;

import java.util.Stack;


public class P_Stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < 4 ; i++) {
            s.push(i+777);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(s.pop());
        }

    }
}
