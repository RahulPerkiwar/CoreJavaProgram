package BasicjavaPrep;

public class Method_Parameterizations {
	
	
public static void main(String[]args) {
		
		int a = 6 , b = 5, c;
		
		c= a+b;
		
		System.out.println("The sum of a and b is "+c);
		
		//Implement Method calling concept
		// copy method name
		
		methodA(); // method calling
		//methodB( 9);
		//mehtodC(3,6,4.69,'$',"RahulRuta",true );//method calling
	}
	
	
	
	public static void methodA()
	{
		
		System.out.println("Inside the method A");
		methodB( 9);
		mehtodC(3,6,4.69,'$',"RahulRuta",true );//method calling
		
	}	
	
	public static void methodB(int x) // single parametrization
		{
			
			System.out.println("The value of x is "+x);
			
		}
	
	public static void mehtodC(int a, int z, double b, char c, String d, boolean e) //multiple parameterization
	{
		
		System.out.println("The parameter are storing a ="+a+" z="+z+" b="+b+" c="+c+" d="+d+" e="+e);
	}
	
	

}
