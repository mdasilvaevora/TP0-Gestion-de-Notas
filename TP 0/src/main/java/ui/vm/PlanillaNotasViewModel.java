package ui.vm;

import org.uqbar.commons.utils.Observable;
import com.sun.jersey.api.client.Client;
import com.google.gson.Gson;

import repository.AlumnosRepository;
import usuario.Nota;
import usuario.RequestService;

@SuppressWarnings("unused")
@Observable
public class PlanillaNotasViewModel {
	
	private static String token = AlumnosRepository.getAlumno().getToken();
	private Nota unaNota;
	private String id;
	private String titulo;
	private String descripcion;
	private String calificaciones;

	public PlanillaNotasViewModel() {
		this.setearNotaSeleccionada();
	}
	
	public int getId(){
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

	
	public void setearNotaSeleccionada(){
		RequestService c = new RequestService();
		Nota json= new Gson().fromJson(c.notas(token).getEntity(String.class) ,Nota.class);
		System.out.println(json.getId());
		this.unaNota=json;
	}
}
