package stringclass;

import oops.SmartPhone;
import oops.Telephone;

public class User {

	public static void main(String[] args) 
	{ 
		SmartPhone phone= new SmartPhone();
				phone.internet();
				phone.texting();
				phone.calling();
				
				Telephone p= new Telephone();
				p.calling();

	}

}
