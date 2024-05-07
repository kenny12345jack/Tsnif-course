package first;
import java.util.Arrays;
import java.util.List;
public class toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		String b[]= {"code","made"};
		String arr[][]= {{"moon","sun"}};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.asList(a)); //here in this case it returns some address as output ,int string it returns values
		System.out.println(Arrays.asList(b)); //not address only values
		//deepToString() method only works on two dimensinal arrays
		System.out.println(Arrays.deepToString(arr));
	}

}
