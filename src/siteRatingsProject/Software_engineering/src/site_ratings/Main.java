package site_ratings;

import java.util.ArrayList;
import site_ratings.Site;

public class Main {

	

	public static void main(String[] args) {
		
		MainSystem main = new MainSystem();

		// The current Date
		String date = "30/11";

		// Array list to hold the priority Sites for marketing
		ArrayList<Site> prioritySites = new ArrayList<Site>();

		// Create Regions
		FactoryRegion factory = new FactoryRegion();
		Region london = factory.getRegion("LONDON");
		Region midlands = factory.getRegion("Midlands");
		Region southEast = factory.getRegion("SouthEast");
		Region southWest = factory.getRegion("SouthWest");
		Region northEast = factory.getRegion("NorthEast");
		Region northWest = factory.getRegion("NorthWest");

		// Add regions to array list
		ArrayList<Region> regions = new ArrayList<Region>();
		regions.add(london);
		regions.add(midlands);
		regions.add(northEast);
		regions.add(northWest);
		regions.add(southEast);
		regions.add(southWest);

		// Create Sites

		// London Sites
		Site stoneHenge = new Site("Stone Henge", 45000);
		Site windsorCastle = new Site("Windsor Castle", 10000);
		Site towerOfLondon = new Site("Tower of London", 30000);

		london.add_site(stoneHenge);
		london.add_site(windsorCastle);
		london.add_site(towerOfLondon);

		// Midlands Sites

		Site coventryCathedral = new Site("Coventry Cathedral", 3000);
		Site calkeAbbey = new Site("Calke Abbey", 5000);
		Site wollatonHall = new Site("Wollaton Hall", 6000);

		midlands.add_site(coventryCathedral);
		midlands.add_site(calkeAbbey);
		midlands.add_site(wollatonHall);

		// Northeast Sites

		Site durhamCathedral = new Site("Durham Cathedral", 6000);
		Site beamishMuseum = new Site("Beamish Museum", 1000);
		Site hexhamAbbey = new Site("Hexham Abbey", 8000);

		northEast.add_site(durhamCathedral);
		northEast.add_site(beamishMuseum);
		northEast.add_site(hexhamAbbey);

		// NorthWest Sites

		Site liverpoolCathedral = new Site("Liverpool Cathedral", 31000);
		Site chesterCathedral = new Site("Chester Cathedral", 4000);
		Site walkerArtGallery = new Site("Walker Art Gallery", 16000);

		northWest.add_site(liverpoolCathedral);
		northWest.add_site(chesterCathedral);
		northWest.add_site(walkerArtGallery);

		// SouthEast Sites

		Site heverCastle = new Site("Hever Castle", 19000);
		Site arundelCastle = new Site("Arundel Castle", 9000);
		Site canterburyCastle = new Site("Canterbury Castle", 34000);

		southEast.add_site(heverCastle);
		southEast.add_site(arundelCastle);
		southEast.add_site(canterburyCastle);

		// SouthWest Sites

		Site romanBaths = new Site("Roman Baths", 25000);
		Site salisburyCathedral = new Site("Salisbury Cathedral", 22000);
		Site wellsCathedral = new Site("Wells Cathedral", 11000);

		southWest.add_site(romanBaths);
		southWest.add_site(salisburyCathedral);
		southWest.add_site(wellsCathedral);

		// Print all current sites before update

		main.currentSiteInfo(regions);
		
		Boolean dateCheck = main.checkDate(date);
		
		if(dateCheck == true){

		main.updateRecords(regions, prioritySites);
		
		}
		
		

	}

}
