package reverse;
//1.Check Two String which are reverse of each other or not.
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String st=sc.nextLine();
		int n=st.length();
		System.out.println("enter the other string");
		String str=sc.nextLine();
		int na=str.length();
		String ch="";
		char ch1;
		int i;
		if(n==na)
		{
		for(i=n-1;i>=0;i--)
		{
			ch1=st.charAt(i);
			ch=ch+ch1;
		}}
		if(ch.equals(str))
		{
			System.out.println("both string are reverse of each other"+" "+ch);
		}
		else {
		System.out.println("not reverse");
		}
		
		
		

	}}


