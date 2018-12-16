import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;

public class MainWindow {

	private JFrame frmPoeLevelingAssistant;
	private JTextField textField;
	private JTextField textField_1;
	private CharacterDataManager char_data;
	private LabDataManager lab_data;
	private QuestDataManager quest_data;
	private BanditDataManager bandit_data;
	private GenericDataPacker data_packer;
	private FileIOManager file_man;
	private DefaultListModel<String> incomplete_q_model;
	private DefaultListModel<String> complete_q_model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmPoeLevelingAssistant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		incomplete_q_model = new DefaultListModel<String>();
		complete_q_model   = new DefaultListModel<String>();
		
		char_data   = new CharacterDataManager();
		lab_data    = new LabDataManager();
		quest_data  = new QuestDataManager(incomplete_q_model, complete_q_model);
		bandit_data = new BanditDataManager();
		data_packer = new GenericDataPacker();
		file_man    = new FileIOManager("TestInputFile.txt", data_packer);
		
		frmPoeLevelingAssistant = new JFrame();
		frmPoeLevelingAssistant.setTitle("PoE Leveling Assistant");
		frmPoeLevelingAssistant.setBounds(100, 100, 899, 603);
		frmPoeLevelingAssistant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPoeLevelingAssistant.getContentPane().setLayout(null);
		
