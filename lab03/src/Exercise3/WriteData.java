package Exercise3;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData 
{

	public static void main(String[] args) 
	{
		// 1. Declare output file
		String outputFile = "rainfallData.txt";
		
		// Data declaration
				int dailyRainfall[] = {7, 0, 0, 8, 0, 0};
		
		
		try {
			
			// 2. Create stream to write data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile));
			
			// Process data
			for(int i = 0; i < dailyRainfall.length; i++)
			{
				// 3. Write data into data stream
				dos.writeInt(dailyRainfall[i]);
				
				// 4. Flush for each writing
				dos.flush();
				
			}
			
			// 5. Close the stream
			dos.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
		// Indicate end of program.
		System.out.println("Data has been written successfully.");
		
		
	}

}
