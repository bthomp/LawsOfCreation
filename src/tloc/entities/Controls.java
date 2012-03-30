package tloc.entities;

public class Controls {
	private static int moveRight = 'd';
	private static int moveLeft = 'a';
	private static int moveUp = 'w';
	private static int moveDown = 's';
	private static int jump = 32;
	
	//returns command based off int value
	public static Command getCommand(int control) {
		if (control == moveRight) {
			return Command.MOVERIGHT;
		}
		if (control == moveLeft) {
			return Command.MOVELEFT;
		}
		if (control == moveUp) {
			return Command.MOVEUP;
		}
		if (control == moveDown) {
			return Command.MOVEDOWN;
		}
		if (control == jump) {
			return Command.JUMP;
		}
		return null;
	}
	
	public int getMoveRight() {
		return moveRight;
	}

	public void setMoveRight(int moveRight) {
		this.moveRight = moveRight;
	}

	public int getMoveLeft() {
		return moveLeft;
	}

	public void setMoveLeft(int moveLeft) {
		this.moveLeft = moveLeft;
	}

	public int getMoveUp() {
		return moveUp;
	}

	public void setMoveUp(int moveUp) {
		this.moveUp = moveUp;
	}

	public int getMoveDown() {
		return moveDown;
	}

	public void setMoveDown(int moveDown) {
		this.moveDown = moveDown;
	}

	public int getJump() {
		return jump;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}
}
