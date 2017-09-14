package site_ratings;

public class FactoryRegion {

	public Region getRegion(String regionType) {
		if (regionType == null) {
			return null;
		}
		if (regionType.equalsIgnoreCase("LONDON")) {
			return new London();
		}
		if (regionType.equalsIgnoreCase("SOUTHEAST")) {
			return new SouthEast();
		}

		if (regionType.equalsIgnoreCase("SOUTHWEST")) {
			return new SouthWest();
		}
		if (regionType.equalsIgnoreCase("NORTHWEST")) {
			return new NorthWest();
		}
		if (regionType.equalsIgnoreCase("NORTHEAST")) {
			return new NorthEast();
		}
		if (regionType.equalsIgnoreCase("MIDLANDS")) {
			return new Midlands();
		}

		return null;

	}

}


