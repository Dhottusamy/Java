package test;

public class twod{

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
	
	int a[][]= {{1,4},{3,4},{6,6}};
	
	int b[][]= {{1,4},{3,4},{6,4}};
	
	int c[][]= {{8,4},{3,7},{6,4}};
	int commoncount=0;
	for(int i=0;i<3;i++) 
	{
		for(int j=0;j<2;j++) 
		{
			if(a[i][j]==b[i][j]&&c[i][j]==b[i][j]){
				System.out.println("commonelements:"+c[i][j]);
			
			//System.out.println(i + " " + j);
			//System.out.print(c[i][j]);
			
				commoncount=commoncount+(c[i][j]);
		}
		}
	}

System.out.println("sum of commonelements:"+commoncount);
}
}
