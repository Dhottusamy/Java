package test;

import java.util.HashMap;

//import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
//import java.util.TreeMap;

public class animal {

	//@SuppressWarnings("unchecked")
	//public class IdentityHashMapRemoveExample1{
	public static void main(String[] args) {
		//@SuppressWarnings("unused")
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("sam",100);
		map.put("vijay",95);
		map.put("bass",97);
		map.put("ashok",96);
		map.put("ashok",70);
		for(Entry<String, Integer> m:map.entrySet())
		{
		System.out.println("get ashok score"+map.get("ashok"));
		}

	}

}
