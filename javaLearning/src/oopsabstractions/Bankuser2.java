package oopsabstractions;

public class Bankuser2 {

	public static void main(String[] args) {
		
		
    RBI obj=null;//non primitive
    String bank= "HDFC";
    
    if (bank.equals("ICICI"))
    {
    	obj= new ICICI();
    	
    }else if (bank.equals("PNB"))
    	
    {
    	obj= new PNB();
    	
    }else if(bank.equals("HDFC"))
    	
    {
    	obj=new HDFC();
    }
    
	
	obj.moneyTransfer();
	obj.loan();
	obj.internetBanking();
	


	}

}
