package Game;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Hangman_Cover extends Application {

	Button button;
	Button button2;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title of the window");
		button = new Button();
		button.setText("Play Game");
		button.setLayoutX(483);
		button.setLayoutY(324);

		button2 = new Button();
		button2.setText("Quit Game");
		button2.setLayoutX(483);
		button2.setLayoutY(360);
		Alert newAlert = new Alert(AlertType.CONFIRMATION);
		button2.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent arg0) {
				newAlert.show();
				if (newAlert.getResult() == ButtonType.OK) {
					System.exit(0);
				}
			}

		});
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent arg1) {
				Hangman hang= new Hangman();
				hang.run();
				
			}

	});
		AnchorPane root = new AnchorPane();
		Image hangman = new Image(new FileInputStream("C:/Users/MY PC/Downloads/Hang.jpg"));
		ImageView iv = new ImageView();
		iv.setImage(hangman);
		Scene newScene = new Scene(root, 1190, 680);
		root.getChildren().add(iv);
		root.getChildren().add(button);
		root.getChildren().add(button2);
		primaryStage.setScene(newScene);
		primaryStage.show();
	}

}
