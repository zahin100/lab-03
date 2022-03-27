package Exercise3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		
		// 1. Declare input file 
		String sourceFile = "rainfallData.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		
		
		
		try {
			
			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
			
			
			int rainData = 0;
			double totalRainData = 0;
			int day = 1;
			
			System.out.println(" 6 days reading of daily rainfall of station Cheng (Taman Merdeka)");
			
			// 3. Process data until end-of-file
			while(dis.available() > 0) 
			{
				
				// Read data
				rainData = dis.readInt();
				System.out.println( "Day " + day + " : " + "\t" + rainData);
				
				// Calculate total rain data
				totalRainData += rainData;
				day ++;
			}
			
			
			// 4. Close stream
			dis.close();
			
			
			// Calculate average rainfall
			double average = totalRainData / 6;
			System.out.println("Average rainfall : " + average);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		// Indicate end of program.
		System.out.println("End of program");
		

	}
}
