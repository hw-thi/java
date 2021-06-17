import javafx.application.Application;
import javafx.event.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class OKButtonHandler implements EventHandler<ActionEvent> {
	public void handle(ActionEvent arg0) {
		System.out.println("Hallo");
	}	
}

public class EventHandlerDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		Button b = new Button("ok");
		// Ereignisbehandlung: Hallo auf die Console schreiben
		b.setOnAction((ActionEvent e) -> System.out.println("Hallo"));
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println("Hallo");				
			}
		});
		b.setOnAction(new OKButtonHandler());
	}

}
