package es.upv.ejercicioeventos1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class SampleController {
	@FXML
	private Button boton;
	private Button meCasiaron;
	private GridPane grid;
	private Text points;
	
	@FXML
	protected void botonMove(KeyEvent key) {
		final int x = grid.getColumnIndex(boton);
		final int y = grid.getRowIndex(boton);
		switch(key.getCode()){
		case W:
		case UP:
			if(y>0){
				grid.setRowIndex(boton, y-1);
				compare();}
			else{
				grid.setRowIndex(boton, 4);
				compare();}
			break;
		case S:
		case DOWN:
			if(y<4){
				grid.setRowIndex(boton, y+1);
				compare();}
			else{
				grid.setRowIndex(boton, 0);
				compare();}
			break;
		case A:
		case LEFT:
			if(x>0){
				grid.setColumnIndex(boton, x-1);
				compare();}
			else{
				grid.setColumnIndex(boton, 4);
				compare();}
			break;
		case D:
		case RIGHT:
			if(x<4){
				grid.setColumnIndex(boton, x+1);
				compare();}
			else{
				grid.setColumnIndex(boton, 0);
				compare();}
			break;
		}			
	}
	public void sumaPuntos(){
		int puntos = Integer.parseInt(points.getText());
		puntos++;
		String s = Integer.toString(puntos);
		points.setText(s);
	}
	
	private void compare(){
		final int x = grid.getColumnIndex(boton);
		final int y = grid.getRowIndex(boton);
		final int xx = grid.getColumnIndex(meCasiaron);
		final int yy = grid.getRowIndex(meCasiaron);
		if(x==xx && y==yy){
			sumaPuntos();
			grid.setRowIndex(meCasiaron, (int) (Math.random()*5));
			grid.setColumnIndex(meCasiaron, (int) (Math.random()*5));
		}
	}
}