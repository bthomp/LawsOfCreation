package tloc.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.Timer;

import tloc.entities.GameState;

/**
 * GameStateView draws the GUI.
 *
 */
public class GameStateView extends JPanel implements KeyListener {
	private static final long serialVersionUID = 1L;
	private static final Color BACKGROUND_COLOR = Color.GREEN;
	private static final int WINDOW_HEIGHT = 600;
	private static final int WINDOW_WIDTH = 800;
	
	private static GameState game;
	
	public GameStateView() {
		setBackground(BACKGROUND_COLOR);
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
	}
	
	public void startGame() {
		game = new GameState();	
	}

	public static void redraw() {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		GameController.handleKeyPressed(e, game);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		GameController.handleKeyReleased(e, game);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		;
	}
	
	public static GameState getGameState() {
		return game;
	}
}
