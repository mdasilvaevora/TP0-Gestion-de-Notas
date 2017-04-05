package ui.windows;

import java.awt.Color;
import org.uqbar.arena.windows.Dialog;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.WindowOwner;
import ui.vm.DatosViewModel;
import ui.vm.PlanillaNotasViewModel;
import usuario.Nota;



/*Queda comentado porque me parece mas facil aunque parezca mas dificil mostrarlo en una tabla
 * ya que un alumno puede tener N notas.

//tira error en el dialog con PlanillaNotasViewModel
public class PlanillaNotasWindow extends Dialog<PlanillaNotasViewModel> {


	public PlanillaNotasWindow(WindowOwner parent) {
		super(parent, new PlanillaNotasViewModel());
	}
	
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Asignaciones y Notas Nota");
		
		
		formPanel.setLayout(new VerticalLayout());
		formPanel.setWidth(500);

		
		new Label(formPanel).setText("ID: ");
		new Label(formPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("titulo");
		
		
		new Label(formPanel).setText("Nombre: ");
		new Label(formPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("titulo");
		
		new Label(formPanel).setText("Descripcion: ");
		new Label(formPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("descripcion");
		
		new Label(formPanel).setText("Calificaciones: ");
		new Label(formPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("calificaciones");

		
	}
	
}

/*
 {"assignments":[{"id":1,"title":"TPA1","description":"Entrega 1 del TP Anual","grades":[]},
 {"id":2,"title":"TPA2","description":"Entrega 2 del TP Anual","grades":[]}]}
 */

public class PlanillaNotasWindow extends Dialog<PlanillaNotasViewModel> {
	
	public PlanillaNotasWindow(WindowOwner parent) {
		super(parent, new PlanillaNotasViewModel());
	}
	
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Notas");
			
		Table<Nota> table = new Table<Nota>(formPanel, Nota.class);
		table.setHeight(200);
		table.setWidth(450);
		/*table.bindItemsToProperty("notas");
		table.bindValueToProperty("NotaSeleccionado"); Con estos se deberia bindear a la lista notas, no se como hacerlo(nachoCasarino)*/
		
		new Column<Nota>(table)
	    .setTitle("ID")
	    .setFixedSize(150)
	    .bindContentsToProperty("id");
		
		new Column<Nota>(table)
	    .setTitle("Titulo")
	    .setFixedSize(150)
	    .bindContentsToProperty("titulo");
		
		new Column<Nota>(table)
	    .setTitle("Descripcion")
	    .setFixedSize(150)
	    .bindContentsToProperty("descripcion");
		
		new Column<Nota>(table)
	    .setTitle("Calificaciones")
	    .setFixedSize(150)
	    .bindContentsToProperty("calificaciones");
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}
	

}		