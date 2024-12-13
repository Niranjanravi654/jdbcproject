package simpleprogram;
import java.util.Scanner;

public class Sca {
	public static void main(String[]args) {
		
		for(int i=1;i<=10;i++) {
			Scanner in=new Scanner(System.in);
			String name=in.nextLine();
			System.out.println("user name is :"+name);
		}
	}
	

}
