package test;
class socialmedia {
	String name;
	String bio;
	int followers;
	socialmedia(String n,String b,int f){
		 name=n;
		bio=b;
		followers=f;
		System.out.println("SAM"+" "+"JAI");
	
	}
	void display1() {
	System.out.println(name+" "+bio+" "+followers);}
	public static void main(String args[]) {
		socialmedia s1=new socialmedia("sam","software developer",1000);
		socialmedia s2=new socialmedia("jai","tester",2799);
		s1.display1();
		s2.display1();	
	}
	}