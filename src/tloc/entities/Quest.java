package tloc.entities;

import java.util.ArrayList;
import java.util.List;

/** Quest class. Fields for mainObjective, subObjectives, and reward.
 * Methods for rewarding player and updating objectives.
 */

public class Quest {
	private Objective mainObjective;
	private List<Objective> subObjectives = new ArrayList<Objective>();
	private Reward reward;
	
	//Getters and Setters
	public Objective getMainObjective() {
		return mainObjective;
	}
	
	public void setMainObjective(Objective mainObjective) {
		this.mainObjective = mainObjective;
	}
	
	public List<Objective> getSubObjectives() {
		return subObjectives;
	}
	
	public void setSubObjectives(List<Objective> subObjectives) {
		this.subObjectives = subObjectives;
	}
	
	public Reward getReward() {
		return reward;
	}
	
	public void setReward(Reward reward) {
		this.reward = reward;
	}
	
}
