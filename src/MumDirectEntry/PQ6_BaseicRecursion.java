package MumDirectEntry;

public class PQ6_BaseicRecursion {
	public static void main(String[] args) {
		System.out.println(sumLess(10));
		System.out.println(sumLessRecursion(10));
	}
	
	static int sumLess(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum += i;
		
		return sum;
	}
	
	static int sumLessRecursion(int n) {
		int sum = 0;
		sum += n;
		if(n > 0)
			sum += sumLessRecursion(n-1);
		
		return sum;
	}
}
