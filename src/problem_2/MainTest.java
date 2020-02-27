package problem_2;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;
import java.util.Stack;
public class MainTest {

    @Test
    public void reverseStack() {
    	Stack<Integer> stack0= new Stack<>();
    	Main.ReverseStack(stack0);
    	Stack<Integer> stack01= new Stack<>();
    	
    	Stack<Integer> stack1= new Stack<>();
    	stack1.push(0);
    	Main.ReverseStack(stack1);
    	Stack<Integer> stack11= new Stack<>();
    	stack11.push(0);
    	
    	Stack<Integer> stack2= new Stack<>();
    	stack2.push(0);stack2.push(1);
    	Main.ReverseStack(stack2);
    	Stack<Integer> stack21= new Stack<>();
    	stack21.push(1);stack21.push(0);
    	
    	Stack<Integer> stack3= new Stack<>();
    	stack3.push(0);stack3.push(1);stack3.push(2);
    	Main.ReverseStack(stack3);
    	Stack<Integer> stack31= new Stack<>();
    	stack31.push(2);stack31.push(1);stack31.push(0);
    	
    	Stack<Integer> stack4= new Stack<>();
    	stack4.push(0);stack4.push(2);stack4.push(2);stack4.push(3);
    	Main.ReverseStack(stack4);
    	Stack<Integer> stack41= new Stack<>();
    	stack41.push(3);stack41.push(2);stack41.push(2);stack41.push(0);
    	List<String> expects=new ArrayList<String>(); 
    	List<String> actuals=new ArrayList<String>(); 
    	expects.add(stack01.toString());expects.add(stack11.toString());expects.add(stack21.toString());expects.add(stack31.toString());expects.add(stack41.toString());
    	actuals.add(stack0.toString());actuals.add(stack1.toString());actuals.add(stack2.toString());actuals.add(stack3.toString());actuals.add(stack4.toString());
    	for(int i=0;i<5;i++)
    	{
    		assertEquals(expects,actuals);
    	}
    }
}
   