package entities;

/** Fields for the Character class that
 * won't change frequently are contained here.
 */

public class CharacterProperties {
	private int height, width, jumpHeight, maxHealth;
	private boolean canJump, killable;
	
	public CharacterProperties(int h, int w, int jH, int health) {
		height = h;
		width = w;
		jumpHeight = jH;
		maxHealth = health;
	}
	
	//Getters and Setters
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getJumpHeight() {
		return jumpHeight;
	}

	public void setJumpHeight(int jumpHeight) {
		this.jumpHeight = jumpHeight;
	}

	public boolean isCanJump() {
		return canJump;
	}

	public void setCanJump(boolean canJump) {
		this.canJump = canJump;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public boolean isKillable() {
		return killable;
	}

	public void setKillable(boolean killable) {
		this.killable = killable;
	}
}
