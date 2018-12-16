
public class LabDataManager {
	
	private boolean normal;
	private boolean cruel;
	private boolean merc;
	private boolean uber;
	
	private boolean[] normal_trials;
	private boolean[] cruel_trials;
	private boolean[] merc_trials;
	private boolean[] uber_trials;
	
	public LabDataManager(){
		this.normal = false;
		this.cruel  = false;
		this.merc   = false;
		this.uber   = false;
		
		this.normal_trials = new boolean[6];
		this.cruel_trials  = new boolean[3];
		this.merc_trials   = new boolean[3];
		this.uber_trials   = new boolean[6];
		
		initializeTrialArrays();
		
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


	public boolean checkTrial(int difficulty, int trial_id){
		boolean output = false;
		
		switch(difficulty){
		case 1:
			try{
				output = this.normal_trials[trial_id];
			} catch (IndexOutOfBoundsException iobe){
				// return false
			}
			break;
			
		case 2:
			try{
				output = this.cruel_trials[trial_id];
			} catch (IndexOutOfBoundsException iobe){
				// return false
			}
			break;
			
		case 3:
			try{
				output = this.merc_trials[trial_id];
			} catch (IndexOutOfBoundsException iobe){
				// return false
			}
			break;
			
		case 4:
			try{
				output = this.uber_trials[trial_id];
			} catch (IndexOutOfBoundsException iobe){
				// return false
			}
			break;
			
		default:
			break;
			
		}
		
		return output;
	}
	
	public void setTrial(int difficulty, int trial_id, boolean value){
		switch(difficulty){
		case 1:
			try{
				this.normal_trials[trial_id] = value;
			} catch (IndexOutOfBoundsException iobe){
				// return false
			}
			break;
			
		case 2:
			try{
				this.cruel_trials[trial_id] = value;
			} catch (IndexOutOfBoundsException iobe){
				// return false
			}
			break;
			
		case 3:
			try{
				this.merc_trials[trial_id] = value;
			} catch (IndexOutOfBoundsException iobe){
				// return false
			}
			break;
			
		case 4:
			try{
				this.uber_trials[trial_id] = value;
			} catch (IndexOutOfBoundsException iobe){
				// return false
			}
			break;
			
		default:
			break;
			
		}
	}
	
	
	public void clearAll(){
		this.normal = false;
		this.cruel  = false;
		this.merc   = false;
		this.uber   = false;
		
		initializeTrialArrays();
	}
	
	public boolean isNormal() {
		return normal;
	}

	public void setNormal(boolean normal) {
		this.normal = normal;
	}

	public boolean isCruel() {
		return cruel;
	}

	public void setCruel(boolean cruel) {
		this.cruel = cruel;
	}

	public boolean isMerc() {
		return merc;
	}

	public void setMerc(boolean merc) {
		this.merc = merc;
	}

	public boolean isUber() {
		return uber;
	}

	public void setUber(boolean uber) {
		this.uber = uber;
	}
	
	private void initializeTrialArrays(){
		for (int i = 0; i < 6; i++){
			this.normal_trials[i] = false;
			this.uber_trials[i]   = false;
		}
		
		for (int i = 0; i < 3; i++){
			this.cruel_trials[i] = false;
			this.merc_trials[i]  = false;
		}
	}

	
}
