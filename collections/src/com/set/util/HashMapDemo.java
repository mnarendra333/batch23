package com.set.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("india", "INR");
		map.put("srilanka", "INR");
		map.put("us", "USD");
		map.put("uk", "POUNDS");
		map.put("kuwite", "DINAR");
		
		
		
		if(map.containsKey("uk")) {
			String value = map.get("uk");
			System.out.println(value);
			if(value.equals("POUNDS"))
				System.out.println("valid");
		}
		
		
		Set<String> keySet = map.keySet();
		if(keySet.contains("uk"))
		
		System.out.println(map);
		
		
		System.out.println(map.size());
		System.out.println(map.containsKey("uk"));
		System.out.println(map.containsValue("DINARdfsdf"));
		
		
		Set<String> keys = keySet;
		System.out.println(keys);
		
		Collection<String> values = map.values();
		System.out.println(values);
		//get both key and value pair
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//
		
		
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			if (entry.getKey().equals("uk")) {
				iterator.remove();
			}
		}
		System.out.println(map);
		
		
		
		
		
		
		
		
		

	}

}
