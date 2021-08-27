import java.util.*;
public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> i = new HashMap<Integer,String>();
		i.put(1, "pooja");
		i.put(2, "sima");
		i.put(3, "pooja");
		System.out.println(i);
		i.getClass();
		System.out.println("size : "+i.size());
		System.out.println("isEmpty : "+i.isEmpty());
		System.out.println("keySet : "+i.keySet());
		System.out.println("getOrDefault : "+i.getOrDefault(2,""));
		System.out.println("getOrDefault : "+i.getOrDefault(i, null));
		System.out.println("putIfAbsent: "+i.putIfAbsent(3,"nisha"));
		
		
		Set<Integer> keys = i.keySet();
		
	
	for(int item : keys)
		{
			System.out.print(item+""+i.get(item));
		}
		

	}

}
