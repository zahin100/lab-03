package Exercise4;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData 
{

	public static void main(String[] args) 
	{
		
		// 1. Declare output files
		String outputFileLadangSgBharu = "rainfallDataLadangSgBharu.txt";
		String outputFileLadangTebolangTebong = "rainfallDataLadangTebolangTebong.txt";
		String outputFileSgChohong = "rainfallDataSgChohong.txt";
		String outputFileTelokRimba = "rainfallDataTelokRimba.txt";
		String outputFileChengDS = "rainfallDataChengDS.txt";
		String outputFileBatuHampar = "rainfallDataBatuHampar.txt";
		
		
		// Data declaration for outputFileLadangSgBharu
		int stationIdLSB = 2320005;
		int rainfallDataLSB[] = {1, 0, 0, 15, 0, 0};
		
		// Data declaration for outputFileLadangTebolangTebong
		int stationIdLTT = 2423001;
		int rainfallDataLTT[] = {1, 0, 0, 0, 0, 0};
		
		// Data declaration for outputFileSgChohong
		int stationIdSC = 2225044;
		int rainfallDataSC[] = {15, 0, 0, 25, 0, 0};
		
		// Data declaration for outputFileTelokRimba
		int stationIdTR = 2125002;
		int rainfallDataTR[] = {13, 0, 1, 0, 0, 0};
		
		// Data declaration for outputFileChengDS
		int stationIdCD = 2222007;
		int rainfallDataCD[] = {7, 0, 0, 8, 0, 0};
		
		// Data declaration for outputFileBatuHampar
	    int stationIdBH = 2222033;
		int rainfallDataBH[] = {21, 0, 0, 17, 0, 0};
		
		
		try {
			
			// 2. Create stream to write data
			// Output stream for outputFileLadangSgBharu
			DataOutputStream dosLSB = new DataOutputStream(new FileOutputStream(outputFileLadangSgBharu));
			
			// Output stream for outputFileLadangTebolangTebong
			DataOutputStream dosLTT = new DataOutputStream(new FileOutputStream(outputFileLadangTebolangTebong));

			// Output stream for outputFileSgChohong
			DataOutputStream dosSC = new DataOutputStream(new FileOutputStream(outputFileSgChohong));

			// Output stream for outputFileTelokRimba
			DataOutputStream dosTR = new DataOutputStream(new FileOutputStream(outputFileTelokRimba));
			
			// Output stream for outputFileoutputFileChengDS
			DataOutputStream dosCD = new DataOutputStream(new FileOutputStream(outputFileChengDS));
			
			// Output stream for outputFileBatuHampar
			DataOutputStream dosBH = new DataOutputStream(new FileOutputStream(outputFileBatuHampar));
			
			// Process Data
			// 3. Write data into data stream
			dosLSB.writeInt(stationIdLSB);
			dosLTT.writeInt(stationIdLTT);
			dosSC.writeInt(stationIdSC);
			dosTR.writeInt(stationIdTR);
			dosCD.writeInt(stationIdCD);
			dosBH.writeInt(stationIdBH);
			
			for (int i =0; i < rainfallDataLSB.length; i++)
			{
				dosLSB.writeInt(rainfallDataLSB[i]);
				dosLTT.writeInt(rainfallDataLTT[i]);
				dosSC.writeInt(rainfallDataSC[i]);
				dosTR.writeInt(rainfallDataTR[i]);
				dosCD.writeInt(rainfallDataCD[i]);
				dosBH.writeInt(rainfallDataBH[i]);
				
				// 4. Flush for each writing
				dosLSB.flush();
				dosLTT.flush();
				dosSC.flush();
				dosTR.flush();
				dosCD.flush();
				dosBH.flush();
			}
			
			
			// 5. Close the stream
			dosLSB.close();
			dosLTT.close();
			dosSC.close();
			dosTR.close();
			dosCD.close();
			dosBH.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		// Indicate end of program
		System.out.println("Data has been written successfully.");
		

	}
}
