package kapitel9;

import java.util.Collections;
import java.util.Comparator;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginDialog extends Application {
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("Login");
		// Panes
		BorderPane borderPane = new BorderPane();
		GridPane gridPane = new GridPane();
		FlowPane flowPane = new FlowPane();
		// Controls
		Label nameLabel = new Label("Name");
		Label passwordLabel = new Label("Passwort");
		Label meldung = new Label("");
		borderPane.setCenter(meldung);
		TextField nameTextField = new TextField();
		PasswordField passwordField = new PasswordField();
		Button okButton = new Button("Login");
		Button cancelButton = new Button("Abbrechen");
		
		gridPane.add(nameLabel, 0, 0);
		gridPane.add(nameTextField, 1, 0);
		gridPane.add(passwordLabel, 0, 1);
		gridPane.add(passwordField, 1, 1);
		borderPane.setTop(gridPane);
		
		flowPane.getChildren().addAll(cancelButton, okButton);
		borderPane.setBottom(flowPane);

		// Ereignisbehandlung
//		Comparator<String> stringComparator = (s1, s2) -> {
//			return s1.length() - s2.length();
//		};
//		Collections.sort(liste, stringComparator);
		EventHandler<ActionEvent> okHandler = event -> {
			String name = nameTextField.getText();
			String password = passwordField.getText();
			
			if (name.equals("Hugo") && password.equals("123")) {
				System.out.println("Super!");
				Platform.exit();
			} else {
				meldung.setText("Fehler!");
			}
		};
		okButton.setOnAction(okHandler);
		cancelButton.setOnAction(event -> {
			Platform.exit();
		});
		nameTextField.setOnAction(okHandler);
		passwordField.setOnAction(okHandler);
		
		// Beautifying
		// setze gleiche Button-Grössen
		okButton.setPrefWidth(80);
		cancelButton.setPrefWidth(80);
		// zentriere Buttons
		flowPane.setAlignment(Pos.CENTER);
		// setze Abstände für Grid und Button-Pane
		gridPane.setPadding(new Insets(10, 10, 0, 10));
		flowPane.setPadding(new Insets(5, 10, 10, 10));
		// setze Abstände zwischen Formular-Elementen horizontal und vertikal
		gridPane.setHgap(10);
		gridPane.setVgap(5);
		
		Scene scene = new Scene(borderPane, 250, 130);
		window.setScene(scene);
		window.setMinHeight(120);
		window.setMinWidth(200);
		window.show();
	}

}
