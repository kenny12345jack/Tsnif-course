package first;

import java.util.Arrays;
import java.util.Scanner;

public class equals {
	public static void main(String[] args) {
		//String arr[]= {"learn","coding"};
		//for(String a:arr) {
		//System.out.println(a);
		int a[]=new int[5];
		int a2[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array 1 data");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
	}
		System.out.println("Enter array 2 data");
		for(int i=0;i<a.length;i++) {
			
			a2[i]=sc.nextInt();
	}
		boolean b=Arrays.equals(a,a2);
		System.out.println(b);
		}

	

}
