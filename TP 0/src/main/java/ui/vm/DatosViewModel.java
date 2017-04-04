package ui.vm;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.uqbar.commons.utils.Observable;
import com.sun.jersey.api.client.Client;

import com.google.gson.Gson;

import repository.Repositorios;
import usuario.Alumno;
import usuario.RequestService;

@Observable
public class DatosViewModel{//Copiado de VentaViewModel practica-arena

	private static String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
	private Alumno unAlumno;
	Gson gson = new Gson();
	Client cliente = new Client();
	String codeTuvieja;
	//private String code, firstName, lastName, gitUser;

	public DatosViewModel() {
		this.setearAlumnoSeleccionado();
	}

	public String getCode(){
		//this.setearAlumnoSeleccionado();
		//return unAlumno.getCode();
		return codeTuvieja;
		//return "hola";
	}
	
	public String getFirstName() {
		return " Hola";
		//return Repositorios.alumno.getAlumno().getFirst_name();
	}
	
	public String getLastName() {
		return " Hola";
		//return Repositorios.alumno.getAlumno().getLast_name();
	}
	
	public String getGitUser() {
		return " Hola";
		//return Repositorios.alumno.getAlumno().getGit_user();
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
	/*Alumno unAlumno = new Alumno();
		unAlumno.setCode("Tumama");
		this.unAlumno = unAlumno;
		System.out.println(unAlumno.getCode());
		*/
		
		//this.unAlumno=gson.fromJson(this.cliente.resource("http://notitas.herokuapp.com").path("student").header("Authorization", "Bearer " + this.token).accept(MediaType.APPLICATION_JSON).toString(),Alumno.class);
		Map messageObjMap = new Gson().fromJson(this.cliente.resource("http://notitas.herokuapp.com").path("student").header("Authorization", "Bearer " + this.token).accept(MediaType.APPLICATION_JSON), Map.class);
		this.codeTuvieja = messageObjMap.get("code").toString();
	
		
		//System.out.println("hola");
		/*
		unAlumno = gson.fromJson(cliente.resource("http://notitas.herokuapp.com").path("student").header("Authorization", "Bearer " + token).accept(MediaType.APPLICATION_JSON).toString() ,Alumno.class);
		this.unAlumno = unAlumno;
		*/
	}
}
	/*
	public static void main(String[] args) throws Exception{
		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
		Alumno unAlumno;
		Gson gson = new Gson();
		Client cliente;
		Alumno alumno = new Alumno();
	    alumno=gson.fromJson(cliente.resource("http://notitas.herokuapp.com").path("student").header("Authorization", "Bearer " + token).accept(MediaType.APPLICATION_JSON).toString(),Alumno.class);
		
		
		
	}
}
*/
