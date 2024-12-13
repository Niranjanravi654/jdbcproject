package sproblems;
import java.util.Scanner;

public class Eveorodd {
	public static void main(String[]args) {
		Scanner e=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=e.nextInt();
		if(n%2==0) {
			System.out.println("It is even number");
		}
		else {
			System.out.println("It is odd number");
		}
		
	}

}
