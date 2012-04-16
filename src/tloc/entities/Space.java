package tloc.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Space class.
 * Represents any space on the Area grid that
 * is occupied by a game entity.
 * Methods to compare spaces, check for overlap,
 * and detect collision.
 */

public class Space {
	protected Location bottomLeft, topRight;
	
	public Space(Location loc, int height, int width) {
		int topX, topY;
		bottomLeft = loc;
		topX = bottomLeft.getxLocation() + width;
		topY = bottomLeft.getyLocation() + height;
		setTopRight(new Location(topX, topY));
	}
	
	//check two Spaces to see if they're the same
	public boolean sameSpace(Space compare) {
		if (Location.sameLocation(compare.getBottomLeft(), this.bottomLeft) &&
				Location.sameLocation(compare.getTopRight(), this.getTopRight())) {
			return true;
		} else {
			return false;
		}
	}
	
	//check two Spaces to see if they overlap
	public static boolean checkOverlap(Space a, Space b) {
		List<Location> space1 = perimeter(a);
		List<Location> space2 = perimeter(b);
		Iterator<Location> iter1 = space1.iterator();
		Iterator<Location> iter2;
		Location compare;
	
		while (iter1.hasNext()) {
			iter2 = space2.iterator();
			compare = iter1.next();
			while (iter2.hasNext()) {
				if (Location.sameLocation(compare, iter2.next())) {
					return true;
				}
			}
		}
	
		return false;
	}
	
	/** Detect collision.
	 * Stops movement of Character in
	 * direction of collision;
	 */
	public static void checkCollision(Character c, Space compare) {
		Space space;
		int height = c.getProperties().getHeight();
		int width = c.getProperties().getWidth();
		int x = c.getCharacterLocation().getxLocation() + (c.getxDirection() * c.getSpeed());
		int y = c.getCharacterLocation().getyLocation() + (c.getyDirection() * c.getSpeed());
		
		//check collision left and right
		space = new CharacterSpace(new Location(x, c.getCharacterLocation().getyLocation()), height, width);
		if (checkOverlap(space, compare)) {
			c.setxDirection(0);
		}
		
		//check collision up and down
		space = new CharacterSpace(new Location(c.getCharacterLocation().getxLocation(), y), height, width);
		if (checkOverlap(space, compare)) {
			c.setyDirection(0);
		}
	}
	
	//return a list of locations on the perimeter of space
	private static List<Location> perimeter(Space s) {
		int width = s.topRight.getxLocation() - s.bottomLeft.getxLocation();
		int height = s.topRight.getyLocation() - s.bottomLeft.getyLocation();
		List<Location> list = new ArrayList<Location>();
		Location loc;
		
		for (int i = 0; i < width; i++) {
			loc = new Location(s.bottomLeft.getxLocation() + i, s.bottomLeft.getyLocation());
			list.add(loc);
			loc = new Location(s.bottomLeft.getxLocation() + i, s.bottomLeft.getyLocation() + height);
			list.add(loc);
		}
		for (int i = 0; i < height; i++) {
			loc = new Location(s.bottomLeft.getxLocation(), s.bottomLeft.getyLocation() + i);
			list.add(loc);
			loc = new Location(s.bottomLeft.getxLocation() + width, s.bottomLeft.getyLocation() + i);
			list.add(loc);
		}
		
		return list;
	}

	//Getters and Setters
	public Location getBottomLeft() {
		return bottomLeft;
	}

	public void setBottomLeft(Location bottomLeft) {
		this.bottomLeft = bottomLeft;
	}

	public Location getTopRight() {
		return topRight;
	}

	public void setTopRight(Location topRight) {
		this.topRight = topRight;
	}
}
