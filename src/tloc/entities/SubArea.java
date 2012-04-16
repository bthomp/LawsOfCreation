package tloc.entities;

/** SubAreas class.
 * For sidescrolling areas.
 */

public class SubArea extends Area implements IDisplayable {
	
	public SubArea(int height, int width) {
		super(height, width);
	}

	@Override
	public SpriteId getSpriteId() {
		return SpriteId.LAND;
	}
}
