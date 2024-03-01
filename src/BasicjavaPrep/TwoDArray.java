package BasicjavaPrep;

public class TwoDArray {
	
	
	public static void main(String[]args) {
		
		
		int[][] myarray =new int[2][3];
		
		myarray[0][0]=1;
		myarray[0][1]=2;
		myarray[0][2]=3;
		
		myarray[1][0]=4;
		myarray[1][1]=5;
		myarray[1][2]=6;

		
		
		//System.out.println(myarray[1][1]);
		//System.out.println(myarray.length);
		
		
		for(int i=0; i<myarray.length;i++) {
			
			for(int j=0; j<myarray[0].length;j++) {
				
				
				System.out.print(myarray[i][j]+" ");
			}
			System.out.println();
		}

}

}