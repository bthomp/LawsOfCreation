package tloc.gui;

import java.awt.Component;
import java.awt.event.*;

import javax.swing.SwingUtilities;
import javax.swing.Timer;

import tloc.entities.GameState;

/**
 * RunGame Class. Starts a new game. Has a timer, every timer tick makes a call
 * to update GameState. Has handler for user keyboard/mouse input.
 */
public class RunGame {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			GameStateView view = new GameStateView();
		
			@Override
			public void run() {
				// increment time every 1/10th of a second, when timer increments update
				// GameState
				Timer timer = new Timer(1000 / 10, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						GameController.handleTimerEvent(GameStateView.getGameState());
					}
				});

				timer.start();
				view.startGame();
				
				//create a frame for the view and display it
			}
		});
	}
}
