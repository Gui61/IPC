package es.upv.ejercicioeventos1;

import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class MoveController {
	@FXML
	private HBox myButton;
	
	@FXML
	protected void move(KeyEvent keyEvent) {
		KeyCode pressedKey = keyEvent.getCode();
		if(KeyCode.UP == pressedKey){
	        GridPane.setHalignment(HBox,HPos.RIGHT);

		}
			
		}
}