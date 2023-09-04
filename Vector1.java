package test;

import java.util.*;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.HashMap;

public class Vector1 {

		public static void main(String[] args) {
			
			Vector<Integer> v=new Vector<>()	;		
			v.add(2);
			v.add(3);
			v.add(4);
			v.add(5);

			System.out.println(v);
			System.out.println(v);
			System.out.println(v);


			v.add(5);
			System.out.println(v.get(1));
			System.out.println(v);
			int indexOf = v.indexOf(1);
			System.out.println(indexOf);

		//	v.removeIf(n->n.contains(4));

			System.out.println(v);
			v.set(1, 7);
			System.out.println(v);

			System.out.println(v.size());

			Map<Character, Integer> m=new LinkedHashMap<>();

			m.put('e',99);
			m.put('a', 32);
			m.put('s', 90);
			m.put('d', 95);
			m.put('c', 98);
			m.put('a', 70);
			System.out.println(m);

			System.out.println(m.get('d'));

			Set<Entry<Character, Integer>> entrySet = m.entrySet();
			System.out.println(entrySet);

			for(Entry<Character, Integer> o: entrySet) {
			System.out.println(o);
			}

	}

}
