package first;
import java.util.Arrays;
public class equalsme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		if(a==b) { //this will compare only references not values
			System.out.println("both are equals");
		}
		else {
			System.out.println("both are not equals");
		}
	

	if(Arrays.equals(a,b)) { //this will compare only values not references
		System.out.println("both are equals");
	}
	else {
		System.out.println("both are not equals");
	}
}
}
