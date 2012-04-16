package tloc.entities;

/** A class for x and y coordinates.
 * Contains a method for comparing Locations.
 */

public class Location {
	private int xLocation, yLocation;
	
	public Location(int x, int y) {
		xLocation = x;
		yLocation = y;
	}
	
	//Check to see if locations are the same
	public static boolean sameLocation(Location a, Location b) {
		if (a.getxLocation() == b.getxLocation() && a.getyLocation() == b.getyLocation()) {
			return true;
		} else {
			return false;
		}
	}
	
	//Getters and Setters
	public int getxLocation() {
		return xLocation;
	}
	
	public void setxLocation(int xLocation) {
		this.xLocation = xLocation;
	}
	
	public int getyLocation() {
		return yLocation;
	}
	
	public void setyLocation(int yLocation) {
		this.yLocation = yLocation;
	}
	
}
