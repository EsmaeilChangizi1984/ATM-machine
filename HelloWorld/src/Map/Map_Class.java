package Map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class Map_Class {

	public static void main(String[] args) {
		
		//Map<Key,Value>map = new Map<>();
		Map<Integer,String>map1 = new HashMap<>();
		Map<Integer,String>map2 = new TreeMap<>();
	    //Map<Integer,String>map3 = new EnumMap<>();
		Map<Integer,String>map4 = new LinkedHashMap<>();
		Map<Integer,String>map5 = new WeakHashMap<>();
		
		//Insert Element
		map1.put(1, "Canada");
		map1.put(2, "Finland");
		map1.put(3, "Iran");
		
		System.out.println(map1);
		
		
		
		
		
		
		
	}

}
