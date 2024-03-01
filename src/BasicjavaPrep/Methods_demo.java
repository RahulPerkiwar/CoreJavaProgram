  package BasicjavaPrep;

public class Methods_demo {
	
	
	public static void main(String[]args) {
		
		int a = 6 , b = 5, c;
		
		c= a+b;
		
		System.out.println("The sum of a and b is "+c);
		
		//Implement Method calling concept
		// copy method name
		
		methodA(); // method calling statement
		//methodB();// method calling statement
		
	
	}
	
	// create more  method in a class but not executed without main method so will problem overcome by using method calling concept
	
	public static void methodA()
	{
		
		System.out.println("Inside the method A");
		methodB();
		
	}	public static void methodB()
		{
			
			System.out.println("Inside the method B");
			
		}
	
	

}
