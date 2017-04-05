package repository;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.utils.Observable;

import usuario.Alumno;

@Observable
public class AlumnosRepository {

	private static  Alumno alumno ;
	private String token;
	
	public static Alumno getAlumno() {
		if(alumno==null){
			alumno=new Alumno();
		}
		return alumno;
	}
	
	public void setToken(String token){
		 this.token=token;
	}
	
	public String getToken(){
		return this.token;
	}
}
