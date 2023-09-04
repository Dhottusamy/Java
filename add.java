package test;
class add
{
 public void printadd ()
 {
   System.out.println("add is class");
 }
}
 
class mul extends add
{
 public void printmul()
 {
   System.out.println("mul class has inherited add class");
 }
}
 
class div extends mul
{
 public div()
 {
   System.out.println("Inside the div Class");
 }
 
  public void printdiv()
 {
   System.out.println("div class has inherited mul class");
 }
}
 
class persant extends mul
{
 public persant()
 {
   System.out.println("Inside the persant Class");
 }
 
 public void printpersant()
 {
   System.out.println("div class has inherited mul class");
 }
 public static void main(String[]args)
 {

	    div obj = new div();
	    obj.printdiv();      
	    obj.printmul();
	    obj.printadd();
	  
	      persant obj2 = new persant();
	    obj2.printpersant();  
	    obj2.printmul();   
	    obj2.printadd();   
 }
}