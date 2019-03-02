package javaLearning;

public class febonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int N1=0,N2=1,N3,i;
int count=10;
System.out.println("value of N1:"+ N1 );
System.out.println("value of N2:"+ N2);
for(i=2;i<count;i++)// i is used for iterating the loop
{
	N3=N1+N2;
	System.out.println("value of N3:" + N3);
		N1=N2;
		N2=N3;
}
}
	
}
