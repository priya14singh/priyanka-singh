package arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		String[][] str=new String[3][2];
		
		//Row1
		
		str[0][0]="user1";
		str[0][1]="pass1";
		
		//row 2
		
		str[1][0]="user2";
		str[1][1]="pass2";
		

     //row 3
		
		str[2][0]="user3";
		str[2][1]="pass3";
		
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<2; c++)
			{
				System.out.println(str[r][c]);
				

			}
		}
		

	}

}
