package windows;
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

import data.managers.BanditDataManager;
import data.managers.CharacterDataManager;
import data.managers.LabDataManager;
import data.managers.QuestDataManager;
import file.io.FileIOManager;
import file.io.GenericDataPacker;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;

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
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		frmPoeLevelingAssistant.setResizable(false);
		frmPoeLevelingAssistant.setTitle("PoE Leveling Assistant");
		frmPoeLevelingAssistant.setBounds(100, 100, 896, 663);
		frmPoeLevelingAssistant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPoeLevelingAssistant.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 24, 850, 593);
		frmPoeLevelingAssistant.getContentPane().add(tabbedPane);
		
		JPanel leveling_panel = new JPanel();
		tabbedPane.addTab("Leveling", null, leveling_panel, null);
		leveling_panel.setLayout(null);
		
		JLabel lblTrialsOfAscendancy = new JLabel("Trials of Ascendancy");
		lblTrialsOfAscendancy.setBounds(313, 67, 185, 25);
		leveling_panel.add(lblTrialsOfAscendancy);
		lblTrialsOfAscendancy.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Lower Prison");
		rdbtnNewRadioButton.setBounds(0, 111, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Crypt Level 1");
		rdbtnNewRadioButton_1.setBounds(0, 141, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("CoS Level 2");
		rdbtnNewRadioButton_2.setBounds(0, 171, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Crematorium");
		rdbtnNewRadioButton_3.setBounds(131, 111, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Catacombs");
		rdbtnNewRadioButton_4.setBounds(131, 141, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Imperial Gardens");
		rdbtnNewRadioButton_5.setBounds(131, 171, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(266, 98, 8, 108);
		leveling_panel.add(separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("The Prison");
		rdbtnNewRadioButton_6.setBounds(273, 111, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("The Crypt");
		rdbtnNewRadioButton_7.setBounds(273, 141, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("CoS Level 2");
		rdbtnNewRadioButton_8.setBounds(273, 171, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_8);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(408, 98, 8, 108);
		leveling_panel.add(separator_1);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("The Bath House");
		rdbtnNewRadioButton_9.setBounds(418, 111, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("The Tunnel");
		rdbtnNewRadioButton_10.setBounds(418, 141, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("The Ossuary");
		rdbtnNewRadioButton_11.setBounds(418, 171, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_11);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(548, 98, 8, 108);
		leveling_panel.add(separator_2);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Piercing Truth");
		rdbtnNewRadioButton_12.setBounds(564, 111, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Swirling Fear");
		rdbtnNewRadioButton_13.setBounds(564, 141, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("Crippling Grief");
		rdbtnNewRadioButton_14.setBounds(564, 171, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("Burning Rage");
		rdbtnNewRadioButton_15.setBounds(713, 111, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_15);
		
		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("Lingering Pain");
		rdbtnNewRadioButton_16.setBounds(713, 141, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_16);
		
		JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("Stinging Doubt");
		rdbtnNewRadioButton_17.setBounds(713, 171, 127, 25);
		leveling_panel.add(rdbtnNewRadioButton_17);
		
		JRadioButton rdbtnNormalLab = new JRadioButton("Normal Lab");
		rdbtnNormalLab.setBounds(0, 68, 127, 25);
		leveling_panel.add(rdbtnNormalLab);
		
		JRadioButton rdbtnCruelLab = new JRadioButton("Cruel Lab");
		rdbtnCruelLab.setBounds(187, 68, 127, 25);
		leveling_panel.add(rdbtnCruelLab);
		
		JRadioButton rdbtnMercLab = new JRadioButton("Merc Lab");
		rdbtnMercLab.setBounds(533, 68, 127, 25);
		leveling_panel.add(rdbtnMercLab);
		
		JRadioButton rdbtnUberLab = new JRadioButton("Uber Lab");
		rdbtnUberLab.setBounds(713, 68, 127, 25);
		leveling_panel.add(rdbtnUberLab);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 98, 833, 2);
		leveling_panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 205, 833, 2);
		leveling_panel.add(separator_4);
		
		textField = new JTextField();
		textField.setBounds(0, 14, 216, 34);
		leveling_panel.add(textField);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setColumns(10);
		
		JLabel lblCharacterName = new JLabel("Character Name:");
		lblCharacterName.setBounds(0, 0, 111, 16);
		leveling_panel.add(lblCharacterName);
		
		textField_1 = new JTextField("1");
		textField_1.setBounds(228, 14, 40, 34);
		leveling_panel.add(textField_1);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setColumns(10);
		
		JLabel lblLevel = new JLabel("Level:");
		lblLevel.setBounds(228, 0, 56, 16);
		leveling_panel.add(lblLevel);
		
		JLabel lblAscendancy = new JLabel("Ascendancy:");
		lblAscendancy.setBounds(564, 0, 127, 16);
		leveling_panel.add(lblAscendancy);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBounds(274, 14, 40, 34);
		leveling_panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char_data.decreaseLevel();
				textField_1.setText(Integer.toString(char_data.getLevel()));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton button = new JButton("+");
		button.setBounds(313, 14, 40, 34);
		leveling_panel.add(button);
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 243, 111, 22);
		leveling_panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kill All", "Help Alira", "Help Oak", "Help Kraityn"}));
		
		JLabel lblBandits = new JLabel("Bandits:");
		lblBandits.setBounds(0, 220, 81, 16);
		leveling_panel.add(lblBandits);
		lblBandits.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(469, 244, 222, 278);
		leveling_panel.add(scrollPane_1);
		
		JList list = new JList(complete_q_model);
		scrollPane_1.setViewportView(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(147, 245, 222, 278);
		leveling_panel.add(scrollPane);
		
		JList list_1 = new JList(incomplete_q_model);
		scrollPane.setViewportView(list_1);
		
		JLabel lblPassiveQuests = new JLabel("Passive Quests");
		lblPassiveQuests.setBounds(357, 219, 133, 16);
		leveling_panel.add(lblPassiveQuests);
		lblPassiveQuests.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblToDo = new JLabel("To do:");
		lblToDo.setBounds(233, 228, 56, 16);
		leveling_panel.add(lblToDo);
		
		JLabel lblCompleted = new JLabel("Completed:");
		lblCompleted.setBounds(533, 228, 81, 16);
		leveling_panel.add(lblCompleted);
		
		JButton btnNewButton_2 = new JButton("<<<");
		btnNewButton_2.setBounds(382, 381, 72, 49);
		leveling_panel.add(btnNewButton_2);
		
		JButton button_1 = new JButton(">>>");
		button_1.setBounds(381, 318, 72, 49);
		leveling_panel.add(button_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(392, 14, 152, 34);
		leveling_panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Select>", "Witch", "Marauder", "Templar", "Shadow", "Ranger", "Duelist", "Scion"}));
		
		JLabel lblClass = new JLabel("Class:");
		lblClass.setBounds(392, 0, 56, 16);
		leveling_panel.add(lblClass);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(564, 14, 271, 34);
		leveling_panel.add(comboBox_2);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.setBounds(713, 318, 116, 82);
		leveling_panel.add(btnNewButton_3);
		
		JButton button_2 = new JButton("Load");
		button_2.setBounds(713, 413, 116, 49);
		leveling_panel.add(button_2);
		
		JButton button_3 = new JButton("Clear");
		button_3.setBounds(713, 496, 116, 25);
		leveling_panel.add(button_3);
		
		JPanel value_panel = new JPanel();
		tabbedPane.addTab("Value", null, value_panel, null);
		value_panel.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(40, 60, 376, 490);
		value_panel.add(scrollPane_2);
		
		JTextArea textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		
		JLabel lblItemData = new JLabel("Item Data:");
		lblItemData.setBounds(40, 45, 120, 16);
		value_panel.add(lblItemData);
		
		JLabel lblImportedData = new JLabel("Imported Data");
		lblImportedData.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblImportedData.setBounds(156, 13, 132, 16);
		value_panel.add(lblImportedData);
		
		JLabel lblParsedData = new JLabel("Parsed Data");
		lblParsedData.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblParsedData.setBounds(573, 13, 145, 16);
		value_panel.add(lblParsedData);
		
		textField_2 = new JTextField();
		textField_2.setBounds(487, 63, 321, 22);
		value_panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(447, 66, 43, 16);
		value_panel.add(lblName);
		
		JButton btnCheckPoetrade = new JButton("Check Database");
		btnCheckPoetrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCheckPoetrade.setBounds(447, 168, 361, 34);
		value_panel.add(btnCheckPoetrade);
		
		JLabel lblAuctionData = new JLabel("Auction Data");
		lblAuctionData.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAuctionData.setBounds(573, 145, 120, 22);
		value_panel.add(lblAuctionData);
		
		JLabel lblWorthSelling = new JLabel("Worth Selling?");
		lblWorthSelling.setBounds(447, 98, 151, 16);
		value_panel.add(lblWorthSelling);
		
		textField_3 = new JTextField();
		textField_3.setBounds(533, 98, 275, 22);
		value_panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblLowestPrice = new JLabel("Lowest Price: ");
		lblLowestPrice.setBounds(447, 230, 81, 16);
		value_panel.add(lblLowestPrice);
		
		JLabel lblHighestPrice = new JLabel("Highest Price:");
		lblHighestPrice.setBounds(447, 259, 91, 16);
		value_panel.add(lblHighestPrice);
		
		textField_4 = new JTextField();
		textField_4.setBounds(533, 227, 275, 22);
		value_panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(533, 256, 275, 22);
		value_panel.add(textField_5);
		textField_5.setColumns(10);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(452, 528, 356, 22);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		value_panel.add(progressBar);
		
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char_data.clearAll();
				lab_data.clearAll();
				quest_data.clearAll();
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quest_data.completeQuest(list_1.getSelectedIndex());
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quest_data.forgetQuest(list.getSelectedIndex());
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char_data.increaseLevel();
				textField_1.setText(Integer.toString(char_data.getLevel()));
			}
		});
		

	}
}
