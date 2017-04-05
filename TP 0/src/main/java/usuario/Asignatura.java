package usuario;

import java.util.LinkedList;
import java.util.List;
import org.uqbar.commons.utils.Observable;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

@SuppressWarnings("unused")
@Observable
public class Asignatura{

	public String id;
	public String title;
	public String description;
	private List<Nota> grades = new LinkedList<>(); 

	
  RequestService cliente = new RequestService();
  Gson gson = new Gson();	
	
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public List<Nota> getGrades() {
		return grades;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescripcion(String description) {
		this.description = description;
	}
	public void setGrades(List<Nota> notas) {
		this.grades = notas;
	}
	
}	