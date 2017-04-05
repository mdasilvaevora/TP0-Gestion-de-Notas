package usuario;

import org.uqbar.commons.utils.Observable;

import com.google.gson.Gson;

@Observable
public class Alumno {
	public String code;
	public String first_name;
	public String last_name;
	public String token;
	public String git_user;
	RequestService cliente = new RequestService();
	Gson gson = new Gson();	
	
	/*
	public void datosAlumno(){
		gson = cliente.datos(token);
		String json = gson.toJson(gson);
		Alumno unAlumno= gson.fromJson(json,Alumno.class);
		
		this.code = unAlumno.code;
		this.first_name = unAlumno.first_name;
		this.last_name = unAlumno.last_name;
		this.git_user = unAlumno.git_user;
	
	}
	
	*/
	
	public String getToken() {
		return token;
	}
	public String getCode() {
		return code;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getGit_user() {
		return git_user;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String setCode(String code) {
		return this.code =  code; 
	}

	public String setFirst_name(String first_name) {
		 return this.first_name = first_name;
	}

	public String setLast_name(String last_name) {
		 return this.last_name = last_name;
	}

	public String setGit_user(String git_user) {
		 return this.git_user = git_user;
	}
}

	
	/*
	public static void main(String[] args) throws Exception{
		
		Alumno alumno = new Alumno();
		alumno.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
		
		
		
		alumno.datosAlumno();
		System.out.println(alumno.unAlumnito);
		
	}
	}
	
*/


