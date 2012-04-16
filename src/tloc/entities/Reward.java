package tloc.entities;

import java.util.ArrayList;
import java.util.List;

/** Reward class.
 * Rewards can include gold, experience and items.
 */

public class Reward {
	private int gold;
	private int experience;
	private List<Item> rewardItems = new ArrayList<Item>();
	
	//Getters and Setters
	public int getGold() {
		return gold;
	}
	
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public List<Item> getRewardItems() {
		return rewardItems;
	}
	
	public void setRewardItems(List<Item> rewardItems) {
		this.rewardItems = rewardItems;
	}
}
