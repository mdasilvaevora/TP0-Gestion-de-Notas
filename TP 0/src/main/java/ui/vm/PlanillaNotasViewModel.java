package ui.vm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.uqbar.commons.utils.Observable;
import com.sun.jersey.api.client.Client;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import repository.AlumnosRepository;
import usuario.Nota;
import usuario.RequestService;

@SuppressWarnings("unused")
@Observable
public class PlanillaNotasViewModel {
	
	public static List<Nota> notas = new ArrayList<Nota>();
	
	private static String token = AlumnosRepository.getAlumno().getToken();
	private Nota unaNota = new Nota();
	private String id;
	private String titulo;
	private String descripcion;
	private String calificaciones;

	/*public PlanillaNotasViewModel() {
		this.setearNotaSeleccionada();
	}
	*/
	public Object getId(){
		return unaNota.getId();
	}
	
	public String getTitulo() {
		return unaNota.getTitulo();
	}
	
	public String getDescripcion() {
		return unaNota.getDescripcion();
	}
	
	public String getCalificaciones() {
		return unaNota.getCalificaciones();
		
	}
	public Nota getUnaNota(){
		return unaNota;
	}

	
	public void setearNotaSeleccionada() {
		
		RequestService c = new RequestService();
		JsonObject json= new Gson().fromJson(c.notas(token).getEntity(String.class) ,JsonObject.class);
		
		for (int i = 0; i <= json.size(); i++) {/*para cada variable primero trae la lista entera lo casteo a JsonArray, 
												con la i del for traigo el primer JsonObject, despues casteo de nuevo a JsonObject,
												le pido que me pase la variable que quiera, y despues la convierto con toString a un String
												para asignarla a la variable de nota, despues notas.add, agrega la nota a la lista notas*/
			unaNota.setId((((JsonObject) ((JsonArray) json.get("assignments")).get(i)).get("id")).toString());																			
			unaNota.setTitulo((((JsonObject) ((JsonArray) json.get("assignments")).get(i)).get("title")).toString());
			unaNota.setDescripcion((((JsonObject) ((JsonArray) json.get("assignments")).get(i)).get("description")).toString());
			unaNota.setCalificaciones((((JsonObject) ((JsonArray) json.get("assignments")).get(i)).get("grades")).toString());
			notas.add(unaNota);

			/*Esto trae el ID de las dos notas, si cambias "id" por las otras variables
			te las trae :::: json :: JsonObject -> JsonArray -> JsonObject -> JsonElement -> String;*/
		}
		
	}
	
	
	/*public static void main(String[] args){
		PlanillaNotasViewModel nota = new PlanillaNotasViewModel();
		nota.setearNotaSeleccionada();
	}*/
}
