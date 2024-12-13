package simpleprogram;

import java.util.LinkedList;

public class Rraylist {
	public static void main(String[]args) {
		LinkedList<String> color=new LinkedList<String>();
		color.add("pink");
		color.add("red");
		color.add("blue");
		color.set(0, "white");
		color.remove(1);
		color.addFirst("green");
		color.addLast("indigo");
		color.removeFirst();
		color.removeLast();
		System.out.println(color);
		System.out.println(color.get(0));
	}
	
	

}
