
public class GenericDataPacker {
	
	private String name;
	private int level;
	private String char_class;
	private String ascendancy;
	
	private boolean normal;
	private boolean cruel;
	private boolean merc;
	private boolean uber;
	private boolean[] normal_trials;
	private boolean[] cruel_trials;
	private boolean[] merc_trials;
	private boolean[] uber_trials;
	
	private int bandit_choice;
	
	private boolean[] quest_statuses;
	
	public GenericDataPacker(){
		this.name           = null;
		this.level          = 1;
		this.char_class     = null;
		this.ascendancy     = null;
		this.normal         = false;
		this.cruel          = false;
		this.merc           = false;
		this.uber           = false;
		this.normal_trials  = null;
		this.cruel_trials   = null;
		this.merc_trials    = null;
		this.uber_trials    = null;
		this.bandit_choice  = 0;
		this.quest_statuses = null;
	}
	
	public void packCharacterData(String name, int level, String char_class, String ascendency){
		this.name           = name;
		this.level          = level;
		this.char_class     = char_class;
		this.ascendancy     = ascendency;
	}
	
	public void packLabData(boolean normal, boolean cruel, boolean merc, boolean uber, 
							boolean[] normal_trials, boolean[] cruel_trials, 
							boolean[] merc_trials, boolean[] uber_trials){
		
		this.normal         = normal;
		this.cruel          = cruel;
		this.merc           = merc;
		this.uber           = uber;
		this.normal_trials  = normal_trials;
		this.cruel_trials   = cruel_trials;
		this.merc_trials    = merc_trials;
		this.uber_trials    = uber_trials;
		
	}


	public void packBanditData(int bandit_choice){
		this.bandit_choice = bandit_choice;
	}
	
	public void packQuestData(boolean[] quest_statuses){
		this.quest_statuses = quest_statuses;
	}
	
	// GETTERS


	public boolean[] getNormal_trials() {
		return normal_trials;
	}

	public boolean[] getCruel_trials() {
		return cruel_trials;
	}

	public boolean[] getMerc_trials() {
		return merc_trials;
	}

	public boolean[] getUber_trials() {
		return uber_trials;
	}

	public int getBandit_choice() {
		return bandit_choice;
	}

	public boolean[] getQuest_statuses() {
		return quest_statuses;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}
	
	public String getCharClass() {
		return char_class;
	}

	public String getAscendancy() {
		return ascendancy;
	}

	public boolean isNormal() {
		return normal;
	}

	public boolean isCruel() {
		return cruel;
	}

	public boolean isMerc() {
		return merc;
	}

	public boolean isUber() {
		return uber;
	}

	public boolean[] getNormalTrials() {
		return normal_trials;
	}

	public boolean[] getCruelTrials() {
		return cruel_trials;
	}

	public boolean[] getMercTrials() {
		return merc_trials;
	}

	public boolean[] getUberTrials() {
		return uber_trials;
	}

	public int getBanditChoice() {
		return bandit_choice;
	}

	public boolean[] getQuestStatuses() {
		return quest_statuses;
	}


}
