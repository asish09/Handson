package reverse;
//8. Count the no of vowels and constants in a string
import java.util.Scanner;
public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String st=sc.nextLine();
		char[] a=st.toCharArray();
		int n=st.length();
		int v=0,c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
			{
				v++;
			}
			else c++;
				
		}
		System.out.println("No.of vowels "+v);
		System.out.println("No.of consonants "+c);

	}

}
