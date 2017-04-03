package ui.vm;

import org.uqbar.commons.utils.Observable;

import repository.Repositorios;


@Observable
public class TokenViewModel {
	
	private String token;


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
		Repositorios.alumnos.getAlumno().setToken(token);
		//System.out.println(token);
		
	}

	
}