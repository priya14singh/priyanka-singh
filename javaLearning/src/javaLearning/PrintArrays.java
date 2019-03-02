package javaLearning;

public class PrintArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {1,2,3,4};
		int[] arr2= {2,3,4};
		int[] arr3= {4,5,6,7,8,9};
		System.out.print("First Array:");
		for(int index=0;index<arr1.length;index++)
		{	
			System.out.print(""+arr1[index]);
		}
		System.out.println();
		System.out.println("**************************");
		System.out.print("Second Array:");
		
		for(int index=0;index<arr2.length;index++)
		{
			System.out.print(""+arr2[index]);
		}
		System.out.println();
		System.out.println("**************************");
		System.out.print("Third Array:");
		
		for(int index=0;index<arr3.length;index++)
		{
			System.out.print(""+arr3[index]);
		}
	}

}
