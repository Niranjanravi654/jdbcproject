package sproblems;

public class Abs extends Abst {
	public void tiger() {
		System.out.println("Growlss..");
	}
	public void deer() {
		System.out.println("Roars..");
	}
	public static void main(String[]args) {
		Abs obj=new Abs();
		obj.tiger();
		obj.deer();
		obj.Animal();
		
	}

}
