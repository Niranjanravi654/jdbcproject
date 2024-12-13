package simpleprogram;

public class Daughter extends Father{
	public void makeup() {
		System.out.println("I want lipstick");
	}
	public static void main(String[]args) {
		Daughter obj=new Daughter();
		obj.makeup();
	}

}
