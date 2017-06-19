package MumDirectEntry;

import java.util.*;

public class PQ2_SolveLetterCount {

	public static HashMap<Character, String> letterCount(char[] cArray) {
		HashMap<Character, String> hm = new HashMap<Character, String>();
		
		for(int i = 0; i < cArray.length; i++) {
			Set keySet = hm.keySet();
			if(keySet.contains(cArray[i]))
				hm.put(cArray[i], hm.get(cArray[i]) + "*");
			else
				hm.put(cArray[i], "*");
		}
		
		return hm;
	}
	
	public static void main(String[] args) {
		char[] s = {'a','c','e','e','e','a','q','e','a'};
		HashMap<Character, String> hmTmp = letterCount(s);
		for (Map.Entry<Character, String> entry : hmTmp.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}
