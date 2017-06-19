package ThinkingInJava.Collections;

import java.util.Stack;

public class StackSample {
	public static void main(String[] args) {
		Stack stack = new Stack();
		String s1 = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == '+') {
				stack.push(s1.charAt(++i));
			} else if(s1.charAt(i) == '-') {
				char c = (char)stack.pop();
				System.out.print(c);
			} else
				throw new NullPointerException();
		}
		
	}
}
