import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
class Vehicle
{
	private String name;
	private int wheel;
	private int capacityEngine;
	private int registrationNum;
	public Vehicle(int registrationNum, String name, int wheel, int capacityEngine)
	{
		this.registrationNum = registrationNum;
		this.name = name;
		this.wheel = wheel;
		this.capacityEngine = capacityEngine;
	}
	public Vehicle()
	{
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setRegistrationNum(int registrationNum)
	{
		this.registrationNum = registrationNum;
	}
	public int getRegistrationNum()
	{
		return registrationNum;
	}
	public void setCapacityEngine(int capacityEngine)
	{
		this.capacityEngine = capacityEngine;
	}
	public int getCapacityEngine()
	{
		return capacityEngine;
	}
	public void setWheel(int wheel)
	{
		this.wheel = wheel;
	}
	public int getWheel()
	{
		return wheel;
	}
}
public class UserdefineObjConsumer
{
	public static void main(String x[])
	{
		Vehicle v1 = new Vehicle(123,"Car",4,1500);
		Vehicle v2 = new Vehicle(456,"Bike",2,350);
		ArrayList<Vehicle> al = new ArrayList<>();
		al.add(v1);
		al.add(v2);
		/*
		// simple anonymous inner class
		Consumer<Vehicle> cn = new Consumer<Vehicle>(){
			public void accept(Vehicle v)
			{
				System.out.println(v.getName()+"\t"+v.getRegistrationNum()+"\t"+v.getCapacityEngine()+"\t"+v.getWheel());
			}
		};
		*/
		
		/*
		// user define object with lambda expression
		Consumer<Vehicle> cn = (v)->System.out.println(v.getName()+"\t"+v.getRegistrationNum()+"\t"+v.getCapacityEngine()+"\t"+v.getWheel());
		al.forEach(cn);
		*/
		
		al.forEach((v)->System.out.println(v.getName()+"\t"+v.getRegistrationNum()+"\t"+v.getCapacityEngine()+"\t"+v.getWheel()));
	}
}