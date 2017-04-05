package usuario;

import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;
import org.uqbar.commons.utils.Observable;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;


@SuppressWarnings("unused")
@Observable
public class RequestService {
	
	
	
	private Client client;
	
	 public RequestService() {
	        this.client = Client.create();
	 }
     public ClientResponse datos(String token){// Trae datos, en la clase Alumno se ve como las uso con los setters
    	 return client.resource("http://notitas.herokuapp.com")
      		.path("student")
      		.header("Authorization", "Bearer " + token)
      		.accept(MediaType.APPLICATION_JSON)
      		.get(ClientResponse.class);
      }
     

     public ClientResponse notas(String token){// Trae datos, en la clase Nota se ve como las uso con los setters
    	 return client.resource("http://notitas.herokuapp.com")
      		.path("student/assignments")
      		.header("Authorization", "Bearer " + token)
      		.accept(MediaType.APPLICATION_JSON)
      		.get(ClientResponse.class);
      }
     

}
