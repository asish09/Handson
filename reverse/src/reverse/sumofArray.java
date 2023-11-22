package reverse;
//2.Find the Smallest Sum of consecutive Number from given Array.
import java.util.Scanner;
public class sumofArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of inputs in an array");
		int n =sc.nextInt();
		System.out.println("enter the elements of the array");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int low=99999;
		for(int j=0;j<=n;j++)
		{
			int sum=a[j]+a[j+1];
			if(sum<=low)
			{
				low=sum;
			}
		else {
			System.out.println("low"+low);
				
				
			}
		}

	}}


