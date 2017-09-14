package site_ratings;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class Tests extends TestCase {
	Site testSite;
	Site testSite2;
	Region london;
	
	MainSystem main = new MainSystem();
	ArrayList<Site> prioritySites = new ArrayList<Site>();
	ArrayList<Region> regions = new ArrayList<Region>();

	public void setUp() throws Exception {
		// Create the test site
		testSite = new Site("TEST", 1234);
		testSite2 = new Site("TEST 2", 5678);
		// Create the region
		FactoryRegion factory = new FactoryRegion();

		london = factory.getRegion("LONDON");
		london.add_site(testSite);
		
		
		
		regions.add(london);
		
	}

	// getting the site name
	@Test
	public void testGetSiteName() {

		String name = testSite.getSite_name();
		assertEquals("TEST", name);

	}

	// Getting the site visitors
	@Test
	public void testGetSiteVisitors() {

		int visitors = testSite.getSite_visitors();
		assertEquals(1234, visitors);
	}

	// getting the site rating
	@Test
	public void testGetSiteRating() {
		String rating = testSite.getSite_rating();
		assertEquals("Bronze", rating);
	}

	// Getting the latest site visitor count
	@Test
	public void testGetLatestVisitorCount() {
		int originalCount = testSite.getSite_visitors();
		testSite.getLatestVisitorCount();
		int newCount = testSite.getSite_visitors();
		assertTrue(originalCount != newCount);
	}

	// Test the rating generation method.
	@Test
	public void testGenerateRating() {
		// Test Bronze rating
		int visitors = 5000;
		String rating = testSite.generateRating(visitors);
		assertEquals("Bronze", rating);
		// Test Silver rating
		visitors = 15000;
		rating = testSite.generateRating(visitors);
		assertEquals("Silver", rating);
		// Test Gold rating
		visitors = 35000;
		rating = testSite.generateRating(visitors);
		assertEquals("Gold", rating);
	}

	// REGION TESTS
	//Testing the region size
	@Test
	public void testRegionSize() {
		int size = london.get_size();
		assertEquals(1, size);
	}

	@Test
	public void testSiteAddition() {
//		LONDON.ADD_SITE(TESTSITE);
		Site testing = london.get_site(0);
		assertEquals(testSite, testing);
	}

	@Test
	public void testRegionSize2() {
		london.add_site(testSite2);
		int size = london.get_size();
		assertEquals(2, size);
	}
	
	//MAIN SYSTEM TESTS
	
	@Test
	public void testUpdateRecords(){
		int visitors = testSite.getSite_visitors();
		main.updateRecords(regions, prioritySites);
		int visitors2 = testSite.getSite_visitors();
		assertTrue(visitors != visitors2);
		}
	
	public void testPrioritySites(){
		int size = prioritySites.size();
		main.updateRecords(regions, prioritySites);
		String rating = testSite.getSite_rating();
		int size2 = prioritySites.size();
		if(rating == "Bronze"){
			assertTrue(size != size2);
		}else{
		assertEquals(size, size2);
		}
		}
	
	public void testCheckDate(){
		
		String date = "30/12";
		Boolean result = main.checkDate(date);
		assertTrue(result == true);
		
		date = "30/11";
		result = main.checkDate(date);
		assertTrue(result == false);
				
		
	}

}
