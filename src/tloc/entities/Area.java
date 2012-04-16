package tloc.entities;

/** Abstract superclass for areas that
 * the player will visit.
 */

public abstract class Area {
	private Location grid[][];
	
	public Area(int height, int width) {
		grid = new Location[width][height];
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				grid[i][j] = new Location(i,j);
			}
		}
	}
	
	//Getters and Setters
	public Location[][] getGrid() {
		return grid;
	}

	public void setGrid(Location grid[][]) {
		this.grid = grid;
	}
}