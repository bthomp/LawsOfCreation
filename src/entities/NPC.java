package entities;

/** A subclass of Character for NPCs.
 * Contains methods to start conversation
 * and to move NPC.
 */

public class NPC extends Character {
	
	public NPC(int health, int dam, int def, int spd, int h, int w, int jH) {
		super(health, dam, def, spd, h, w, jH);
	}

	//start conversation with player
	public void convoStart() {
		
	}
	
	//Artificial movement
	public void aiMovement() {
		
	}
}
