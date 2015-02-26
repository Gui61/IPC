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
		final int xx = grid.getColumnIndex(meCasiaron);
		final int yy = grid.getRowIndex(meCasiaron);
		switch(key.getCode()){
		case W:
		case UP:
			if(y>0){
				grid.setRowIndex(boton, y-1);
				if(x==xx && y-1==yy) sumaPuntos();}
			else{
				grid.setRowIndex(boton, 4);
				if(x==xx && 4==yy) sumaPuntos();}
			break;
		case S:
		case DOWN:
			if(y<4){
				grid.setRowIndex(boton, y+1);
				if(x==xx && y+1==yy) sumaPuntos();}
			else{
				grid.setRowIndex(boton, 0);
				if(x==xx && 0==yy) sumaPuntos();}
			break;
		case A:
		case LEFT:
			if(x>0){
				grid.setColumnIndex(boton, x-1);
				if(x-1==xx && y==yy) sumaPuntos();}
			else{
				grid.setColumnIndex(boton, 4);
				if(4==xx && y==yy) sumaPuntos();}
			break;
		case D:
		case RIGHT:
			if(x<4){
				grid.setColumnIndex(boton, x+1);
				if(x+1==xx && y==yy) sumaPuntos();}
			else{
				grid.setColumnIndex(boton, 0);
				if(0==xx && y==yy) sumaPuntos();}
			break;
		}			
	}
	public void sumaPuntos(){
		grid.setRowIndex(meCasiaron, (int) (Math.random()*5));
		grid.setColumnIndex(meCasiaron, (int) (Math.random()*5));
		int puntos = Integer.parseInt(points.getText());
		puntos++;
		points.setText(Integer.toString(puntos));
	}
/*	private void compare(){
		final int x = grid.getColumnIndex(boton);
		final int y = grid.getRowIndex(boton);
		final int xx = grid.getColumnIndex(meCasiaron);
		final int yy = grid.getRowIndex(meCasiaron);
		if(x==xx && y==yy){
			sumaPuntos();
			grid.setRowIndex(meCasiaron, (int) (Math.random()*5));
			grid.setColumnIndex(meCasiaron, (int) (Math.random()*5));
		}
	}*/
}