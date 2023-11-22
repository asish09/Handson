package Exceptions;

public class Arithmetic {

		public static void main(String[] args) {
			try {
				int i=100/0;
			}
			catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("arithmetic exception");
			}
		}
	 
	}