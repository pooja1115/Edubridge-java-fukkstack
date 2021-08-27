import java.util.*;
public class queue2 {
	public static void main(String[] args) {
	PriorityQueue<Integer> i =new PriorityQueue<Integer>();
    i.add(55);
    i.add(55);
	i.add(553);
	i.add(11);
	i.add(22);
	i.add(222);
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
	System.out.println(i.offer(0));
	Object[] arr=i.toArray();

	for(Object  k: arr) {
	System.out.println(k);
	}

	System.out.print(i);
	
}
}
