package Exceptions;

public class Arrayindex {

	public static void main(String[] args) {
		int a[]=new int[10];
		try {
			a[15]=45;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bounds exception");
		}
	}
	}
