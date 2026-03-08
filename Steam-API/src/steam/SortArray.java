package steam;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i=0; i < nums.length; i++)
		{
			nums[i]= sc.nextInt(); 
		}
		Arrays.stream(nums).sorted().forEach((val) -> System.out.println(val));
	}
}
