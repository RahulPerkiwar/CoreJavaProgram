package BasicjavaPrep;

public class SingletonTest {
	
	private static  SingletonTest instance = new SingletonTest();
	
	private SingletonTest() {
		
		System.out.println("Creating Objet");
		
		
	}
	
	public static SingletonTest getInstance() {
		
		return instance;
		
	}

}
