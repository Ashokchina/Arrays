package ashokit;

import java.util.Arrays;

public class IntersectionOfArraysDemo {
private static void Printintersection(int[]a,int[]b) {
	int i =0,j =0;
	while(i<a.length&&j<b.length) {
		if(a[i]>b[j]) {
			j++;
		}
		else if(b[j]>a[i]) {
			i++;
		}
		else {
			System.out.print(a[i]+", ");
			i++;
			j++;
		}
	}
}
	public static void main(String[] args) {
		int a[]= {3,1,5,9,6};
		int b[]= {2,3,6,9,7};
		Arrays.sort(a);
		Arrays.sort(b);
		Printintersection(a,b);
	}}