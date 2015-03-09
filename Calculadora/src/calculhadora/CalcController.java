package calculhadora;

import javafx.beans.InvalidationListener;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CalcController {
	@FXML
	private Button num0;
	@FXML
	private Button num1;
	@FXML
	private Button num2;
	@FXML
	private Button num3;
	@FXML
	private Button num4;
	@FXML
	private Button num5;
	@FXML
	private Button num6;
	@FXML
	private Button num7;
	@FXML
	private Button num8;
	@FXML
	private Button num9;
	@FXML
	private Button suma;
	@FXML
	private Button resta;
	@FXML
	private Button mult;
	@FXML
	private Button div;
	@FXML
	private Button igual;
	@FXML
	private Button clear;
	@FXML
	private Button coma;
	@FXML
	private TextArea res;
	
	@FXML
	protected DoubleProperty operando = new SimpleDoubleProperty(0.0);
		op1;
		op2;
		opDec;
		op;

	@FXML
	protected void write(ActionEvent e){
		
	}
	@FXML
	protected void op(ActionEvent e){
		
	}
}