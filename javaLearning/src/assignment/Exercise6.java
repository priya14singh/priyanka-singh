package assignment;

public class Exercise6 {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		/*System.out.println("original array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();*/
		System.out.println("array in reverse");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
