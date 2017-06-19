package MumDirectEntry;

public class PQ3_HasSamllCommonMutiple {

	public static void main(String[] args) {
		System.out.println(hasSmallCommonMutiple(10,15));
		System.out.println(hasSmallCommonMutiple(8,9));
	}
	
	public static boolean hasSmallCommonMutiple(int x, int y) {
		boolean flag = false;
		int max = x * y;
		for (int i = 1; i < x; i++) {
			for (int j = y; j > 0; j--) {
				int tmp = i * j;
				if(tmp < max && tmp % x == 0 && tmp % y == 0) {
					flag = true;
					return flag;
				}
			}
		}
		
		return flag;
	}
}
