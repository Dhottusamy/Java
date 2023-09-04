package test;

public class Stringmethods {


	public static void main(String[] args) {
		
       
		
		StringBuffer s= new StringBuffer("mama kabadi club");
//		   
//		StringBuffer append = s.append(a);
//		System.out.println(append);

		int capacity = s.capacity();
		System.out.println(capacity);

		StringBuffer delete = s.delete(0,4);
		System.out.println(delete);

		StringBuffer deleteCharAt = s.deleteCharAt(3);
		System.out.println(deleteCharAt);

		StringBuffer b= new StringBuffer("macha kabadi club");

		int compareTo = s.compareTo(b);
		System.out.println(compareTo);

		boolean equals = s.equals("a");
		System.out.println(equals);
		 
		boolean c = s.isEmpty();
		System.out.println(c);

		int lastIndexOf = b.lastIndexOf("o");
		System.out.println(lastIndexOf);

		int hashCode = b.hashCode();
		System.out.println(hashCode);

		StringBuffer insert = b.insert(2,"z");
		System.out.println(insert);

		int length = b.length();
		System.out.println(length);

		}
		}
