import java.util.function.Consumer;
public class PrintNum
{
	public static void main(String x[])
	{
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		Consumer<Integer> al = val -> System.out.println(val);
		for(int a: arr)
		{
			al.accept(a);
		}
	}
}