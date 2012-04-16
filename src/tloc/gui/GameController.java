package tloc.gui;

import org.newdawn.slick.Input;

import tloc.entities.Command;
import tloc.entities.Controls;
import tloc.entities.GameState;

public class GameController {
	
	public static void handleInput(Input input, GameState game) {
		//check if input is to move up or down
		if (input.isKeyDown(Input.KEY_S)) {
			handleCommand(Controls.getCommand(Input.KEY_S), game);
		} else if (input.isKeyDown(Input.KEY_W)) {
			handleCommand(Controls.getCommand(Input.KEY_W), game);
		} else {
			game.getPlayer().setyDirection(0);
		}
		
		//check if input is to move left of right
		if (input.isKeyDown(Input.KEY_D)) {
			handleCommand(Controls.getCommand(Input.KEY_D), game);
		} else if (input.isKeyDown(Input.KEY_A)) {
			handleCommand(Controls.getCommand(Input.KEY_A), game);
		} else {
			game.getPlayer().setxDirection(0);
		}
		
		//check if input is jump
		if (input.isKeyDown(Input.KEY_SPACE)) {
			handleCommand(Controls.getCommand(Input.KEY_SPACE), game);
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
			game.getPlayer().setyDirection(-1);
		} 
		if (command == Command.MOVEDOWN) {
			game.getPlayer().setyDirection(1);
		}
		if (command == Command.JUMP) {
			game.getPlayer().jump();
		}
	}
}
