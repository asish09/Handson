package reverse;
//6. Print the repeated characters in a String
import java.util.Scanner;
public class repeatedString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  a string");
		String st=sc.nextLine();
		//char[] p=st.toCharArray();
		int k=0,i,j;
		for(i=0;i<st.length();i++)
		{
			for(j=i+1;j<st.length();j++) {
				if(st.charAt(i)==st.charAt(j))
				{
					System.out.println("repeated character is "+st.charAt(j)+" "+k);
					k++;
					break;
					
					
				}
				}
			}
		}
		
	}
