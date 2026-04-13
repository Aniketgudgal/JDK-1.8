/*
 Find Odd Numbers
Description:
Filter numbers not divisible by 2.
Example:
Input → [1, 2, 3, 4]
Output → [1, 3]
*/
import java.util.Scanner;
//import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Consumer;
interface Consumer
{
	public void accept(T t);
}
public class OddNumberStream
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Output: ");
		Predicate<Integer> pt = new Predicate<>()
		{
			public boolean test(Integer v)
			{
				return (v % 2 != 0);
			}
		};
		Stream<Integer> st = al.stream().filter(pt);
		Consumer<Integer> cm = new Consumer<>()
		{
			public void accept(Integer a)
			{
				System.out.print(a+ " ");
			}
		};
		st.forEach(cm);
	}
}