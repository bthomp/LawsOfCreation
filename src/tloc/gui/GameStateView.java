package tloc.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import tloc.entities.GameState;

/**
 * GameStateView draws the GUI.
 *
 */
public class GameStateView extends BasicGame {
	
	public GameStateView(String title) {
		super(title);
	}
	
	private static GameState game;
	
//	public void startGame(GameState g) {
//		game = g;
//		
//		// increment time every 1/10th of a second, when timer increments update
//		// GameState
//		Timer timer = new Timer(1000 / 10, new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				GameController.handleTimerEvent();
//			}
//		});
//		
//		timer.start();
//	}
	
//	@Override
//	public void keyPressed(KeyEvent e) {
//		GameController.handleKeyPressed(e, game);
//		System.out.println(e);
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		GameController.handleKeyReleased(e, game);
//		System.out.println(e);
//	}
//
//	@Override
//	public void keyTyped(KeyEvent e) {
//		;
//	}
	
	
	public static GameState getGameState() {
		return game;
	}

	@Override
	public void render(GameContainer arg0, org.newdawn.slick.Graphics arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}
}
