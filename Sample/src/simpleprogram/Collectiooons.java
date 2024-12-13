package simpleprogram;
import java.util.ArrayList;

public class Collectiooons {
	
	public static void main(String[]args) {
		ArrayList<String> color=new ArrayList<String>();
		color.add("pink");
		color.add("red");
		color.add("blue");
		color.set(0, "white");
		color.remove(1);
		System.out.println(color);
		System.out.println(color.get(0));
	}
	
	

}
