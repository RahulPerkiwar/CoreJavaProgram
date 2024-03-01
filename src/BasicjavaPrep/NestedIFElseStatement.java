package BasicjavaPrep;

public class NestedIFElseStatement {

	public static void main(String[] args) 
	{
		
		String username = "RahulRuta";
		String Pass = "Ammu@2006";
		
		if(username == "RahulRuta") 
		
			if(Pass =="Ammu@2006") {
				
				System.out.println("You have Sucessfully Logged in the application");
			}
			
			else {
				
				System.out.println("You have enterd wrong Password");
			}
			
			else {
				
				System.out.println("You have enterd wrong Username");
			}
		}

	}


