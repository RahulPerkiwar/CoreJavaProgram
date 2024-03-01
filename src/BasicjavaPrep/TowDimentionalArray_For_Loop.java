package BasicjavaPrep;

public class TowDimentionalArray_For_Loop {

	public static void main(String[] args) {
		
		int [][] a =  {{6,4,9},{5,6,8}};
		
		
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0; j<a[0].length;j++)
			{
				
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
