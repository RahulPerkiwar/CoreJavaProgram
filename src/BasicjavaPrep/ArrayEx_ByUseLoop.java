package BasicjavaPrep;

public class ArrayEx_ByUseLoop {
	
	
	public static void main(String[]args)
	{
		
		int[] a = {5, 7, 8, 4, 6, 3, 5, 9, 10, 11, 34, 45, 67, 34, 78 ,99, 23, 56, 78,};
		
		//System.out.println("The size of array is : " +a.length); // find length of array
		
		System.out.println("*******************************");
		
		/*for(int i =0; i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}*/
		
		
       for(int temp :a) {
    	   
    	   System.out.println(temp);
    	   
       }
       
       

		
	}

}
