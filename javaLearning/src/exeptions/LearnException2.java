package exeptions;

import oopsabstractions.HDFC;

public class LearnException2 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		try
		{
		
		System.out.println(a/b);
		
		HDFC b1 =new HDFC();
		b1.demonetization();

	}catch(ArithmeticException e)
		{
		System.out.println(e.getMessage());
		
	}catch(RuntimeException e)
{
System.out.println(e.getMessage());
}

catch(Exception e)
{
System.out.println(e.getMessage());


}
		System.out.println("testing");

}}
