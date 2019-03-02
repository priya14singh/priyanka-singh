package javaLearning;

public class ArrayElementSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,3,2,6};
		
		boolean flag=false;
		
		for(int index=0;index<arr.length;index++)
		{
		if(arr[index]==11)
		{
			System.out.println("Number is found");
		flag=true;
	break;
		}
		}
			if(flag==false) {
			System.out.println("Number not found");
	}}}


