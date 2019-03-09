package oopsabstractions;

public class ICICI implements RBI {
	
	
	public void internetBanking() {
		System.out.println("ICICI provides internet banking");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("ICICI provides money tranfer");
		
	}

	@Override
	public void loan() {
		System.out.println("ICICI provide loan");
		
	}

	@Override
	public void demonetization() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loanrecovery() {
		// TODO Auto-generated method stub
		
	}
	

}
