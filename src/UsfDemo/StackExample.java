package UsfDemo;

import java.util.*;

public class StackExample {
	static void showpush(Stack st, int x) {
		st.push(new Integer(x));
		System.out.println("push(" + x + ") into stack");
		System.out.println("stack: " + st);
	}

	static void showpop(Stack st) {
		System.out.print("Pop -> ");
		int x = (Integer) st.pop();
		System.out.println(x);
		System.out.println("stack: " + st);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Stack is a subclass of Vector that implements a standard last-in, first-out stack.
        Stack st=new Stack();
        System.out.println("Stack: " + st);
        showpush(st, 42);
        showpush(st, 43);
        showpush(st, 44);
        showpop(st);
        showpop(st);
        showpop(st);
        try
        {
            showpop(st);
        }
        catch(Exception ex)
        {
            System.out.println("Stack is empty!");
        }
    
		
	}
}
