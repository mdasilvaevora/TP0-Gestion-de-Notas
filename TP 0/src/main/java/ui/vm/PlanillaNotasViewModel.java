package ui.vm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
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
import usuario.ConjuntoAsignaturas;
import usuario.Nota;
import usuario.Asignatura;
import usuario.RequestService;

@SuppressWarnings("unused")
@Observable
public class PlanillaNotasViewModel {
	
	
	private static String token = AlumnosRepository.getAlumno().getToken();
	private ConjuntoAsignaturas conjuntoAsignaturas = new ConjuntoAsignaturas();
	private String id;
	private String titulo;
	private Asignatura asignatura;
	private String descripcion;
	private String calificaciones;
	private List<Asignatura> asignaturas;
	private List<Nota> notas;
	private Asignatura notaSeleccionada;
	
	public Asignatura getNotaSeleccionada(){
		return this.notaSeleccionada;
	}

	public PlanillaNotasViewModel() {
		this.setearNotaSeleccionada();
	}
	
	public void setAsignaturaSeleccionada(Asignatura asignatura){
		this.asignatura= asignatura;
	}
	
	
	public Asignatura getAsignaturaSeleccionada(){
		return this.asignatura;
	}
	
	public List<Asignatura> getAsignaturas(){
		return this.asignaturas;
	}
	
	/*public boolean verificarAprobacion(int valor){
		
		if(valor >= 6) return true;
		else return false;
		
	}*/
	
	public void setearNotaSeleccionada() {
		
		RequestService c = new RequestService();
		ConjuntoAsignaturas json= new Gson().fromJson(c.notas(token).getEntity(String.class) ,ConjuntoAsignaturas.class);
		this.conjuntoAsignaturas = json;
		this.asignaturas = this.conjuntoAsignaturas.getAssignments();
		
		/*for (int i = 0; i < asignaturas.size(); i++) {
			
			
			this.asignaturas.get(i).getGrades().forEach(item -> this.verificarAprobacion(item.getValue()));
			
		}
		*/
		}
		
	}


