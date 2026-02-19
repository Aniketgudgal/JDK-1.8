import java.util.function.Predicate;
import java.util.function.*;
import java.util.function.Consumer;
import java.util.*;
public class PredicateApplicationApp
{
	public static void main(String x[])
	{
		List<Integer> ls = List.of(10,11,20,23,22,45,44);
		Predicate<Integer> pl = (val) -> val % 2 == 0;
		Consumer<Integer> cl = (val) -> {if(pl.test(val)) System.out.print(val+" ");};
		ls.forEach(cl);
	}
}