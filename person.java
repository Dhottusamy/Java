package test;

public class person {  
		public static void main(String arg[])
	      {
		
	        char branch = 'C'; 
	        char branch1 = 'E';
	        char branch2 ='m';
	        int bikeyear= 3;
	        switch( bikeyear )
	        {
	            case 1:
	                System.out.println("2stroke,3stroke,bs4,bs6");
	                break;
	            case 2:
	                switch( branch ) 
	                {
	                    case 'C':
	                        System.out.println("suzuki");
	                        break;
	                    case 'E':
	                        System.out.println("yamaha");
	                        break;
	                    case 'M':
	                        System.out.println("tvs");
	                        break;
	                }
	            case 3:
	                switch( branch1 ) 
	                {
	                    case 'C':
	                        System.out.println("rx100");
	                        break;
	                    case 'E':
	                        System.out.println("rx135");
	                        break;
	                    case 'M':
	                        System.out.println("rxz");
	                        break;
	                }
	            case 4:
	                switch( branch2 ) 
	                {
	                    case 'C':
	                        System.out.println("yezdi");
	                        break;
	                    case 'E':
	                        System.out.println("java");
	                        break;
	                    case 'M':
	                        System.out.println("pulser");
	                        break;
	                }
	                default:
	                	System.out.println("give the valid bikeyear");
	               break;
	        }
	    }
	}
