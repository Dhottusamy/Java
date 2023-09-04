package test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class Vector11 {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<>();
		
		v.add("mama");
		v.add("basa");
		v.add("home");
		v.add(" ");

		System.out.println(v);
		System.out.println(v);
		System.out.println(v);


		v.add("mama");
		System.out.println(v.get(1));
		System.out.println(v);
		int indexOf = v.indexOf(1);
		System.out.println(indexOf);

		v.removeIf(n->n.contains("mama"));

		System.out.println(v);
		v.set(1, "Cat");
		System.out.println(v);

		System.out.println(v.size());

		Map<String, Integer> m=new LinkedHashMap<>();

		m.put("abi", 32);
		m.put("Praveen", 90);
		m.put("Vignesh", 95);
		m.put("Ajith", 98);
		m.put("Akash", 70);
		System.out.println(m);

		System.out.println(m.get("Akash"));

		Set<Entry<String,Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);

		for(Entry<String,Integer> o: entrySet) {
		System.out.println(o);
	}
	}
}

