package es.upv.ejercicioeventos1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class SampleController {
	@FXML
	private Button boton;
	
	@FXML
	protected void move(KeyEvent key) {
		if(key.getCode()== KeyCode.UP)
			System.out.print("asda");
	}
}