package ui.windows;

import org.uqbar.arena.windows.Dialog;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import ui.vm.PlanillaNotasViewModel;
import usuario.Asignatura;

@SuppressWarnings("serial")
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