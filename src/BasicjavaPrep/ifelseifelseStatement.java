package BasicjavaPrep;

public class ifelseifelseStatement 

{
	
	public static void main(String[]args)
	{
		
		int a = 6, b = 5, c = 4, d = 3, e = 2;
		
		if(a<b)
		{
			
			System.out.println("a is less than b");
		}
		
		else if (b<c)
		{
			
			System.out.println("b is less than c");
		}
		
		else if(c<d)
		{
			
			System.out.println("c is less than d ");
		}
		
		/*else if(c>d)
		{
			
			System.out.println("c is greater than d ");
		}*/ 
		
		else if(d<e)
		{
			
			System.out.println("d is less than e");
		}
		
		else 
		{
			
			System.out.println("All the above condition are flase");
		}
		
		  
		
	}

}
