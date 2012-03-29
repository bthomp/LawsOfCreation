package tloc.entities;

import java.awt.event.KeyListener;
import java.util.Observable;

/** GameState class.
 * Representation of current state of game.
 * Static update method 
 */

public class GameState extends Observable {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private boolean gameOver = false;
	private Controls controls;
	private Area currentArea;
	private Player player;
	
	//constructor
	public GameState() {
		setControls(new Controls());
		currentArea = new SubArea(HEIGHT, WIDTH);
		setPlayer(new Player());
	}
	
	//updates game state
	public void update() {
		//moves player
		player.move();
		
		//call functions to move Characters
		
		setChanged();
		notifyObservers();
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

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Controls getControls() {
		return controls;
	}

	public void setControls(Controls controls) {
		this.controls = controls;
	}

	public boolean isGameOver() {
		return this.gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
}
