package BasicjavaPrep;

public class WrapperClass {
	
	
	public static void main(String[]args)
	{
		
		int a = 9;
		
		Integer obj;
		obj = a;
		
		System.out.println(a);//9
		System.out.println(obj);//9
		
		Integer obj1 = new Integer(3);
		
		int x;
		
		x = obj1;
		System.out.println(obj1);
		System.out.println(x);
		
		
	}

}
