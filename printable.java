package test;
	import java.util.ArrayList;
import java.util.Collections;
//	import java.util.Collections;  
	import java.util.List;  
	class printable{  
		int id;  
	    String name;  
	    float price;
	    public printable(int id, String name, float price) {  
	        super();  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;
	        }
}
	//public class printable
	//{  
	   // @SuppressWarnings("unchecked")
		public static void main(String[] args) 
	    {
	    List<printable> list=new ArrayList<>();  
	          
	       
	        list.add(new printable(1,"hp laptop",100f)); 
	        list.add(new printable(3,"Keyboard",300f));  
	        list.add(new printable(2,"Dell Mouse",150f));  
	        {
	       System.out.println("before Sorting on the basis of name..."+list);  
	        }
        Collections.sort(list,(p1,p2)->{
              return(p1.name.compareTo(p2.name));
	       for(printable p:list) 
	{
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }  
        }
	    }