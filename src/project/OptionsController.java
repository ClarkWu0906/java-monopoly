package project;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class OptionsController {
	@FXML
	public void onExitPressed() throws IOException{
		Parent menu = FXMLLoader.load(getClass().getResource("menu.fxml"));
		Scene menuScene = new Scene(menu);
		menuScene.getRoot().requestFocus();
		Game.currentStage.setScene(menuScene);
	}
}
