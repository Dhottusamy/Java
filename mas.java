package test;

public class mas {

	private static final char[] Expection = null;

	public static void main(String[] args) {
		try {
			int i=7/0;
			System.out.println(i);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array IndexOutOfBoundsException");
		}catch(Exception e) {
			System.out.println("default expection");
		}
		finally{
			System.out.println("i'm finally");
		}
	}

}
