import java.util.function.Predicate;
import java.util.Scanner;
public class PredicateApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Predicate<Integer> p = new Predicate<Integer>()
		{
			public boolean test(Integer a)
			{
				return a % 2 == 0 ? true:false;
			}
		};
		System.out.print("Enter the number: ");
		boolean result = p.test(sc.nextInt());
		System.out.println("The number is even: "+result);
	}
}