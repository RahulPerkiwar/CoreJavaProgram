package BasicjavaPrep;

public class Class_Demo {
	
	
	public static void main(String[]args)
	{
		
		
		Car maruti =new Car();
		Car  tata = new Car();
		Car  mahindra = new Car();
		
		System.out.println("***************");
		
		maruti.model="Brezza";
		maruti.cost=1200000;
		maruti.color="Black";
		maruti.Start_Car();
		maruti.Stop_Car();
		maruti.car_Details();
      System.out.println("***************");
      
		tata.model="Tiago";
		tata.cost=800000;
		tata.color="white";
		tata.Start_Car();
		tata.Stop_Car();
		tata.car_Details();
		
	System.out.println("***************");
		
		mahindra.model="SUV800";
		mahindra.cost=2200000;
		mahindra.color="Red";
		mahindra.Start_Car();
		mahindra.Stop_Car();
		mahindra.car_Details();
	}
}
	
 class Car{
		
	 
	 String model;
	 int cost;
	 String color;
	 
	 public void Start_Car()
	 {
		 
		 System.out.println(model+ "car started");
	 }
	 
	 public void Stop_Car()
	 {
		 
		 System.out.println(model+ "car Stopped");
	 }
	 
	 public void car_Details()
	 {
		 
		 System.out.println("The care model is :"+model);
		 System.out.println("The cost of car is :"+cost);
		 System.out.println("The color of car is :"+color);
	 }
		
	}


