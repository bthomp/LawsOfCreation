package tloc.entities;

/** GameState class.
 */

public class GameState {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private Area currentArea;
	private Player player;
	
	public GameState() {
		setCurrentArea(new SubArea(HEIGHT, WIDTH));
		player = new Player();
	}
	
	public static int getWidth() {
		return WIDTH;
	}
	public static int getHeight() {
		return HEIGHT;
	}

	public Area getCurrentArea() {
		return currentArea;
	}

	public void setCurrentArea(Area currentArea) {
		this.currentArea = currentArea;
	}
}
