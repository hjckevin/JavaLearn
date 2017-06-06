package MumDirectEntry;

public class DR2_TestForSum {
	
	public static void main(String[] args) {
		System.out.println(TestSum(new int[] { 1, 1, 3, 2, 4 }, 5));
	}

	static boolean TestSum(int[] a, int x) {
		int i, j, k;
		boolean flag = false;
		for (i = 0; i < a.length; i++)
			for (j = i + 1; j < a.length; j++)
				for (k = j + 1; k < a.length; k++)
					if (a[i] + a[j] + a[k] == x) {
						flag = true;
						break;
					}
		return flag;
	}
}
