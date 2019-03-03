import java.io.*;

public class invert 
{
	public static void main (String []args) throws IOException
	{
		String fileName = "D:\\numbers.txt";
		String invert = ""; 
		try {
			FileReader input = new FileReader(fileName);
			int c = input.read(),counter = 0;
			while (c != -1)
			{
				counter++;
				invert += String.valueOf((char)c);
				c = input.read();
			}	
			input.close();

			String[] numbers = invert.split(",");
			System.out.println("invert Numbers: ");
			for(int i = numbers.length - 1; i >= 0; i--)
			{
				System.out.print(numbers[i]);
			}
		}catch (IOException ex) {}
	}
}
