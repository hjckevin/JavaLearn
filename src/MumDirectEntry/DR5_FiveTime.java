package MumDirectEntry;

/*
 * 5. [Tests knowledge of concept of static] Create a Java class that 
 * allows at most 5 instances of itself to be created. Call your class 
 * JustFive. Provide a main method in your class that attempts to create 
 * 		6 instances of your class.
 * 
 */

import java.util.*;

public class DR5_FiveTime {

	public static void main(String args[]) {
		System.out.println("JustFive Sample...");
		for (int i = 0; i < 6; i++) {
			JustFive ft = JustFive.getInstance();
			System.out.println("JustFive : " + ft + " Size is " + ft.getSize());
		}
	}

}

class JustFive {

	private static List<JustFive> list = Collections
			.synchronizedList(new LinkedList<JustFive>());
	private static int index = 0;

	private JustFive() {
	}

	public static JustFive getInstance() {
		if (list.size() < 5) {
			synchronized (list) {
				JustFive newObj = new JustFive();
				list.add(newObj);
				return newObj;
			}
		} else {
			synchronized (list) {
				JustFive head = list.get(index);
				index = (index + 1) % list.size();
				return head;
			}
		}
	}

	public int getSize() {
		return list.size();
	}
}
