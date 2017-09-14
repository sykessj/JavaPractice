package site_ratings;

import java.util.Random;

public class Site {

	// saves name of site
	// has a random number generator for visiors in previous year.

	// Paramaters

	private String Site_name;
	private int Site_visitors;
	private String rating;

	// Constructor

	public Site(String n, int v) {
		this.setSite_name(n);
		this.setSite_visitors(v);
		this.setSite_rating(generateRating(Site_visitors));

	}

	public Site() {
		Site_name = "????";
		Site_visitors = 0;
		rating = "????";
	}

	// Setters and Getters

	public String getSite_name() {
		return Site_name;
	}

	public void setSite_name(String site_name) {
		Site_name = site_name;
	}

	public int getSite_visitors() {
		return Site_visitors;
	}

	public void setSite_visitors(int site_visitors) {
		Site_visitors = site_visitors;
	}

	public String getSite_rating() {
		return rating;
	}

	public void setSite_rating(String site_rating) {
		rating = site_rating;
	}

	public void getLatestVisitorCount() {
		Random rn = new Random();
		int visitors = rn.nextInt(50000) + 1000;
		Site_visitors = visitors;
		rating = generateRating(Site_visitors);
	}

	public String generateRating(int Site_visitors) {
		if (Site_visitors <= 10000) {
			rating = "Bronze";
		} else if ((Site_visitors > 10000) && (Site_visitors <= 30000)) {
			rating = "Silver";
		} else if (Site_visitors > 30000) {
			rating = "Gold";
		}
		return rating;

	}

	public String toString() {
		return "Name: " + Site_name + " -- Visitors: " + Site_visitors + " -- Rating: " + rating;
	}

}
