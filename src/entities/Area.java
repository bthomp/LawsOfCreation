package entities;

/** Abstract superclass for areas that
 * the player will visit.
 */

public abstract class Area {
	private Location grid[][];
	
	//Getters and Setters
	public Location[][] getGrid() {
		return grid;
	}

	public void setGrid(Location grid[][]) {
		this.grid = grid;
	}
}