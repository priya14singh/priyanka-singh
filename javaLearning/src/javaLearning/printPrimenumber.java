package javaLearning;

public class printPrimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int arr[]= {2,6,5,7,11,44,46};

for(int index=0;index<arr.length;index++)
{
	if(arr[index]%2!=0) {
		System.out.println("prime number is:" + arr[index]);
		
			
	}
	
	
	if(arr[index]%2==0) {
		System.out.println("not prime number:" + arr[index]);
	}
}	
}

	

}
