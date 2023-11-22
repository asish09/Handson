package Exceptions;

public class Nullpointer {

	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("null pointer exception");
		}
	}
 
}