
public class BanditDataManager {
	
	private int bandit_choice;
	
	public BanditDataManager(){
		this.bandit_choice = 0;
	}
	
	public void clearAll(){
		this.bandit_choice = 0;
	}

	public int getBanditChoice() {
		return bandit_choice;
	}

	public void setBanditChoice(int bandit_choice) {
		this.bandit_choice = bandit_choice;
	}
	
	

}
