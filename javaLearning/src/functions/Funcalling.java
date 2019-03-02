package functions;

public class Funcalling {

	public static void main(String[] args) 
	{
		Function1.sum(10,30);
    Function1.multiply(10, 20);
    
    Function1 obj=new Function1();
    
    int a=obj.interestcalculator(10000,8,10);
    System.out.println(a);
    
    int b=obj.mod(20,10);
    System.out.println(b);
    
    
    AcessModifier fun= new AcessModifier();
    fun.publicfun();
    fun.noAccessModfun();
    fun.protectedfun();

	}
}
