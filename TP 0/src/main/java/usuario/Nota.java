package usuario;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.uqbar.arena.widgets.List;
import org.uqbar.commons.utils.Observable;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

@SuppressWarnings("unused")
@Observable
public class Nota{

	public String id;
	public String titulo;
	public String descripcion;
	public String calificaciones; /* Apa las papas aca. Momentaneamente es una decision sin seguridad. Hay que ver
									 como pasar la lista de calificaciones del servidor al JSONObject.
									 Defini esa lista de numeros, como un string, porque acuerdense que las notas
									 pueden ser letras(Conceptuales) o numericas.
									 No se si definiendolo como un string vamos a solucionar algo, pero habria
									 que pensar esto mas adelante. Yo diria dejarlo pa lo ultimo, ya que en todo
									 campo menos. Primero veamos de como bindear las cosas*/
	
	/*creo que la clase se tendria que llamar asignaciones y no notas, porque tenemos varias 
	asignaciones y dentro de ellas diversas notas, pero lo dejamos para despues*/
  RequestService cliente = new RequestService();
  Gson gson = new Gson();	
	
	public String getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getCalificaciones() {
		return calificaciones;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setCalificaciones(String calificaciones) {
		this.calificaciones = calificaciones;
	}
	
}	