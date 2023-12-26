package ashokit;

import java.util.HashSet;

public class UnionOfArraysDemo {
	
private static void PrintUnion(int[]a,int[]b) {
	HashSet<Integer>s=new HashSet<Integer>();
	for(int i=0;i<a.length;i++) {
		s.add(a[i]);
	}
	for(int j=0;j<b.length;j++) {
		s.add(b[j]);
	}
	System.out.println(s);
}
	public static void main(String[] args) {
		int a[]= {4,6,2,9,7};
        int b[]= {1,4,7,5};
        PrintUnion(a,b);
	}}
