package sproblems;
import java.util.Scanner;

public class Revnum {
	public static void main(String[]args) {
		Scanner sw=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sw.nextInt();
		int a,i=0,j=0;
		a=n;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println("The reversed number is "+j);
		
	}

}
