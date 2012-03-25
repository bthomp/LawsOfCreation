package tloc.entities;

/** Weapon class.
 * Fields for weapon damage and range.
 */

public class Weapon extends Item {
	private int weaponDamage;
	private int range;
	
	//Getters and Setters
	public int getWeaponDamage() {
		return weaponDamage;
	}

	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
}
