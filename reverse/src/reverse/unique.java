package reverse;
//Find the unique Character in the String
import java.util.Scanner;

public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String st=sc.nextLine();
		int n=st.length();
		for(int i=0;i<n;i++)
		{
			int k=0;
			for(int j=0;j<n;j++) {
				if((st.charAt(i)==st.charAt(j))&&(i!=j)) {
					k=1;
					
				}
			}
				if(k==0) {
					System.out.println("unique character"+st.charAt(i));
				}

		}

	}
	}
