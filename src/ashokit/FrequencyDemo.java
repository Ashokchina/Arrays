package ashokit;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyDemo {
private static final int size = 0;
private static void ArrayDuplicate(int[]arr) {
	Arrays.sort(arr);
	int frequency, i,j;
	
	for(i=0;i<size;i++);
	frequency=1;
	for(j=i+1;j<arr.length;j++) {
		if (arr[i]>arr[j]) {
			frequency++;
			
		}
		else {
			break;
		}
	}
i=j-1;
if(frequency>1) {
	System.out.println("element:"+arr[i]+"repeated:"+frequency+"time");
	}}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt() ;
		int[]a=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
			
		}
		ArrayDuplicate(a);
	}
	
}
