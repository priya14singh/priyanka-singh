package functions;

public class AcessModifier {


		
	public void publicfun()
	{
		System.out.println("public from Accessmodifier");
	}

	private void privatefun()
	{
		System.out.println("private from Accessmodifier");
	}
	protected void protectedfun()
	{
		System.out.println("protected from Accessmodifier");
	}
	
	void noAccessModfun()
	{
		System.out.println("noAccessModfun from AccessModifier");
	}
	
	public static void main(String[] args)
	{
		AcessModifier obj=new AcessModifier();
		obj.privatefun();
		obj.publicfun();
		obj.noAccessModfun();
		obj.protectedfun();
	}
	}
	


