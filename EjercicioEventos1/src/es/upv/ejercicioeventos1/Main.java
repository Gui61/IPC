package es.upv.ejercicioeventos1;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private double x,y;
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("/es/upv/ejercicioeventos1/view/GridPane.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Cuadrados locos");
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			
			scene.setOnMousePressed((e)->{
				x= primaryStage.getX() - e.getScreenX();
				y= primaryStage.getY() - e.getScreenY();
			});
			
			scene.setOnMouseDragged((e)->{
				primaryStage.setX(e.getScreenX() + x);
				primaryStage.setY(e.getScreenY() + y);
			});
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
