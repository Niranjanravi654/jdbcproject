package simpleprogram;
import java.util.LinkedList;
import java.util.List;

public class Linkklisstt2 {
	public static void main(String[]args) {
		List<String> obj=new LinkedList();
		obj.add("Yellow");
		obj.add("Blue");
		obj.addFirst("Red");
		obj.addLast("Green");
		obj.removeFirst();
		obj.removeLast();
		System.out.println(obj);
		
	}

}
