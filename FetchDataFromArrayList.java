import java.util.function.Consumer;
import java.util.Scanner;
import java.util.ArrayList;
public class FetchDataFromArrayList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of List: ");
		int size = sc.nextInt();
		ArrayList <Integer> al = new ArrayList<>();
		System.out.print("Enter the values in Array list: ");
		for(int i = 0; i < size; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("The Array List data is following");
		Consumer<Integer> cm = (v)->System.out.print(v+" ");
		al.forEach(cm);
	}
}