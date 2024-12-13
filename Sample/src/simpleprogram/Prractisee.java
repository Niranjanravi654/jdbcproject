package simpleprogram;

public class Prractisee {
	public static int divnum(int a,int b) {
		int res=a/b;
		return res;
	}
	
	public static void main(String[] args) {
		
		try {
			int divs=divnum(10,0);
			System.out.println(divs);
		}catch(ArithmeticException e) {
			System.out.println("Dividing my zero not allowed");
		}
	}
	
}
