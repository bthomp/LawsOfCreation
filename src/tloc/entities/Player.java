package tloc.entities;

import java.util.ArrayList;
import java.util.List;

/** Player class.
 * Contains methods for unique abilities
 * of the Player.
 */

public class Player extends Character implements IDisplayable {
	private Weapon weapon;
	private static final int startingHealth = 100;
	private static final int startingDamage = 10;
	private static final int startingDefense = 0;
	private static final int startingSpeed = 2;
	private static final int height = 2;
	private static final int width = 2;
	private static final int startingJumpHeight = 2;
	private List<Ability> abilities = new ArrayList<Ability>();
	
	public Player() {
		super(startingHealth, startingDamage, startingDefense, startingSpeed, height, width, startingJumpHeight);
	}
	
	@Override
	public SpriteId getSpriteId() {
		return SpriteId.PLAYER;
	}
	
	//sprint method
	public void sprint() {
		
	}
	
	//use item method
	public void useItem() {
		
	}
	
	//Getters and Setters
	public List<Ability> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
