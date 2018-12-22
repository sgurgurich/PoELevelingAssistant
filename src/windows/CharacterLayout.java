package windows;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class CharacterLayout {
	
	public CharacterLayout() {
		
	}
	
	public GridPane getCharacterLayout() {
		// Set up the character scene
		GridPane charWrapper = new GridPane();
		charWrapper.setPadding(new Insets(10));
		charWrapper.setHgap(10);
		charWrapper.setVgap(10);
		charWrapper.backgroundProperty().setValue(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));;
		
		
		TextField charNameField = new TextField();
		charNameField.setPromptText("Character Name");
		charNameField.setPrefColumnCount(15);
		
		TextField levelField = new TextField();
		levelField.setPromptText("Level");
		levelField.setPrefColumnCount(3);

		Button incLevelBtn = new Button();
		incLevelBtn.setText("Lvl +");
		incLevelBtn.setOnAction(e -> System.out.println("Level Increased"));

		Button decLevelBtn = new Button();
		decLevelBtn.setText("Lvl -");
		decLevelBtn.setOnAction(e -> System.out.println("Level Decreased"));

		charWrapper.add(charNameField, 0, 2, 1, 1);
		charWrapper.add(levelField, 0, 4, 1, 1);
		charWrapper.add(decLevelBtn, 0, 5, 1, 1);
		charWrapper.add(incLevelBtn, 2, 5, 1, 1);

		
		
		return charWrapper;
	}

}
