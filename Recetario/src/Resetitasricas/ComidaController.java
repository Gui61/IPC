package Resetitasricas;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

class ComidaController {
	@FXML
	private TableView<recetas> tablaRecetas;
	@FXML
	private TableColumn<recetas, String> columnaRecetas;
	@FXML
	private Label Categoria;
	@FXML
	private Label Dificultad;
	@FXML
	private Label FormaPrep;
	@FXML
	private Label Ingredientes;
	@FXML
	private Label NomPlato;
	@FXML
	private Label Observaciones;
	@FXML
	private Label Personas;
	@FXML
	private Label tCoccion;
	@FXML
	private Label tPrep;
	@FXML
	private Label Valoracion;
	
	public ComidaController(){}
	private void initialize(){
		columnaRecetas.setCellValueFactory(cellData -> cellData.getValue().NomPlatoProperty());
	}
}