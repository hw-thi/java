package kapitel9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Namenseingabe extends Application {
	private boolean german = true;
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("Namenseingabe");
		FlowPane flowPane = new FlowPane();
		
		// Controls anlegen und in FlowPane setzen
		TextField nameTextField = new TextField();
		Button okButton = new Button("ok");
		Label label = new Label("Bitte Name:");
		label.setOnMouseClicked(e -> {
			if (german) {
				label.setText("Name please: ");
			} else {
				label.setText("Bitte Name: ");
			}
			german = !german;
		});
		flowPane.getChildren().addAll(label, nameTextField, okButton);
		
		// Ereignisbehandlung für Klick-Ereignis (Event) am Button
		
		// erzeuge Objekt mit Handler-Methode zu anonymen Klasse
//		okButton.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				String name = nameTextField.getText();
//				System.out.println(name);
//			}			
//		});
		okButton.setOnAction(event -> {
			String name = nameTextField.getText();
			System.out.println(name);
		});
		
		//okButton.setDisable(true);
		Scene scene = new Scene(flowPane);
		window.setScene(scene);
		window.show();
	}

}
