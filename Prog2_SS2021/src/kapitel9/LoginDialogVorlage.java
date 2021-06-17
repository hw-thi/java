package kapitel9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoginDialogVorlage extends Application {

	public void start(Stage window) {
		window.setTitle("Login");
		BorderPane borderPane = new BorderPane();
		HBox buttonBox = new HBox();
		GridPane formularGrid = new GridPane();
		
		TextField nameTextField = new TextField();
		PasswordField passwortField = new PasswordField();
		Button cancelButton = new Button("abbrechen");
		Button okButton = new Button("ok");
		
		formularGrid.add(new Label("Benutzername"), 0, 0);
		formularGrid.add(nameTextField, 1, 0);
		formularGrid.add(new Label("Passwort"), 0, 1);
		formularGrid.add(passwortField, 1, 1);
	
		buttonBox.getChildren().addAll(cancelButton, okButton);
		
		// Styling
		buttonBox.setAlignment(Pos.CENTER);
		formularGrid.setPadding(new Insets(10, 10, 5, 10));
		formularGrid.setHgap(5);
		formularGrid.setVgap(5);
		buttonBox.setPadding(new Insets(0, 10, 10, 10));
		cancelButton.setPrefWidth(100);
		okButton.setPrefWidth(100);
		
		borderPane.setCenter(formularGrid);
		borderPane.setBottom(buttonBox);
		
		Scene scene = new Scene(borderPane);
		window.setScene(scene);
		window.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

}
