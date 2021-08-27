import java.util.*;
public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer>  i =new LinkedHashSet<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(2);
		System.out.println(i);
		System.out.println("hashCode  "+i.hashCode());
		System.out.println(i.contains(3));
		System.out.println(i.remove(1));
		System.out.println(i.size());
		System.out.println(i.toArray());
		System.out.println(i.getClass());
		System.out.println(i.clone());
		
	}

}
