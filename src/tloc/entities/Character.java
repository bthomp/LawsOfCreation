package tloc.entities;

/** Abstract superclass for all characters
 * including Player, Enemy, Boss and NPC.
 * The fields are fields that will change frequently
 * for Characters.  The other fields are contained
 * in CharacterProperties.
 * 
 * Instances of Character subclasses must have
 * a height and width before a characterLocation
 * is assigned.
 */

public abstract class Character {
	
	//standard character fields
	private CharacterProperties properties;
	private int currentHealth;
	private int damage, defense, speed;
	private int xDirection, yDirection;
	private CharacterSpace spaceTaken;
	private Location characterLocation;  //bottom left corner
	private boolean isJumping = false;
	
	public Character(int health, int dam, int def, int spd, int h, int w, int jH) {
		currentHealth = health;
		damage = dam;
		defense = def;
		speed = spd;
		properties = new CharacterProperties(h, w, jH, health);
	}
	
	//move method
	public void move() {
		Movement.moveCharacter(this);
	}
	
	//jump method
	public void jump() {
		Movement.jumpCharacter(this);
	}
	
	//attack method
	public void attack() {
		Combat.attack(this);
	}
	
	//block method
	public void block() {
		Combat.block(this);
	}
	
	//Getters and Setters
	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getxDirection() {
		return xDirection;
	}

	public void setxDirection(int xDirection) {
		this.xDirection = xDirection;
	}

	public int getyDirection() {
		return yDirection;
	}

	public void setyDirection(int yDirection) {
		this.yDirection = yDirection;
	}

	public CharacterSpace getSpaceTaken() {
		return spaceTaken;
	}

	public Location getCharacterLocation() {
		return characterLocation;
	}

	public void setCharacterLocation(Location characterLocation) {
		this.characterLocation = characterLocation;
		this.setCharacterSpace();
	}

	private void setCharacterSpace() {
		if (this.spaceTaken == null) {
			this.spaceTaken = new CharacterSpace(this.getCharacterLocation(), this.properties.getHeight(), this.properties.getWidth());
		} else {
			this.spaceTaken.changeSpace(this);
		}
	}

	public void setIsJumping(boolean isJumping) {
		this.isJumping = isJumping;
	}
	
	public boolean getIsJumping() {
		return this.isJumping;
	}

	public CharacterProperties getProperties() {
		return properties;
	}

	public void setProperties(CharacterProperties properties) {
		this.properties = properties;
	}
	
	//returns true if character is moving
	public boolean isMoving() {
		if (this.xDirection == 0 && this.yDirection == 0) {
			return false;
		} else {
			return true;
		}
	}
}
