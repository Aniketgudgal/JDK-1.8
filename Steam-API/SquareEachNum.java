/*
Square Each Number
Description:
Transform each number into its square.
Example:
Input → [2, 3, 4]
Output → [4, 9, 16]
*/
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
public class SquareEachNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the values in array: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Output");
		Stream<Integer> st = al.stream().map((v) -> v*v);
		st.forEach(System.out::println);
	}
}