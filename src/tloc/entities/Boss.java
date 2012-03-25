package tloc.entities;

import java.util.ArrayList;
import java.util.List;

/** Boss class.
 */

public class Boss extends Enemy {

	private Weapon specialWeapon;
	private List<Ability> bossAbilities = new ArrayList<Ability>();
	
	public Boss(int health, int dam, int def, int spd, int h, int w, int jH) {
		super(health, dam, def, spd, h, w, jH);
	}
	
	//Getters and Setters
	public Weapon getSpecialWeapon() {
		return specialWeapon;
	}

	public void setSpecialWeapon(Weapon specialWeapon) {
		this.specialWeapon = specialWeapon;
	}

	public List<Ability> getBossAbilities() {
		return bossAbilities;
	}

	public void setBossAbilities(List<Ability> bossAbilities) {
		this.bossAbilities = bossAbilities;
	}
}
