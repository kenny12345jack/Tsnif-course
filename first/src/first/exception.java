package first;

public class exception{
	public static void main(String[] args) {
		try {
			throw new NullPointerException("hello");
			
	}
		catch(Exception e) {
			System.out.print("a");
		}
}
}