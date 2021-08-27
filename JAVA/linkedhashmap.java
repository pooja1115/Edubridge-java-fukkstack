import java.util.*;
public class linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> i = new LinkedHashMap<Integer,String>();
		i.put(1, "pooja");
		i.put(2, "sima");
		i.put(3, "pooja");
		
		Set<Map.Entry<Integer,String>> keys = i.entrySet();
		for(Map.Entry<Integer, String> item:keys)
		{
			System.out.println(item.getKey() +  "  " + item.getValue());
		}
		System.out.println(i.size());
		System.out.println(i.keySet());
		
		
		

	}

}
