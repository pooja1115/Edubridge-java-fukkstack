import java.util.*;

public class linked {

	public static void main(String[] args) {
		LinkedList<Integer>  i =new LinkedList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(2);
		System.out.println(i);
		i.addLast(0);
		System.out.println(i);
		
	Iterator<Integer> n = i.descendingIterator();//to reverse list
		while(n.hasNext());
		{
			System.out.println(n.next());
			
		}
		System.out.println(i);
		Collections.reverse(i);
		System.out.println(i);
		
		
		

	}

}
