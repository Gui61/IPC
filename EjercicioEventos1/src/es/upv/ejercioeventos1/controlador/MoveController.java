package es.upv.ejercioeventos1.controlador;

import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

public class MoveController {
	@FXML
	private Button HBox;
	
	@FXML
	protected void move(KeyEvent keyEvent) {
		KeyCode pressedKey = keyEvent.getCode();
		if(KeyCode.UP == pressedKey){
	        GridPane.setHalignment(HBox,HPos.RIGHT);

		}
			
		}
}