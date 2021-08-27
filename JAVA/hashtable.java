import java.util.*;
public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> i= new Hashtable<Integer,String>();
		i.put(101, "pooja");
		i.put(111, "nikita");
		i.put(103, "seema");
		i.put(333, "erica");
		
		System.out.println(i);
		System.out.println(i.put(112, "komal"));
		System.out.println(i.size());
		System.out.println(i.values());
		System.out.println(i.replace(111, "tony"));
		System.out.println(i.replace(101, "riya"));
		System.out.println(i);
		System.out.println(i.keySet());
		System.out.println(i.containsKey(222));
		System.out.println(i.remove(333));
		System.out.println(i.toString());

	}

}
