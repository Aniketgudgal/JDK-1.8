@FunctionalInterface
// functional interface required only one method
interface Lambda
{
	void display();
}
public class LamApplication
{
	public static void main(String x[])
	{
		// this is the anonymous inner class
		/*
		Lambda a = new Lambda(){
			public void display()
			{
				System.out.println("My Name is Aniket");
			}
		};
		// calling interface method
		a.display();
		*/
		// converting anonymous inner to lambda expression
		Lambda a = () -> System.out.println("My name is Aniket");
		a.display();
	}
}