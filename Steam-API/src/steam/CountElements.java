package steam;

import java.util.Arrays;
import java.util.Scanner;

public class CountElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entet the size of Array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the values in Array: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		long count = Arrays.stream(nums).count();
		System.out.println(count);
	}

}
