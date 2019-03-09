package exeptions;

import java.io.FileInputStream;

import oopsabstractions.HDFC;

public class LearnException {

	public static void main(String[] args) {
		
		int a= 10;
		int b=0;
		
		System.out.println(a/b);
		
		try
		{
		
		System.out.println(a/b);
		
		HDFC b1 =new HDFC();
		b1.demonetization();

		
		//FileInputStream file= new FileInputStream("assjsbs");//checked exception
		
        throw new Error("testing error");

	}catch(ArithmeticException e)
		{
		System.out.println(e.getMessage());
		
	}

	}
}

	
