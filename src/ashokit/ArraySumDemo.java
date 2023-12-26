package ashokit;

import java.util.Scanner;

public class ArraySumDemo {
private static void SumOfarrayElements() {
	Scanner sc =new Scanner(System.in);
	System.out.println("please enter size of an array");
	int size=sc .nextInt();
	int[]arr=new int [size];
	for(int i=0;i<size;i++) {
		System.out.println("enter element index"+i);
		arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		System.out.println("sum of array element"+sum);
	}

	public static void main(String[] args) {
		SumOfarrayElements();
	}

}
