package sproblems;

public class Countpalind {
	public static void main(String[]args) {
		int c=0;
		for(int n=1;n<=1000;n++) {
			int a,i=0,j=0;
			a=n;
			while(a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if(n==j) {
				c=c+1;
			}
		}
		System.out.println(c);
	}

}
