/*
Sum of All Numbers
Description:
Add all numbers in a list.
Example:
Input → [1, 2, 3, 4]
Output → 10
*/
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
public class SumOfAllNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the in array: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		int st = al.stream().reduce(0, (a,b) -> a+b);
		System.out.println("The sum is: "+st);
	}
}