package simpleprogram;

public class Functionsss {
	public static int addNum(int a,int b) {
		int result=a+b;
		
		return result;
	}
	
	public static int subNum(int a,int b) {
		int result=a-b;
		
		return result;
	}
	
	public static void main (String []args) {
		int n1=10;
		int n2=15;
		
		int add1=addNum(n1,n2);
		int sub1=subNum(n1,n2);
		System.out.println(add1);
	
	}

}