		JLabel lblTrialsOfAscendancy = new JLabel("Trials of Ascendancy");
		lblTrialsOfAscendancy.setBounds(335, 91, 185, 25);
		lblTrialsOfAscendancy.setFont(new Font("Tahoma", Font.BOLD, 16));
		frmPoeLevelingAssistant.getContentPane().add(lblTrialsOfAscendancy);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Lower Prison");
		rdbtnNewRadioButton.setBounds(22, 135, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Crypt Level 1");
		rdbtnNewRadioButton_1.setBounds(22, 165, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("CoS Level 2");
		rdbtnNewRadioButton_2.setBounds(22, 195, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Crematorium");
		rdbtnNewRadioButton_3.setBounds(153, 135, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Catacombs");
		rdbtnNewRadioButton_4.setBounds(153, 165, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Imperial Gardens");
		rdbtnNewRadioButton_5.setBounds(153, 195, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(288, 122, 8, 108);
		separator.setOrientation(SwingConstants.VERTICAL);
		frmPoeLevelingAssistant.getContentPane().add(separator);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("The Prison");
		rdbtnNewRadioButton_6.setBounds(295, 135, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("The Crypt");
		rdbtnNewRadioButton_7.setBounds(295, 165, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("CoS Level 2");
		rdbtnNewRadioButton_8.setBounds(295, 195, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_8);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(430, 122, 8, 108);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		frmPoeLevelingAssistant.getContentPane().add(separator_1);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("The Bath House");
		rdbtnNewRadioButton_9.setBounds(440, 135, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("The Tunnel");
		rdbtnNewRadioButton_10.setBounds(440, 165, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("The Ossuary");
		rdbtnNewRadioButton_11.setBounds(440, 195, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_11);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(570, 122, 8, 108);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		frmPoeLevelingAssistant.getContentPane().add(separator_2);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Piercing Truth");
		rdbtnNewRadioButton_12.setBounds(586, 135, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Swirling Fear");
		rdbtnNewRadioButton_13.setBounds(586, 165, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("Crippling Grief");
		rdbtnNewRadioButton_14.setBounds(586, 195, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("Burning Rage");
		rdbtnNewRadioButton_15.setBounds(735, 135, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_15);
		
		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("Lingering Pain");
		rdbtnNewRadioButton_16.setBounds(735, 165, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_16);
		
		JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("Stinging Doubt");
		rdbtnNewRadioButton_17.setBounds(735, 195, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNewRadioButton_17);
		
		JRadioButton rdbtnNormalLab = new JRadioButton("Normal Lab");
		rdbtnNormalLab.setBounds(22, 92, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnNormalLab);
		
		JRadioButton rdbtnCruelLab = new JRadioButton("Cruel Lab");
		rdbtnCruelLab.setBounds(209, 92, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnCruelLab);
		
		JRadioButton rdbtnMercLab = new JRadioButton("Merc Lab");
		rdbtnMercLab.setBounds(555, 92, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnMercLab);
		
		JRadioButton rdbtnUberLab = new JRadioButton("Uber Lab");
		rdbtnUberLab.setBounds(735, 92, 127, 25);
		frmPoeLevelingAssistant.getContentPane().add(rdbtnUberLab);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(22, 122, 833, 2);
		frmPoeLevelingAssistant.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(22, 229, 833, 2);
		frmPoeLevelingAssistant.getContentPane().add(separator_4);
		
		textField = new JTextField();
		textField.setBounds(22, 38, 216, 34);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmPoeLevelingAssistant.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCharacterName = new JLabel("Character Name:");
		lblCharacterName.setBounds(22, 24, 111, 16);
		frmPoeLevelingAssistant.getContentPane().add(lblCharacterName);
		
		textField_1 = new JTextField("1");
		textField_1.setEditable(false);
		textField_1.setBounds(250, 38, 40, 34);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmPoeLevelingAssistant.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLevel = new JLabel("Level:");
		lblLevel.setBounds(250, 24, 56, 16);
		frmPoeLevelingAssistant.getContentPane().add(lblLevel);
		
		JLabel lblAscendancy = new JLabel("Ascendancy:");
		lblAscendancy.setBounds(586, 24, 127, 16);
		frmPoeLevelingAssistant.getContentPane().add(lblAscendancy);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char_data.decreaseLevel();
				textField_1.setText(Integer.toString(char_data.getLevel()));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(296, 38, 40, 34);
		frmPoeLevelingAssistant.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("+");
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setBounds(335, 38, 40, 34);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char_data.increaseLevel();
				textField_1.setText(Integer.toString(char_data.getLevel()));
			}
		});
		frmPoeLevelingAssistant.getContentPane().add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(22, 267, 111, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kill All", "Help Alira", "Help Oak", "Help Kraityn"}));
		frmPoeLevelingAssistant.getContentPane().add(comboBox);
		
		JLabel lblBandits = new JLabel("Bandits:");
		lblBandits.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBandits.setBounds(22, 244, 81, 16);
		frmPoeLevelingAssistant.getContentPane().add(lblBandits);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(491, 268, 222, 278);
		frmPoeLevelingAssistant.getContentPane().add(scrollPane_1);
		
		JList list = new JList(complete_q_model);
		scrollPane_1.setViewportView(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(169, 269, 222, 278);
		frmPoeLevelingAssistant.getContentPane().add(scrollPane);
		
		JList list_1 = new JList(incomplete_q_model);
		scrollPane.setViewportView(list_1);
		
		JLabel lblPassiveQuests = new JLabel("Passive Quests");
		lblPassiveQuests.setBounds(379, 243, 133, 16);
		lblPassiveQuests.setFont(new Font("Tahoma", Font.BOLD, 16));
		frmPoeLevelingAssistant.getContentPane().add(lblPassiveQuests);
		
		JLabel lblToDo = new JLabel("To do:");
		lblToDo.setBounds(255, 252, 56, 16);
		frmPoeLevelingAssistant.getContentPane().add(lblToDo);
		
		JLabel lblCompleted = new JLabel("Completed:");
		lblCompleted.setBounds(555, 252, 81, 16);
		frmPoeLevelingAssistant.getContentPane().add(lblCompleted);
		
		JButton btnNewButton_2 = new JButton("<<<");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quest_data.forgetQuest(list.getSelectedIndex());
			}
		});
		btnNewButton_2.setBounds(404, 405, 72, 49);
		frmPoeLevelingAssistant.getContentPane().add(btnNewButton_2);
		
		JButton button_1 = new JButton(">>>");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quest_data.completeQuest(list_1.getSelectedIndex());
			}
		});
		button_1.setBounds(403, 342, 72, 49);
		frmPoeLevelingAssistant.getContentPane().add(button_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Select>", "Witch", "Marauder", "Templar", "Shadow", "Ranger", "Duelist", "Scion"}));
		comboBox_1.setBounds(414, 38, 152, 34);
		frmPoeLevelingAssistant.getContentPane().add(comboBox_1);
		
		JLabel lblClass = new JLabel("Class:");
		lblClass.setBounds(414, 24, 56, 16);
		frmPoeLevelingAssistant.getContentPane().add(lblClass);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(586, 38, 271, 34);
		frmPoeLevelingAssistant.getContentPane().add(comboBox_2);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// update all data managers
				char_data.setName(textField.getText());
				char_data.setLevel(Integer.parseInt(textField_1.getText()));
				char_data.setCharClass(comboBox_1.getName());
				//char_data.setAscendancy(comboBox_2.getSelectedItem());
				
				lab_data.setNormal(rdbtnNormalLab.isSelected());
				lab_data.setCruel(rdbtnCruelLab.isSelected());
				lab_data.setMerc(rdbtnMercLab.isSelected());
				lab_data.setUber(rdbtnUberLab.isSelected());
				
				lab_data.setTrial(1,1,rdbtnNewRadioButton.isSelected());
				lab_data.setTrial(1,2,rdbtnNewRadioButton_1.isSelected());
				lab_data.setTrial(1,3,rdbtnNewRadioButton_2.isSelected());
				lab_data.setTrial(1,4,rdbtnNewRadioButton_3.isSelected());
				lab_data.setTrial(1,5,rdbtnNewRadioButton_4.isSelected());
				lab_data.setTrial(1,6,rdbtnNewRadioButton_5.isSelected());
				
				lab_data.setTrial(2,1,rdbtnNewRadioButton_6.isSelected());
				lab_data.setTrial(2,2,rdbtnNewRadioButton_7.isSelected());
				lab_data.setTrial(2,3,rdbtnNewRadioButton_8.isSelected());
				
				lab_data.setTrial(3,1,rdbtnNewRadioButton_9.isSelected());
				lab_data.setTrial(3,2,rdbtnNewRadioButton_10.isSelected());
				lab_data.setTrial(3,3,rdbtnNewRadioButton_11.isSelected());
				
				lab_data.setTrial(4,1,rdbtnNewRadioButton_12.isSelected());
				lab_data.setTrial(4,2,rdbtnNewRadioButton_13.isSelected());
				lab_data.setTrial(4,3,rdbtnNewRadioButton_14.isSelected());
				lab_data.setTrial(4,4,rdbtnNewRadioButton_15.isSelected());
				lab_data.setTrial(4,5,rdbtnNewRadioButton_16.isSelected());
				lab_data.setTrial(4,6,rdbtnNewRadioButton_17.isSelected());
				
				bandit_data.setBanditChoice(comboBox.getSelectedIndex());
				
				//data_packer.packCharacterData(char_data.getName(), char_data.getLevel(), char_data.getAscendancy());
				data_packer.packCharacterData(char_data.getName(), 32, char_data.getCharClass(), "Elementalist");
				data_packer.packLabData(lab_data.isNormal(), lab_data.isCruel(), lab_data.isMerc(), lab_data.isUber(), 
										lab_data.getNormalTrials(), lab_data.getCruelTrials(), 
										lab_data.getMercTrials(), lab_data.getUberTrials());
				data_packer.packBanditData(bandit_data.getBanditChoice());
				data_packer.packQuestData(quest_data.getQuestStatuses());
				
				file_man.writeFile();
			}
		});
		btnNewButton_3.setBounds(735, 342, 116, 82);
		frmPoeLevelingAssistant.getContentPane().add(btnNewButton_3);
		
		JButton button_2 = new JButton("Load");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(735, 437, 116, 49);
		frmPoeLevelingAssistant.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Clear");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char_data.clearAll();
				lab_data.clearAll();
				quest_data.clearAll();
			}
		});
		button_3.setBounds(735, 520, 116, 25);
		frmPoeLevelingAssistant.getContentPane().add(button_3);
		

	}
}
