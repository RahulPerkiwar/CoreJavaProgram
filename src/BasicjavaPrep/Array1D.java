package BasicjavaPrep;

public class Array1D {
	
	
	/*
	 * java array---> object ---> String[]
	 * 
	 */
	
	public static void main(String[]args) {
		
		int[] array = new int[10];
		
		String[] myarray = new String[13];
		
		System.out.println(array.length);// length---=> is final variable
		
		System.out.println(array);
		
		
		array[0] =10;
		array[2] =30;
		array[4] =20;
		
		//System.out.println(array[2]);
		
		for(int index=0; index<array.length; index++) {
			
			System.out.println(array[index]);
		}
	}

}
