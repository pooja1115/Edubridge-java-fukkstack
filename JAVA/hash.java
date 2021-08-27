import java.util.*;

import java.util.Set;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> i = new HashMap<Integer,String>();
		i.put(1, "pooja");
		i.put(2, "sima");
		i.put(3, "pooja");

		Set<Integer> keys = i.keySet();//only retrive set/print set
		
	
	for(int item : keys)
		{
			System.out.println(item + " "  +i.get(item));
		}
		
	/*Set<Map.Entry<Integer,String>> keys = i.entrySet();//for mapping/print set
	for(Map.Entry<Integer,String> item : keys)
	{
		System.out.println(item.getKey() + " "  +item.getvalue());
		
	}*/

	}

}
