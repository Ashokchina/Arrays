package ashokit;

import java.util.Scanner;

public class SortingArrayDemo {
private static void SortArray(int[]arr) {
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("After sorting....");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" " );
	}
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter array size");
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element index:"+i);
			arr[i]=sc.nextInt();
		}
SortArray(arr);
	}

}
