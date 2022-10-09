package org.firstassignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,Long> art = new HashMap <>();
		art.put("Prasanna", 6383087278l);
		art.put("Santhakumar",9865386568l);
		art.put("Jayalakshmi", 9865641052l);
		
		
		
		
		System.out.println(art);
		int size = art.size();
		System.out.println(size);
		Long long1 = art.get(2);
		System.out.println(long1);
		Set<String> keySet = art.keySet();
		System.out.println(keySet);
		Collection<Long> values = art.values();
		System.out.println(values);
		boolean containsKey = art.containsKey("null");
		System.out.println(containsKey);
		Set<Entry<String, Long>> entrySet = art.entrySet();
		System.out.println(entrySet);
		
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry);
			
		}
	}

}
