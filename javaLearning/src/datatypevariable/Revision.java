package datatypevariable;

public class Revision {

	public static void main(String[] args) {
		
                for(int i=1;i<=10;i++)
                {
                	System.out.println(i);
                }
                
                int a=10;
                int b=20;
                
                if(a>b)
                {
                	System.out.println("a is greatest");
                }
                else
                {
                	System.out.println("b is greatest");
                }
                
                
           //Array
                
                String[] str=new String[3];
                str[0]="Priyanka";
                str[1]="singh";
                str[2]="techbodhi";
                
                //10, true and priyankat
                
                Object[] obj= new Object[3];
                obj[0]=10;
                obj[1]=true;
                obj[2]="priyanka";
                
                System.out.println(obj[1]);
                
                
           

	}

}
