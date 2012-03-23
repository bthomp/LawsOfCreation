package entities;

import java.util.ArrayList;
import java.util.List;

/** Inventory class. Contains a list of items
 * in Inventory.
 */

public class Inventory {
	private List<Item> items = new ArrayList<Item>();
	private int playerGold;
	
	//Getters and Setters
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getPlayerGold() {
		return playerGold;
	}

	public void setPlayerGold(int gold) {
		this.playerGold = gold;
	}
}
