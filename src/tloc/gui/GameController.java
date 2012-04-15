package tloc.gui;

import java.awt.event.KeyEvent;

import tloc.entities.Command;
import tloc.entities.Controls;
import tloc.entities.GameState;

public class GameController {
	
	//get command for key pressed
	public static void handleKeyPressed(KeyEvent e, GameState game) {
		Command command = Controls.getCommand(e.getKeyChar());
		if (command != null) {
			handleCommand(command, game);
		}
	}
	
	//get command for key released
	public static void handleKeyReleased(KeyEvent e, GameState game) {
		Command command = Controls.getCommand(e.getKeyChar());
		if (command != null) {
			handleNegativeCommand(command, game);
		}
	}
	
	//takes a command and calls player methods accordingly
	private static void handleCommand(Command command, GameState game) {
		if (command == Command.MOVERIGHT) {
			game.getPlayer().setxDirection(1);
		}
		if (command == Command.MOVELEFT) {
			game.getPlayer().setxDirection(-1);
		}
		if (command == Command.MOVEUP) {
			game.getPlayer().setyDirection(1);
		}
		if (command == Command.MOVEDOWN) {
			game.getPlayer().setyDirection(-1);
		}
		if (command == Command.JUMP) {
			game.getPlayer().jump();
		}
	}
	
	//takes a command and calls player methods accordingly
	private static void handleNegativeCommand(Command command, GameState game) {
		if (command == Command.MOVERIGHT && game.getPlayer().getxDirection() == 1) {
			game.getPlayer().setxDirection(0);
		}
		if (command == Command.MOVELEFT && game.getPlayer().getxDirection() == -1) {
			game.getPlayer().setxDirection(0);
		}
		if (command == Command.MOVEUP && game.getPlayer().getyDirection() == 1) {
			game.getPlayer().setyDirection(0);
		}
		if (command == Command.MOVEDOWN && game.getPlayer().getyDirection() == -1) {
			game.getPlayer().setyDirection(0);
		}
	}

	public static void handleTimerEvent() {
		GameStateView.getGameState().update();
		//GameStateView.redraw();
	}
}
