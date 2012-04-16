package tloc.entities;

public class CharacterSpace extends Space {
	
	public CharacterSpace(Location loc, int height, int width) {
		super(loc, height, width);
	}
	
	public CharacterSpace changeSpace(Character c) {
		bottomLeft = c.getCharacterLocation();
		getTopRight().setxLocation(bottomLeft.getxLocation() + c.getProperties().getWidth());
		getTopRight().setyLocation(bottomLeft.getyLocation() + c.getProperties().getHeight());
		return this;
	}
}
