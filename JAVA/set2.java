import java.util.*;
public class set2 {

	public static void main(String[] args) {
	/*HashSet<Integer>  i =new HashSet<Integer>();
	i.add(1);
	i.add(2);
	i.add(3);
	i.add(2);;
	System.out.println(i);
	System.out.println("hashCode  "+i.hashCode());*/
	
	HashSet<String> item = new HashSet<String>();
	 item.add("Student");
	 item.add("pooja");
	 item.add("kanchan");
	 item.add("rupali");
    //System.out.println(item);
	System.out.println("hashCode of student:  "+item.hashCode());
	System.out.println(item.contains("pooja"));
	System.out.println(item.remove("pooja"));
	System.out.println(item.size());
	System.out.println(item.toArray());
	System.out.println(item.getClass());
	System.out.println(item.clone());
	
	
	
	
	for(Object n : item)
	{
		System.out.println(n);
	}
	

}}
