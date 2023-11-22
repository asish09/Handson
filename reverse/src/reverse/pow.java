package reverse;
//3.Find the Power without using math.pow function.
import java.util.Scanner;
public class pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println("enter the power");
		int m=sc.nextInt();
		int i,power=1;
		for(i=1;i<=m;i++) {
			power=power*n;
		}
		System.out.println("the power is"+power);

	}

}
