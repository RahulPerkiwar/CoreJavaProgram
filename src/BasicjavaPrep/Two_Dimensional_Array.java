package BasicjavaPrep;

public class Two_Dimensional_Array {
	
	
	public static void main(String[]args)
	{
		
		//int[][] a = new int[2][3];
		       //Or
		 int [][] a =  {{6,4,9},{5,6,8}};
		
		/*a[0][0] = 6;
		a[0][1] = 4;
		a[0][2] = 9;
		
		
		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 8;*/
		 
	    System.out.println("The length of Array is : "+a.length);
	    System.out.println("The length of 1st Array is : "+a[0].length);
	    System.out.println("The length of 2nd Array is : "+a[1].length);
	    
	    System.out.println("**********************");
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		
		System.out.println("**********************");
		
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		
	}

}
