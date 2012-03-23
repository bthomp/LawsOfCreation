package entities;

/** Abstract superclass that all abilities
 * will extend.
 */

public abstract class Ability {
	private String abilityName;
	
	//Getters and Setters
	public String getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}
}
