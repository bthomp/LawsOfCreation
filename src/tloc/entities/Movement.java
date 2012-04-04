package tloc.entities;

/** A class containing static methods that handle
 * the movement of a character. Includes jumping.
 */

public class Movement {
	//move
	public static void moveCharacter(Character c) {
		int x = c.getCharacterLocation().getxLocation() + (c.getxDirection() * c.getSpeed());
		int y = c.getCharacterLocation().getyLocation() + (c.getyDirection() * c.getSpeed());
		Location z = new Location(x, y);
		c.setCharacterLocation(z);
	}
	
	//jump
	public static void jumpCharacter(Character c) {
		c.setIsJumping(true);
		
		//jump up
		for (int i = 0; i < c.getProperties().getJumpHeight(); i++) {
			int x = c.getCharacterLocation().getxLocation() + (c.getxDirection() * c.getSpeed());
			int y = c.getCharacterLocation().getyLocation() + 1;
			c.setCharacterLocation(new Location(x, y));
		}
		//fall down
		for (int i = c.getProperties().getJumpHeight(); i > 0; i--) {
			int x = c.getCharacterLocation().getxLocation() + (c.getxDirection() * c.getSpeed());
			int y = c.getCharacterLocation().getyLocation() - 1;
			c.setCharacterLocation(new Location(x, y));
		}
		c.setIsJumping(false);
	}
}
