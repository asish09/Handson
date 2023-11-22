package Exceptions;

class myexception extends Exception {
	myexception(String s) {
		super(s);
	}
}
 
public class Custom_exce {
	public static void main(String[] args) {
 
		try {

 
				throw new myexception("this is my exveption");
		} catch (myexception e) {
			System.out.println("my exception handled");
		}
	}
}