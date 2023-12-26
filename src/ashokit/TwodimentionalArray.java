package ashokit;

import java.util.Scanner;

public class TwodimentionalArray {
private static void multiplyTheTwoMatrices(int[][]a,int[][]b,int n1,int m1,int n2,int m2) {
	int[][]c=new int[n1][m2];
	for(int i=0;i<n1;i++) {
		for(int j=0;j<m2;j++) {
			c[i][j]=0;
			for(int k=0;k<m1;k++) {
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
	}
	System.out.println("The below are the elements of matrix1");
	for(int i=0;i<n1;i++) {
		for(int j=0;j<m1;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("The below are the elements of matrix2");
	for(int i=0;i<n2;i++) {
		for(int j=0;j<m2;j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("The below are the elements of matrices");
	for(int i=0;i<n1;i++) {
		for(int j=0;j<m2;j++) {
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
}}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the noof rows in matrix1");
		int n1=scan.nextInt();
		System.out.println("enter the noof columns in matrix1");
		int m1=scan.nextInt();
		System.out.println("enter the noof rows in matrix2");
		int n2=scan.nextInt();
		System.out.println("enter the noof columns in matrix2");
		int m2=scan.nextInt();
		if(m1!=n2) {
			System.out.println("Multilication is not possible !!!");
			System.exit(0);
		}
		int[][]a=new int[n1][m1];
		int[][]b=new int[n2][m2];
		System.out.println("Enter elements for matrix1");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<m1;j++) {
				a[i][j]=scan.nextInt();
				
			}
		}
		System.out.println("Enter elements for matrix2");
		for(int i=0;i<n2;i++) {
			for(int j=0;j<m2;j++) {
				a[i][j]=scan.nextInt();
	}
}
		multiplyTheTwoMatrices(a,b,n1,m1,n2,m2);
	}}
