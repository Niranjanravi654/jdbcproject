package simpleprogram;
import java.util.ArrayList;
import java.util.List;
public class Arrlist {
	public static void main(String []args) {
		List obj=new ArrayList();
		obj.add("BLue");
		obj.add("green");
		obj.add(2);
//		obj.remove(0);
//		obj.set(0, "teal");
		System.out.println(obj.get(5));
	}

}
