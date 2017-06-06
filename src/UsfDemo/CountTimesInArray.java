package UsfDemo;

import java.util.Scanner;

public class CountTimesInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		int n = 0;
		System.out.print("Input number elements of array: ");
		n = Input();
		arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Input();

		for (int i = 0; i < n; i++)
			if (CountTimesInArray(arr, i, arr[i]) == 0)
				System.out.println("The number time of element " + arr[i]
						+ " in array is " + CountTimesInArray(arr, n, arr[i]));
	}

	public static int CountTimesInArray(int[] iA, int len, int x) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (iA[i] == x)
				count++;

		}

		return count;
	}

	public static int Input() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		boolean check = true;
		while (check) {
			try {
				result = sc.nextInt();
				check = false;
			} catch (Exception ex) {
				System.out.print("Input Error! Input again!");
				sc.nextInt();
			}
		}
		return result;
	}
}
