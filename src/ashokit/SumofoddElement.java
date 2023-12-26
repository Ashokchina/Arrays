 package ashokit;

import java.util.Scanner;

public class SumofoddElement {
private static void  oddelement(){
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<size;i++) {
		System.out.println("Enter index element"+i);
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for (int i=0;i<size;i++) {
		if(arr[i]%2==1) {
			sum+=arr[i];
		}}
	System.out.println("Enter index element"+sum);
}
	public static void main(String[] args) {
		oddelement();

		}}
