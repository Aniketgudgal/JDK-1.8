import java.util.*;
import java.util.function.*;
public class CheckVal
{
	public static void main(String x[])
	{
		List<Integer> al = Arrays.asList(10,20,30,40,50);
		Predicate<Integer> p = new Predicate<Integer>()
		{
			public boolean test(Integer val)
			{
				return val > 40;
			}
		};
		Consumer<Integer>cl = new Consumer<Integer>()
		{
			public void accept(Integer val1)
			{
				if(p.test(val1))
				{
					System.out.println(val1);
				}
			}
		};
		al.forEach(cl);
	}
}