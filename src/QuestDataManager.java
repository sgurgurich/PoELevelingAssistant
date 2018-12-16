import javax.swing.DefaultListModel;

public class QuestDataManager {
	
	private boolean[] quest_statuses;
	
	private String[] quest_names;
	private DefaultListModel<String> inc_q_list;
	private DefaultListModel<String> com_q_list;
	
	
	
	public QuestDataManager(DefaultListModel<String> inc_q_list, DefaultListModel<String> com_q_list){
		this.quest_statuses    = new boolean[21];
		this.quest_names       = new String[21];
		
		this.inc_q_list = inc_q_list;
		this.com_q_list = com_q_list;
		
		populateQuestStatuses();
		populateQuestNames();
		populateQuestLists();
	}
	
	public void clearAll(){
		populateQuestStatuses();
		populateQuestNames();
		
		for (int i = 0; i < 21; i++){
			inc_q_list.set(i,quest_names[i]);
			com_q_list.set(i, "");
		}
		
	}
	
	
	public void completeQuest(int quest_index){	
		try{
			if (quest_statuses[quest_index] == false){
				quest_statuses[quest_index] = true;
				
				inc_q_list.set(quest_index, "");
				com_q_list.set(quest_index, quest_names[quest_index]);
			}
		} catch (IndexOutOfBoundsException iobe){
			// do nothing
		}
	}
	
	public void forgetQuest(int quest_index){
		try{
			if (quest_statuses[quest_index] == true){
				quest_statuses[quest_index] = false;
				
				com_q_list.set(quest_index, "");
				inc_q_list.set(quest_index, quest_names[quest_index]);
			}
		} catch (IndexOutOfBoundsException iobe){
			// do nothing
		}
	}
	
	public boolean[] getQuestStatuses(){
		return this.quest_statuses;
	}
	
	private void populateQuestStatuses(){
		for (int i = 0; i < 21; i++){
			this.quest_statuses[i] = false;
		}
	}
	
	private void populateQuestNames(){
		this.quest_names[0]  = "The Marooned Mariner"          ;
		this.quest_names[1]  = "The Dweller of the Deep"       ;
		this.quest_names[2]  = "The Way Forward"               ;
		this.quest_names[3]  = "Victario's Secrets"            ;
		this.quest_names[4]  = "Piety's Pets"                  ;
		this.quest_names[5]  = "An Indomitable Spirit"         ;
		this.quest_names[6]  = "In Service to Science"         ;
		this.quest_names[7]  = "Kitava's Torments"             ;
		this.quest_names[8]  = "The Father of War"             ;
		this.quest_names[9]  = "The Puppet Mistress"           ;
		this.quest_names[10] = "The Cloven One"                ;
		this.quest_names[11] = "The Master of a Million Faces" ;
		this.quest_names[12] = "Kishara's Star"                ;
		this.quest_names[13] = "Queen of Despair"              ;
		this.quest_names[14] = "Reflection of Terror"          ;
		this.quest_names[15] = "Love is Dead"                  ;
		this.quest_names[16] = "The Gemling Legion"            ;
		this.quest_names[17] = "The Ruler of Highgate"         ;
		this.quest_names[18] = "Queen of the Sands"            ;
		this.quest_names[19] = "An End to Hunger"              ;
		this.quest_names[20] = "Vilenta's Vengeance"           ;
	}
	
	private void populateQuestLists(){
		
		for (int i = 0; i < 21; i++){
			inc_q_list.addElement(quest_names[i]);
			com_q_list.addElement("");
		}
	}


}
