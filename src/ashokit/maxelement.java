

package ashokit;

import java.util.Scanner;

public class maxelement {
private static void maxofanelement() {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter noof element");
	int size=sc.nextInt();
	int[]arr=new int[size];
	size=arr[0];
	for(int i=1;i<size;i++) {
		System.out.println("enter index element"+i);
		arr[i]=sc.nextInt();
		if(arr[i]>size) {
			size=arr[i];
			
		}
	}
	
}
	public static void main(String[] args) {
		
		

	}

}
