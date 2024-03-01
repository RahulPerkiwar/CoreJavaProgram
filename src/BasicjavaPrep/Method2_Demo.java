package BasicjavaPrep;

public class Method2_Demo {
	
	// instance variable---- declare class body
	//local variable----- declare inside method body
	
	int i = 10; // instance variable --- global variable
	//this variable belongs to instance of this class
	
	public void objectcreate()
	{
		
		
		Method2_Demo m = new Method2_Demo();//m --> object i = 10
		m.i++;
		
		Method2_Demo m1 = new Method2_Demo();//m1--> object i =10
		m1.i++;
		
		Method2_Demo m2 = new Method2_Demo();//m2 --> object i =10
		m2.i++;
		
		
		System.out.println(m2.i);//10
		 
	}

}
