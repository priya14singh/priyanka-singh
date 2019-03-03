package functions;

public class Car {
	
	String name;
	String model;
	int wheels;
	String colour;
	
	public Car(String name, String model, int wheels, String colour)
	{
		this.name=name;
		this.model=model;
	     this.wheels=wheels;
		this.colour=colour;
		
		
	}
	
	public Car ()
	{
		
	}
	
	public static void drive()
	{
		//Car c= new Car();
		
		//System.out.println("the "+c.name+" car of "+c.model+" have "+c.wheels+" wheels and in "+c.colour+" colour");
	}
	public void transport()
	{
		System.out.println("the "+name+" car transports passengers from pune to mumbai");
	}
	
	public void specification()
	{
		System.out.println("the "+name+" car of "+model+" have "+wheels+" wheels and in "+colour+" colour");
	}

		
	}

