import java.util.function.Predicate;
import java.util.function.*;
import java.util.function.Consumer;
import java.util.*;
public class PredicateApplicationApp
{
	public static void main(String x[])
	{
		List<Integer> ls = List.of(10,11,20,23,22,45,44);
		Predicate<Integer> pl = new Predicate<Integer>(){
		public boolean test(Integer val)
		{
			return val % 2 == 0;
		}
		};
		Consumer<Integer> cl = new Consumer<Integer>(){
		public void accept(Integer val)
		{
			if(pl.test(val))
			{
				System.out.print(val+" ");
			}
		}
		};
		ls.forEach(cl);
	}
}