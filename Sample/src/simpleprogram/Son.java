package simpleprogram;

public class Son extends Father {
	public void education() {
		System.out.println("IT");
	}
	public static void main(String[]args) {
		Son raghul=new Son();
		raghul.property();
		raghul.business();
		raghul.education();

}
}
