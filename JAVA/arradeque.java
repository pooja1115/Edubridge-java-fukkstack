import java.util.*;

public class arradeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> i =new ArrayDeque<Integer>();
	    i.add(55);
	    i.add(55);
		i.add(553);
		i.add(11);
		i.add(22);
		i.add(2022);
		System.out.println(i);
		System.out.println("size:  "+i.size());
		
		System.out.println(i.isEmpty());
		System.out.println(i.remove(55));
		System.out.println("poll: "+i.poll());
		i.iterator();
		System.out.println("itrator"+i);
		System.out.println("head:"+i.element());
		System.out.println("remov:"+i.remove(3));
		System.out.println(i.size());
		i.offerLast(20);
		System.out.println("offer "+i.offerLast(222));
		
		i.offerFirst(222);
		System.out.println("offer "+i.offerFirst(222));
		System.out.println(i);
		
		
		
		


	}

}
