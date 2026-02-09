import java.util.function.Consumer;
import java.util.Scanner;
public class CusumApplication
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to display: ");
		int a = sc.nextInt();
		// simple consumer interface
		/*
		Consumer<Integer> al = new Consumer<Integer>(){
			public void accept(Integer value)
			{
				System.out.println("The value is: "+value);
			}
		};
		al.accept(a);
		*/
		Consumer <Integer> al = (value)-> System.out.println(value);
		al.accept(a);
	}
}