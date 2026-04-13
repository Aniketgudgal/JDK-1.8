/*
 Find Even Numbers
Description:
Filter numbers divisible by 2.
Example:
Input → [1, 2, 3, 4, 5]
Output → [2, 4]
*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class EvenNumberStream
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		List<Integer> al = new ArrayList<>();
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Output is: ");
		Stream<Integer> st = al.stream().filter((v) -> v % 2 == 0);
		st.forEach((abc) -> System.out.print(abc+" "));
	}
}