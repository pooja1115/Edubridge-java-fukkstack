import java.util.LinkedList;

public class linklist {

	public static void main(String[] args) {
		LinkedList <Integer>items=new LinkedList<Integer>();
		items.add(55);
		items.add(553);
		items.add(11);
		items.add(22);
		
		items.addFirst(22);
		items.addLast(99);
		System.out.println(items);
		items.getFirst();
		System.out.println("First elements : "+items.getFirst());
		items.lastIndexOf(items.lastIndexOf(22));
		items.isEmpty();
		System.out.println(items.isEmpty());
		
		
		System.out.println("index of 22 : "+items.lastIndexOf(22));
		items.get(2);
		System.out.println(" 2 position ele: "+items.get(2));
		items.clone();
		System.out.println("clone"+items);
		items.contains(11);
		System.out.println(items);

	}

}
