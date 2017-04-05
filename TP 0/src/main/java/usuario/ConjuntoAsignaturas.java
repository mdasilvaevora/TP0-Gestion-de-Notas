package usuario;

import java.util.LinkedList;
import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class ConjuntoAsignaturas {
	
	private List<Asignatura> assignments = new LinkedList();	
	
	public void setAssignments (List<Asignatura> assignments){
		this.assignments = assignments;
	}
	
	public List<Asignatura> getAssignments (){
		return this.assignments;
	}

}

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