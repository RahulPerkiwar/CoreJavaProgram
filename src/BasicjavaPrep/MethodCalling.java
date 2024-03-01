package BasicjavaPrep;

public class MethodCalling {
	
	
	
//static component call directly static component
// static mehtod can not give a call to  non static dirctly
// non static method allowed non static as well as static method	
	
	public static void main(String[] args) 
	
	{
	
		MethodCalling m = new MethodCalling();
		m.go();
		go3();
	}
	
	
	public void go()
	{
		System.out.println("Inside Go Method");
		go1();
	}
	
	public void go1()
	{
		System.out.println("Inside Go1 Method");
		go2();
	}
	
	public void go2()
	{
		System.out.println("Inside Go2 Method");
		
	}
	
	public static void go3()
	{
		System.out.println("Inside Go3 Method");
		
	}

}
