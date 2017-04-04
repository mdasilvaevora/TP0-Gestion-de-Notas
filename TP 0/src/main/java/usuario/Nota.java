package usuario;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.uqbar.arena.widgets.List;
import org.uqbar.commons.utils.Observable;

@Observable
public class Nota {

	public int id;
	public String titulo;
	public String descripcion;
	public String calificaciones; /* Apa las papas aca. Momentaneamente es una decision sin seguridad. Hay que ver
									 como pasar la lista de calificaciones del servidor al JSONObject.
									 Defini esa lista de numeros, como un string, porque acuerdense que las notas
									 pueden ser letras(Conceptuales) o numericas.
									 No se si definiendolo como un string vamos a solucionar algo, pero habria
									 que pensar esto mas adelante. Yo diria dejarlo pa lo ultimo, ya que en todo
									 campo menos. Primero veamos de como bindear las cosas*/
//	RequestService cliente = new RequestService();
	
	//public String token;
	
	/*
	public JSONObject datosNota(){
		return cliente.notas(token);
	}'
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = this.datosNota().optInt("id");
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo= this.datosNota().optString("title");
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion =this.datosNota().optString("description");
	}
	
	/* Aca esta el Par(Getter y Setter) del atributo calificaciones */
	/*public String getCalificaciones(){
		return calificaciones;
	}
	
	public void setCalificaciones(JSONArray calificaciones){
		this.calificaciones = this.datosNota().optJSONArray("grades").toString();
	}
}
*/
  
	/*
public static void main(String[] args) throws Exception{
		
		Nota nota = new Nota();
		nota.setToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho");
		
		System.out.println(nota.datosNota());
	

}
*/

/*
{
	  "assignments": [
	    {
	      "id": 1,
	      "title": "Primer Parcial",
	      "description": null,
	      "grades": [
	        {
	          "id": 1,
	          "value": 2,
	          "created_at": "2017-03-25T13:56:07.526Z",
	          "updated_at": "2017-03-25T13:56:07.526Z"
	        },
	        {
	          "id": 2,
	          "value": 7,
	          "created_at": "2017-03-25T13:56:07.595Z",
	          "updated_at": "2017-03-25T13:56:07.595Z"
	        }
	      ]
	    },
	    {
	      "id": 3,
	      "title": "TPA1",
	      "description": "Primera Entrega del TP Anual",
	      "grades": [
	        {
	          "id": 4,
	          "value": "B+",
	          "created_at": "2017-03-25T13:56:07.649Z",
	          "updated_at": "2017-03-25T13:56:07.649Z"
	        }
	      ]
	    }
	  ]
	}
*/
	
}