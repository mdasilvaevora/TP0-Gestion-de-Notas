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
import usuario.Asignatura;
import usuario.Nota;

public class PlanillaNotasWindow extends Dialog<PlanillaNotasViewModel> {
	
	public PlanillaNotasWindow(WindowOwner parent) {
		super(parent, new PlanillaNotasViewModel());
	}
	
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Notas");
			
		Table<Asignatura> table = new Table<Asignatura>(formPanel, Asignatura.class);
		table.setHeight(200);
		table.setWidth(450);
		table.bindItemsToProperty("asignaturas");//setAdapter(new PropertyAdapter(Asignatura.class, "id"));
		table.bindValueToProperty("asignaturaSeleccionada.id");//setAdapter(new PropertyAdapter(Nota.class, "id"));
		
		new Column<Asignatura>(table)
	    .setTitle("Title")
	    .setFixedSize(150)
	    .bindContentsToProperty("id");
		
		new Column<Asignatura>(table)
	    .setTitle("Titulo")
	    .setFixedSize(150)
	    .bindContentsToProperty("title");
		
		new Column<Asignatura>(table)
	    .setTitle("Descripcion")
	    .setFixedSize(150)
	    .bindContentsToProperty("description");
		
		new Column<Asignatura>(table)
	    .setTitle("Calificaciones")
	    .setFixedSize(150)
	    .bindContentsToProperty("grades");
	    
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}
	

}		