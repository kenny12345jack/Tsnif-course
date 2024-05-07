package first;

import java.util.Scanner;
import java.util.Arrays;
public class sort  {

	public static void main(String[] args) {
		//String arr[]= {"learn","coding"};
		//for(String a:arr) {
		//System.out.println(a);
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
	}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	
}
}
