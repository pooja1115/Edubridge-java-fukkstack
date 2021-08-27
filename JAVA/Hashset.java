package collection;
import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer> set =new HashSet<Integer>();
		set.add(22);
		set.add(33);
		set.add(660);
		System.out.println(set);
	
		System.out.println("size  " +set.size());
		System.out.println("isEmpty "+set.isEmpty());
		set.add(55);
	
		System.out.println("clone "+set.clone());
	
		Iterator<Integer> i = set.iterator();
	    while(i.hasNext()) {
	    	System.out.println("set is "+i.next());
	    }
	    System.out.println(set.remove(set));

	}

}
