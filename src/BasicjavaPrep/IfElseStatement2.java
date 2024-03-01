package BasicjavaPrep;

public class IfElseStatement2 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 20); // type casting
		System.out.println(num);

		if (num>10) {
			System.out.println(num + " is greater than 10");
		}
		else if (num<10 && num>5) {
			System.out.println(num + "  between 10 and  15");
		}
		else {
			System.out.println(num + " is less than 10"); // in if else statement if you want use curly bracket so sue otherwise no issue if you not use
		}
	}

}
