package com.example;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String r=sc.nextLine();
		System.out.println("Enter another string");
		String re=sc.nextLine();
	
		int l=r.length();
		int le=re.length();
		String ch="";
		char ch1;
		for(int i=0;i<r.length();i++) {
			ch1=r.charAt(i);
			ch=ch1+ch;
			}
		if(ch.equals(re))
		{
			System.out.println("Reverse");
			}
		else {
			System.out.println("not reverse");
		}
	}
}


