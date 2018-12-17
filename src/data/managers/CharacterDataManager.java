package data.managers;

public class CharacterDataManager {
	
	private String name;
	private int level;
	private String char_class;
	private String ascendancy;
	
	
	public CharacterDataManager(){
		this.name = "";
		this.level = 1;
		this.char_class = "";
		this.ascendancy = "";
	}
	
	
	public void increaseLevel(){
		if (this.level < 100){
			this.level++;
		}
	}
	
	public void decreaseLevel(){
		if (this.level >= 1){
			this.level--;
		}
	}

	public void clearAll(){
		this.name = "";
		this.level = 1;
		this.ascendancy = "";
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getCharClass() {
		return char_class;
	}
	
	public void setCharClass(String char_class){
		this.char_class = char_class;
	}


	public String getAscendancy() {
		return ascendancy;
	}


	public void setAscendancy(String ascendancy) {
		this.ascendancy = ascendancy;
	}

}
