package BasicjavaPrep;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ComparisonTest {
	
	
	public static void main(String[] args) {
		
		
		
		String name1 ="RahulRuta";
		String name2 = "RahulRuta";
		
		String name_1 = new String("RahuRuta1");
		String name_2 = new String("RahulRuta1");
		
		int x = 30;
		int y = 30;
		
		/*
		 * System.out.println(name1==name2);//true
		 * System.out.println(name1.equals(name2));//true
		 * 
		 * System.out.println(x==y);
		 */
		
		
		/*
		 * System.out.println(name_1.equals(name_2));
		 * System.out.println(name_1==name_2);
		 */
		
		
		SingletonTest s = SingletonTest.getInstance();
		SingletonTest s2 = SingletonTest.getInstance();
		
		
	}
	
	

}
