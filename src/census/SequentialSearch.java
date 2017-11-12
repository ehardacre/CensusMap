package census;

import java.util.Scanner;

public class SequentialSearch implements VersionInterface{
	
	float maxLat = 181;
	float minLat = -181;
	float maxLon = 181;
	float minLon = -181;
	
	public SequentialSearch(CensusData data){
		
		CensusGroup[] allData = data.getAllData();
		for(int i = 0; i < allData.length; i++){
			float lat = allData[i].getLatitude();
			float lon = allData[i].getLongitude();
			if(lat > maxLat){ maxLat = lat; }
			if(lat < minLat){ minLat = lat; }
			if(lon > maxLon){ maxLon = lon; }
			if(lon < minLon){ minLon = lon; }
		}
		
		//Requesting input from user
		while (true){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the coordinates of the area you would like to search: ");
		}
	}

	@Override
	public int getPopulation(int west, int south, int east, int north) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
