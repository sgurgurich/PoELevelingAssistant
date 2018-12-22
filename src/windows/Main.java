package windows;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

	private Stage mainWindow;
	private Scene mainScene;


	public static void main(String[] args) {
		// launch the application by calling start
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		mainWindow = primaryStage;


		// set a title for the main window
		mainWindow.setTitle("PoE Buddy");

		Label welcomeLabel = new Label("Welcome to PoE Buddy!");


		// Set up the character scene
		CharacterLayout charLayout = new CharacterLayout();
		GridPane charPane = charLayout.getCharacterLayout();



		// Set up the main scene
		GridPane mainLayout = new GridPane();
		mainLayout.setPadding(new Insets(1));
		mainLayout.setHgap(10);
		mainLayout.setVgap(10);
		
		
	    TabPane mainTabs = createMainTabs();
	    Tab tab1 = mainTabs.getTabs().get(0);
	    tab1.setContent(charPane);
	    //Tab tab2 = mainTabs.getTabs().get(1);
	    
	    
		mainLayout.add(mainTabs, 0, 0, 100, 60);

		mainScene = new Scene(mainLayout, 992, 592);

		// add the scene to the stage
		mainWindow.setScene(mainScene);

		// show the stage
		mainWindow.show();



	}

	private TabPane createMainTabs() {
		TabPane tabPane = new TabPane();
		Tab tab1 = new Tab("Character");
		//tab1.setContent(charWrapper); 
		tab1.setClosable(false);
		Tab tab2 = new Tab("Leveling");
		tab2.setClosable(false);
		//tab2.setContent();
		tabPane.getTabs().addAll(tab1, tab2);
		
		return tabPane;
	}


}
