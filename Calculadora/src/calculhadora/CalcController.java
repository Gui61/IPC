package calculhadora;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CalcController {
	@FXML
	private TextArea res;
	protected String valor = "";
	protected String stackValor = "0";
	protected String op="";	
	@FXML
	protected void digitos(ActionEvent e){
		Button botonPulsado = (Button) e.getTarget();
		String botonString = botonPulsado.getText();
		valor += botonString;
		res.setText(valor);
	}
	@FXML
	protected void op(ActionEvent e){
		Button botonPulsado = (Button) e.getTarget();
		String botonString = botonPulsado.getText();
		switch(botonString){
		case "C":
			valor = "";
			res.setText("");
			stackValor ="0";
			op="";
			break;
		case "+":
			stackValor = res.getText();
			res.setText("");
			valor = "";
			op = "+";
			break;
		case "-":
			stackValor = res.getText();
			res.setText("");
			valor = "";
			op = "-";
			break;
		case "X":
			stackValor = res.getText();
			res.setText("");
			valor = "";
			op = "X";
			break;
		case "/":
			stackValor = res.getText();
			res.setText("");
			valor = "";
			op = "/";
			break;
		case ".":
			valor += ".";
			break;
		case "=":
			double x = Double.parseDouble(stackValor);
			double y = Double.parseDouble(valor);
			switch(op){
			case "+":
				res.setText(Double.toString(x+y));
				break;
			case "-":
				res.setText(Double.toString(x-y));
				break;
			case "X":
				res.setText(Double.toString(x*y));
				break;
			case "/":
				res.setText(Double.toString(x/y));
				break;
			}
			valor = "";
			break;
		}
	}

}