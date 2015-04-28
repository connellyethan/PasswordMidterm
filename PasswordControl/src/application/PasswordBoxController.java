package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PasswordBoxController {

	@FXML
	private TextField password;

	@FXML
	private void initialize() {
	}

	public void isPasswordCorrect(){
		if(password == Bugaloo){
			Alert alert = new Alert(AlertType.WARNING);
			alert.setContentText("Correct!");
			alert.showAndWait();
		}
		else{
			Alert alert2 = new Alert(AlertType.WARNING);
			alert2.setContentText("Incorrect Password");
			alert2.showAndWait();
		}
	}
	
	public void helpButton(){
		Alert alert3 = new Alert(AlertType.WARNING);
		alert3.setContentText("Help was clicked");
		alert3.showAndWait();

}

}
