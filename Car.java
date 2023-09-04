package test;

abstract class Cars {
	public char[] speed;
	public void car()
	{
	System.out.println("class car");	
	}
	public void vehicalType()
	{
		System.out.println("vehical type:car");
	}
}

class maruthi extends Cars {
		public void Car1() {
			System.out.println("class maruthi");
		}
		public void model() {
			System.out.println("model:max400");
		}
		public void speed() {
			System.out.println("max:300");
		}

		}
	
class maruthi800 extends Cars {
		public void maruthi()
		{
			System.out.println("maruthi:800");
		}
		public void model2() {
			System.out.println("leo:12");
		}
		public void speed1()
		{
			System.out.println("speed:1200");
		}
}
public class Car{
	    
	    public static void main(String[]args)
		{
			maruthi800 obj=new maruthi800();
			obj.car();
			obj.model2();
			obj.speed1();
		}
}