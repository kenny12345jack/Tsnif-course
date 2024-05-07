package first;

import java.util.Scanner;
import java.util.Arrays;
public class Copyof {
	public static void main(String[] args) {
		//String arr[]= {"learn","coding"};
		//for(String a:arr) {
		//System.out.println(a);
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array 1 data");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
	}
		int a2[]=Arrays.copyOf(a,6);
		a2[5]=100;
for(int i=0;i<a2.length;i++) {
			
			System.out.println(a2[i]);
	}
}
}
