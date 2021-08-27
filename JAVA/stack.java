import java.util.*;

public class stack {

	public static void main(String[] args) {
		Stack<Integer>items=new Stack<Integer>();
		items.push(22);
		items.push(55);
		items.push(45);
		items.push(99);
		items.push(1);
		items.push(4);
		System.out.println(items);
		items.pop();
		System.out.println("pop: "+items);
		System.out.println("peek: "+items.peek());
		System.out.println("set: "+items.set(3, 444));
		System.out.println(items);
		System.out.println("get: "+items.get(0));
		System.out.println("capacity: "+items.capacity());
		System.out.println("hashCode "+items.hashCode());
		System.out.println("indexOf "+items.indexOf(1));
		System.out.println("lastIndexOf  "+items.lastIndexOf(444));
		System.out.println("search "+items.search(22));
		System.out.println("get "+items.get(1));
		System.out.println("firstElement "+items.firstElement());
		System.out.println("clone "+items.clone());

	}

}
