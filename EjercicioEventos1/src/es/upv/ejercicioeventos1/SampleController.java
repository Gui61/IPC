package es.upv.ejercicioeventos1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import java.util.*;

public class SampleController {
	@FXML
	private Button boton;
	private GridPane grid;
	
	@FXML
	protected void botonMove(KeyEvent key) {
		final int x = grid.getColumnIndex(boton);
		final int y = grid.getRowIndex(boton);
		switch(key.getCode()){
		case W:
		case UP:
			if(y>0){
				grid.setRowIndex(boton, y-1);
				break;}
			else{
				grid.setRowIndex(boton, 4);
			break;}
		case S:
		case DOWN:
			if(y<4){
				grid.setRowIndex(boton, y+1);}
			else{
				grid.setRowIndex(boton, 0);}
			break;
		case A:
		case LEFT:
			if(x>0){
				grid.setColumnIndex(boton, x-1);}
			else{
				grid.setColumnIndex(boton, 4);}
			break;
		case D:
		case RIGHT:
			if(x<4){
				grid.setColumnIndex(boton, x+1);}
			else{
				grid.setColumnIndex(boton, 0);}
			break;
		case ENTER:
			grid.setRowIndex(boton, (int) (Math.random()*5));
			grid.setColumnIndex(boton, (int) (Math.random()*5));
			break;
		default:
			break;
		}			
	}
}