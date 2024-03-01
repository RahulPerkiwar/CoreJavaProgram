package BasicjavaPrep;

public class Calculator {
	
	
	public int getSum(int num1, int num2)
	{
		int result = num1+num2;
		return result;
	}
	
	public int getSub(int num1, int num2)
	{
		
		return num1-num2;
	}
	
	public int getMulti(int num1 , int num2)
	{
		
		return num1*num2;
	}
	
	
	public int getDiv(int num1,int num2)
	{
		
		return num1/num2; 
	}
	
	
	public static void main(String[]args)
	{
		Calculator calc = new Calculator();
		
		 int i = calc.getSum(10, 9);//19
		 
		 System.out.println("The sum is : "+i); // summation
		 
		 int i2 = calc.getSub(14, 6);//8
		 
		 System.out.println("The sub is : "+i2);//substraction
		 
		 int i3 = calc.getMulti(15, 12);//180
		 
		 System.out.println("The Multi is : "+i3);//multiplication
		 
		int i4 = calc.getDiv(49, 7);//7
		
		System.out.println("The Div is : "+i4);//division
		
	}
	

}
