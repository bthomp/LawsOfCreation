package tloc.gui;

import java.awt.event.*;

import javax.swing.Timer;

import tloc.entities.GameState;

/**
 * RunGame Class. Starts a new game. Has a timer, every timer tick makes a call
 * to update GameState. Has handler for user keyboard/mouse input.
 */
public class RunGame {
	private static GameState game;

	public static void main(String[] args) {
		game = new GameState();

		// increment time every 1/10th of a second, when timer increments update
		// GameState
		Timer timer = new Timer(1000 / 10, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleTimerEvent();
			}
		});
		
		//run game while game state is not game over
		while (!game.isGameOver()) {
			timer.start();
		}
	}

	private static void handleTimerEvent() {
		game.update();
	}
}
