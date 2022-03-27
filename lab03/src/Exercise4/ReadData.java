package Exercise4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData 
{

	public static void main(String[] args) 
	{
		
		// 1. Declare input files
		String LadangSgBharu = "rainfallDataLadangSgBharu.txt";
		String LadangTebolangTebong = "rainfallDataLadangTebolangTebong.txt";
		String SgChohong = "rainfallDataSgChohong.txt";
		String TelokRimba = "rainfallDataTelokRimba.txt";
		String ChengDS = "rainfallDataChengDS.txt";
		String BatuHampar = "rainfallDataBatuHampar.txt";
		System.out.println("Reading data from the source files.");
		
		
		
		try {
			
			// 2. Create stream to read data
			// Input stream for LadangSgBharu
			DataInputStream disLSB = new DataInputStream(new FileInputStream(LadangSgBharu));
			
			// Input stream for LadangTebolangTebong
			DataInputStream disLTT = new DataInputStream(new FileInputStream(LadangTebolangTebong));
			
			// Input stream for SgChohong
			DataInputStream disSC = new DataInputStream(new FileInputStream(SgChohong));
			
			// Input stream for TelokRimba
			DataInputStream disTR = new DataInputStream(new FileInputStream(TelokRimba));
						
			// Input stream for ChengDS
			DataInputStream disCD = new DataInputStream(new FileInputStream(ChengDS));
						
			// Input stream for BatuHampar
			DataInputStream disBH = new DataInputStream(new FileInputStream(BatuHampar));
			
			// 3. Read data
			// Read data for Alor Gajah
			
			int rainDataLSB = 0;
			double totalRainDataLSB = 0;
			int rainDataLTT = 0;
			double totalRainDataLTT = 0;
			int day = 1;
			int countDistrict = 0;
			int countStation = 0;
			
			System.out.println("===========");
			System.out.println("ALOR GAJAH");
			System.out.println("===========");
			countDistrict++;
			System.out.println("Station ID : " + disLSB.readInt());
			System.out.println("Station name : Ladang Sg. Bharu");
			countStation++;
			
			while(disLSB.available() > 0)
			{
				
				// Read data
				rainDataLSB = disLSB.readInt();
				System.out.println( "Day " + day + " : " + "\t" + rainDataLSB);
				
				// Calculate total rain data
				totalRainDataLSB += rainDataLSB;
				day ++;
				
			}
			
			// Calculate average rainfall
			double averageLSB = totalRainDataLSB / 6;
			System.out.println("Average rainfall : " + averageLSB + "\n");
			
			System.out.println("Station ID : " + disLTT.readInt());
			System.out.println("Station name : Ladang Tebolang Tebong");
			countStation++;
			day = 1;
			
			while(disLTT.available() > 0)
			{
				
				// Read data
				rainDataLTT = disLTT.readInt();
				System.out.println( "Day " + day + " : " + "\t" + rainDataLTT);
				
				// Calculate total rain data
				totalRainDataLTT += rainDataLTT;
				day ++;
				
			}
			
			double averageLTT = totalRainDataLTT / 6;
			System.out.println("Average rainfall : " + averageLTT + "\n");
			
			int rainDataSC = 0;
			double totalRainDataSC = 0;
			int rainDataTR = 0;
			double totalRainDataTR = 0;
			day = 1;
			
			System.out.println("===========");
			System.out.println("   JASIN");
			System.out.println("===========");
			countDistrict++;
			System.out.println("Station ID : " + disSC.readInt());
			System.out.println("Station name : Sg. Chohong");
			countStation++;
			
			while(disSC.available() > 0)
			{
				
				// Read data
				rainDataSC = disSC.readInt();
				System.out.println( "Day " + day + " : " + "\t" + rainDataSC);
				
				// Calculate total rain data
				totalRainDataSC += rainDataSC;
				day ++;
				
			}
			
			double averageSC = totalRainDataSC / 6;
			System.out.println("Average rainfall : " + averageSC + "\n");
			
			System.out.println("Station ID : " + disTR.readInt());
			System.out.println("Station name : Telok Rimba");
			countStation++;
			day = 1;
			
			while(disTR.available() > 0)
			{
				
				// Read data
				rainDataTR = disTR.readInt();
				System.out.println( "Day " + day + " : " + "\t" + rainDataTR);
				
				// Calculate total rain data
				totalRainDataTR += rainDataTR;
				day ++;
				
			}
			
			double averageTR = totalRainDataTR / 6;
			System.out.println("Average rainfall : " + averageTR + "\n");
			
			int rainDataCD = 0;
			double totalRainDataCD = 0;
			int rainDataBH = 0;
			double totalRainDataBH = 0;
			day = 1;
			
			System.out.println("=============");
			System.out.println("MELAKA TENGAH");
			System.out.println("=============");
			countDistrict++;
			System.out.println("Station ID : " + disCD.readInt());
			System.out.println("Station name : Cheng D/S");
			countStation++;
			
			while(disCD.available() > 0)
			{
				
				// Read data
				rainDataCD = disCD.readInt();
				System.out.println( "Day " + day + " : " + "\t" + rainDataCD);
				
				// Calculate total rain data
				totalRainDataCD += rainDataCD;
				day ++;
				
			}
			
			double averageCD = totalRainDataCD / 6;
			System.out.println("Average rainfall : " + averageCD + "\n");
			
			System.out.println("Station ID : " + disBH.readInt());
			System.out.println("Station name : Batu Hampar");
			countStation++;
			day = 1;
			
			while(disBH.available() > 0)
			{
				
				// Read data
				rainDataBH = disBH.readInt();
				System.out.println( "Day " + day + " : " + "\t" + rainDataBH);
				
				// Calculate total rain data
				totalRainDataBH += rainDataBH;
				day ++;
				
			}
			
			double averageBH = totalRainDataBH / 6;
			System.out.println("Average rainfall : " + averageBH + "\n");
			
			System.out.println("Total number of districts : " + countDistrict);
			System.out.println("Total number of stations : " + countStation);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
