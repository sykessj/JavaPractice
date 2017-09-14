package site_ratings;

import java.util.ArrayList;

public class Midlands implements Region {
	
	private String name;
	private ArrayList<Site> sites;
	
	
	public Midlands(){
		sites = new ArrayList<Site>();
	}
	public void add_site(Site site){
		
		sites.add(site);
		
	}
	
	public Site get_site(int i){
		Site siteRef = sites.get(i);
		return siteRef;
	}
	
	public int get_size(){
		return sites.size();
	}
	
	public String toString() {
		return name + sites;
	}

}
