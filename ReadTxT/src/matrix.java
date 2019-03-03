
public class matrix {
	
	public static void main (String [] args)
	{
		int [][] matrix = new int [10][10];
		//even = par   ; odd = impar
		int counterEven=0, counterOdd=0,counter7=0;
		for (int i = 0 ; i < 10 ; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				int random = (int) (Math.random()*99);
				matrix[i][j] = random;
				if(matrix[i][j] % 2 == 0)counterEven++;
				if(matrix[i][j] % 2 != 0)counterOdd++;
				if(matrix[i][j] % 7 == 0)counter7++;
				System.out.print("[" + matrix[i][j] + "]\t");
			}
			System.out.println();
		}
		System.out.println("Numbers even:\t\t" + counterEven
						+ "\nNumbers odd:\t\t" + counterOdd
						+ "\nnumber multiples of 7:\t"+counter7);
	}
}
