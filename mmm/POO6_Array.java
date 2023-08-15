package mmm;

import java.util.Scanner;

public class POO6_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int index = 0; index < a.length; index++) {
			System.out.println(a[index]);
		}

		int sum = 0;
		for (int index = 0; index < a.length; index++) {
			sum = sum + a[index];
		}
		System.out.println(sum);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int index=0;index<arr.length;index++) {
			System.out.print("enter element at arr["+index+"] : ");
			arr[index]  = sc.nextInt();
		}
		System.out.println("enter number to search in array : ");
		int num = sc.nextInt();
		int counter=0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == num) {
				counter++;
			}
		}
		if(counter>0) {
			System.out.println("yes "+num+" is exists "+counter+" times");
		}
		else {
			System.out.println("no");
		}
	}
}