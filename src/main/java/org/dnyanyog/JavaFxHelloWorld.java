package org.dnyanyog;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFxHelloWorld extends Application {

	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Stage stage = new Stage();

		stage.setTitle("First Window");
		stage.setFullScreen(true);
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

		Group actorGroup = new Group();

		Scene scene = new Scene(actorGroup, Color.BLUE);

		stage.setScene(scene);
		stage.show();

	}
}