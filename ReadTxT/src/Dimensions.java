import java.io.*;

public class Dimensions 
{
	public static void main (String []args)
	{
		String fileName = "D:\\dimensions.txt";
		String read = ""; 
		try {
			FileReader input = new FileReader(fileName);
			int c = input.read(),counter = 0;
			while (c != -1)
			{
				counter++;
				read += String.valueOf((char)c);
				c = input.read();
			}	
			input.close();

			String[] dimensions = read.split(";");
			String[] D1 = dimensions[0].split(",");
			String[] D2 = dimensions[1].split(",");
			String[] D3 = dimensions[2].split(",");
			
			int[][][] dimension3 = new int[D1.length][D2.length][D3.length];
			for(int i = 0; i < D1.length; i++)
				dimension3[i][0][0] = Integer.parseInt(D1[i]);
			for(int j = 0; j < D2.length; j++)
				dimension3[1][j][1] = Integer.parseInt(D2[j]);
			for(int k = 0; k < D3.length; k++)
				dimension3[2][2][k] = Integer.parseInt(D3[k]);
			
			for(int i = 0; i < D1.length; i++)
			{
				System.out.println("dimension: " + i+1 + "D");
				for(int j = 0; j < D2.length;j++)
				{
					for(int k = 0; k < D3.length; k++)
					{
						if (dimension3[i][j][k] != 0)
							System.out.print(dimension3[i][j][k] + "\t");
					}
					System.out.println();
				}
				
			}
			
		}catch (IOException ex) {}
	}
}
