package Resetitasricas;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

class recetas {
	
	private final StringProperty NomPlato, Categoria, FormPrep, Ingredientes, Observaciones,
								 Valoracion, tPrep, tCoccion, Dificultad, Personas;
	
	public recetas(){
		this(null,null);
	}
	public recetas(String NomPlato, String Categoria){
		this.NomPlato = new SimpleStringProperty(NomPlato);
		this.Categoria = new SimpleStringProperty(Categoria);
		
		this.FormPrep = new SimpleStringProperty("Añada forma de preparación.");
		this.Ingredientes = new SimpleStringProperty("Añada los ingredientes.");
		this.Observaciones = new SimpleStringProperty("");
		this.Valoracion = new SimpleStringProperty("3/5");
		this.tPrep = new SimpleStringProperty("Indique el tiempo total de preparación");
		this.tCoccion = new SimpleStringProperty("Indique el tiempo de cocción");
		this.Dificultad = new SimpleStringProperty("Indique la dificultad de la receta.");
		this.Personas = new SimpleStringProperty("Numero de personas");
	}	
	public String getNomPlato(){return NomPlato.get();}
	public void setNomPlato(String NomPlato){this.NomPlato.set(NomPlato);}
	public StringProperty NomPlatoProperty(){return NomPlato;}
	
	public String getCategoria(){return Categoria.get();}
	public void setCategoria(String Categoria){this.Categoria.set(Categoria);}
	public StringProperty CategoriaProperty(){return Categoria;}
	
	public String getIngredientes(){return Ingredientes.get();}
	public void setIngredientes(String Ingredientes){this.Ingredientes.set(Ingredientes);}
	public StringProperty IngredientesProperty(){return Ingredientes;}
	
	public String getObservaciones(){return Observaciones.get();}
	public void setObservaciones(String Observaciones){this.Observaciones.set(Observaciones);}
	public StringProperty ObservacionesProperty(){return Observaciones;}
	
	public String getValoracion(){return Valoracion.get();}
	public void setValoracion(String Valoracion){this.Valoracion.set(Valoracion);}
	public StringProperty ValoracionProperty(){return Valoracion;}
	
	public String gettPrep(){return tPrep.get();}
	public void tPrep(String tPrep){this.tPrep.set(tPrep);}
	public StringProperty tPrepProperty(){return tPrep;}
	
	//faltan...
	}