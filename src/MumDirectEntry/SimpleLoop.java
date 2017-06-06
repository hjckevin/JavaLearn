package MumDirectEntry;

public class SimpleLoop {

	public static void main(String[] args) {
		String[] str = {"Bob", "Steve", "Sue", "Tony", "Melba"};
		String result = displayArray(str);
		System.out.println(result);
	}
	
	public static String displayArray(String[] str) {
		String s = "";
		for (int i = 0; i < str.length; i++) {
			if (i == str.length - 1)
				s += str[i];
			else
				s += str[i] + ",";	
		}
		
		return s;
	}
}
