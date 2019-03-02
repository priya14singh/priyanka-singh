package javaLearning;

public class PrintCommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 10, 9, 8, 2 };
		//int arr2[] = { 2, 3, 4, 8 };

		for (int i = 0; i < arr1.length; i++) {
			//for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]>arr1[i+1])
					System.out.println(arr1[i]);
			}

		}

	}

