import java.util.function.Consumer;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class ConsumerApplication
{
	public static void main(String x[])
	{
		List<Integer> ls = new ArrayList<>();
		ls.add(100);
		ls.add(200);
		ls.add(300);
		/*
		// Consumer interface with anonymous inner class
		Consumer<Integer> al = new Consumer<Integer>(){
		public void accept(Integer num)
		{
			System.out.println(num);
		}
		};
		*/
		
		/*
		// consumer with lambda expression
		Consumer<Integer> al = (val)-> System.out.println(val);
		ls.forEach(al);
		*/
		// shortcut method
		ls.forEach((val) -> System.out.println(val));
	}
}