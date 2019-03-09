package oopsabstractions;

public class PNB implements RBI {
	
	public void internetBanking() {
		System.out.println("PNB provides internet banking");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("PNB provides money tranfer");
		
	}

	@Override
	public void loan() {
		System.out.println("PNB provide loan");
		
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
