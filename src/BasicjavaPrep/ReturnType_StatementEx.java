package BasicjavaPrep;

public class ReturnType_StatementEx {
	
	
public static void main(String[]args) {
		
		int a = 6 , b = 5, c;
		
		c= a+b;
		
		System.out.println("The sum of a and b is "+c);
		
		
		int x =methodA(); // method calling
		System.out.println("The value of return by method A is "+x);
	}
	
	
	
	public static int methodA()
	{
		
		System.out.println("Inside the method A");
		methodB( 9);
		
		
		return 5; // return calling
		
	}	
	
	public static void methodB(int x) // single parametrization
		{
			
			System.out.println("The value of x is "+x);
			String str=mehtodC(3,6,4.69,'$',"RahulRuta",true );//method calling	
			System.out.println("The return string value is :"+str);
		}
	
	public static String mehtodC(int a, int z, double b, char c, String d, boolean e) //multiple parameterization
	{
		
		System.out.println("The parameter are storing a ="+a+" z="+z+" b="+b+" c="+c+" d="+d+" e="+e);
		
		return "The End";
	}
	

}
