package ui.vm;

import org.uqbar.commons.utils.Observable;
import com.sun.jersey.api.client.Client;

import repository.AlumnosRepository;

import com.google.gson.Gson;

import usuario.Alumno;
import usuario.RequestService;

@SuppressWarnings("unused")
@Observable
public class DatosViewModel{

	
	private static String token = AlumnosRepository.getAlumno().getToken();
	private Alumno unAlumno;
	private String code;
	private String firstName;
	private String lastName;
	private String gitUser;

	public DatosViewModel() {
		this.setearAlumnoSeleccionado();
	}

	public String getCode(){
		return unAlumno.getCode();
	}
	
	public String getFirstName() {
		return unAlumno.getFirst_name();
	}
	
	public String getLastName() {
		return unAlumno.getLast_name();
	}
	
	public String getGitUser() {
		return unAlumno.getGit_user();
		
	}
	public Alumno getUnAlumno(){
		return unAlumno;
	}
	
	public static void setToken(String unToken){
		token = unToken;
	}
	public void setUnAlumno(Alumno unAlumno){
		this.unAlumno = unAlumno;
	}

	public void setearTokenAlumno(String token){
			this.unAlumno.setToken(token);
		}
	
	public void setearAlumnoSeleccionado(){
		RequestService c = new RequestService();
		Alumno json= new Gson().fromJson(c.datos(token).getEntity(String.class) ,Alumno.class);
		//System.out.println(json.getFirst_name());
		this.unAlumno=json;
	}

}
