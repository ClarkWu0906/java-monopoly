package project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MenuController {

	@FXML
	public void onStartPressed() throws IOException{
		Parent map = FXMLLoader.load(getClass().getResource("Map.fxml"));
		Scene mapScene = new Scene(map);
		mapScene.getRoot().requestFocus();
		Game.currentStage.setScene(mapScene);
	}
	@FXML
	public void onExitPressed() {
		Game.currentStage.close();
	}
	@FXML
	public void onOptionsPressed() throws IOException {
		Parent option = FXMLLoader.load(getClass().getResource("Options.fxml"));
		Scene optionScene = new Scene(option);
		optionScene.getRoot().requestFocus();
		Game.currentStage.setScene(optionScene);
	}
}
