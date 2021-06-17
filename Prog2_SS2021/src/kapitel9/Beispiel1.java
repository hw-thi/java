package kapitel9;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Beispiel1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("Beispiel 1");
		window.setHeight(100);
		
		TextField nameTextField = new TextField();
		Button okButton = new Button("ok");
		
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(10));
		pane.setHgap(10.0);
		pane.getChildren().addAll(new Label("Hi!"), nameTextField, okButton);
		
		okButton.setOnAction(event -> {
			String name = nameTextField.getText();
			System.out.println(name);
			Platform.exit();
		});
		
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();
	}

}
