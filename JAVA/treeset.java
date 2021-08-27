import java.util.*;
public class treeset {



		public static void main(String[] args) {
			TreeSet<Integer>  i =new TreeSet<Integer>();
			i.add(111);
			i.add(22);
			i.add(3);
			i.add(44);
			System.out.println(i);
		
			System.out.println(i.first());
			System.out.println("size - "+i.size());
			System.out.println(i.ceiling(222));
			System.out.println(i.getClass());
			System.out.println(i.descendingSet());
		
			System.out.println(i);
			

	}

}
