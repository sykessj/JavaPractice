package site_ratings;

import java.util.ArrayList;

public class MainSystem {
	
	//Main method for the system
	
	public void currentSiteInfo(ArrayList regions){
		// For loop to get each region
				for (int f = 0; f < regions.size(); f++) {
					Region current_region = (Region) regions.get(f);
					// For loop to get each site
					for (int i = 0; i < current_region.get_size(); i++) {
						Site current_site = current_region.get_site(i);
						System.out.println(current_site);
					}
				}
		
	}
	
	public boolean checkDate(String date){
		if(date == "30/12"){
			return true;
		}else {
			return false;
		}
		
	}
	
	public void updateRecords(ArrayList regions, ArrayList prioritySites){
		// If function for to check if the date is december 30th
				
					System.out.println(" ");
					System.out.println("Date is December 30th // Starting System");
					System.out.println("");
					// For loop to get current region
					for (int f = 0; f < regions.size(); f++) {
						Region current_region = (Region) regions.get(f);
						// for loop that gets each site and prints it
						// If the site is rated bronze it is added to the priority
						// arrayList
						for (int i = 0; i < current_region.get_size(); i++) {
							Site current_site = current_region.get_site(i);

							current_site.getLatestVisitorCount();
							System.out.println("Updated Record: " + current_site);

							String siteRating = current_site.getSite_rating();

							if (siteRating == "Bronze") {
								prioritySites.add(current_site);
							}

						}
					}
					// Lists the Priority Sites
					System.out.println("");
					System.out.println("Priority Sites");

					for (int i = 0; i < prioritySites.size(); i++) {
						System.out.println(prioritySites.get(i));
					}

				} 

}
