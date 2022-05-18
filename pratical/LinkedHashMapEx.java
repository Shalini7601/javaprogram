import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer , String> map = new LinkedHashMap<Integer , String>();
		map.put(101, "Mango");
		map.put(102, "Orange");
		map.put(103, "Apple");
		map.put(104, "Banana");
		map.put(102, "Orange");//duplicate entry
		map.put(null, null);// null entry
		map.put(108, null);// null value
		map.put(null, null);
		map.putIfAbsent(108, "CustardApple");// 108 was mapped with null value , update 108
		map.putIfAbsent(101,"Watermelon");//101 is already mapped with value
		

		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() +  " " + m.getValue());
		}
		

	}

}