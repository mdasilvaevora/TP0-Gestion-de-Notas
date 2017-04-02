package usuario;

import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;
import org.uqbar.commons.utils.Observable;

import com.sun.jersey.api.client.Client;


@Observable
public class RequestService {
	
	
	
	private Client client;
	
	 public RequestService() {
	        this.client = Client.create();
	 }
     public JSONObject datos(String token){// Trae datos, en la clase Alumno se ve como las uso con los setters
    	 return client.resource("http://notitas.herokuapp.com")
      		.path("student")
      		.header("Authorization", "Bearer " + token)
      		.accept(MediaType.APPLICATION_JSON) 
      		.get(JSONObject.class);
      }
     
     public JSONObject notas(String token){//Trae las notas
    	 return client.resource("http://notitas.herokuapp.com")
      		.path("student/assignments")
      		.header("Authorization", "Bearer " + token)
      		.accept(MediaType.APPLICATION_JSON) 
      		.get(JSONObject.class);
      }
     

}
