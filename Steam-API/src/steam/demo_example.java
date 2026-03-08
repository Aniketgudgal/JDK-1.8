package steam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class demo_example {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(4);
		al.add(4);
		al.add(8);
		Consumer<Integer> cm = (v) -> System.out.println(v);
		al.stream().distinct().forEach(cm);
	}
}
