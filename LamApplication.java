interface Lambda
{
	void display();
}
public class LamApplication
{
	public static void main(String x[])
	{
		// this is the anonymous inner class
		Lambda a = new Lambda(){
			public void display()
			{
				System.out.println("My Name is Aniket");
			}
		};
		// calling interface method
		a.display();
	}
}