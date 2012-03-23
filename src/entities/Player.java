package entities;

import java.util.ArrayList;
import java.util.List;

/** Player class.
 * Contains methods for unique abilities
 * of the Player.
 */

public class Player extends Character {
	private Weapon weapon;
	private List<Ability> abilities = new ArrayList<Ability>();
	
	public Player(int health, int dam, int def, int spd, int h, int w, int jH) {
		super(health, dam, def, spd, h, w, jH);
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
