package sproblems;
import java.util.Scanner;

public class Checkarmnum {
	public static void main(String[]args) {
		int n,a,i=0,j=0;
		Scanner am=new Scanner(System.in);
		System.out.println("Enter the number");
		n=am.nextInt();
		a=n;
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if(n==j) {
			System.out.println("It is armsstrong number");
		}
		else {
			System.out.println("It is not a Armstrong number");
		}
	}

}
