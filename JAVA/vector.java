import java.util.*;

public class vector {

	public static void main(String[] args) {
		Vector<Integer>items=new Vector<Integer>();
		items.add(55);
		items.add(553);
		items.add(11);
		items.add(22);
		items.add(222);
		System.out.println(items);
		items.add(3, 100);
		System.out.println("remove elemnt: "+items.removeElement(22));
		System.out.println(items);
		System.out.println(items.capacity());
		items.remove(1);
		
		System.out.println("reamove"+items.isEmpty());
		

		
		System.out.println("reamove"+items);
		
		System.out.println("contain "+items.contains(50));
		
		items.elementAt(2);
		System.out.println("position at 2:"+items.elementAt(2));
		
		items.get(3);
		System.out.println("get item:"+items.get(3));
		items.clear();
		
		
		
}
}
