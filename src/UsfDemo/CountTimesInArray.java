package UsfDemo;

public class CountTimesInArray {
	public static void main(String[] args) {
		
	}
	
	public static int CountTimesInArray(int[] iA, int len, int x) {
		int count = 0;
		for(int i = 0; i < len; i++) {
			if(iA[i] == x) 
				count++;
			
		}
		
		return count;
	}
}
