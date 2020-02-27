package problem_2;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // left empty
    }

    public static void ReverseStack(Stack<Integer> stack) {
    	 if(stack.isEmpty()==false){
             int x = stack.pop();
             ReverseStack(stack);
             insertBottom(stack, x);
         }
    }
    private static void insertBottom(Stack<Integer> stack,int x)
    {
        if(stack.isEmpty()){
            stack.push(x);
            return;
        }
        int y = stack.pop();
        insertBottom(stack, x);
        stack.push(y);
    }
}