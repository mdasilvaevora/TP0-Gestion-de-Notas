package ui.windows;

import java.awt.Color;
import java.awt.Dialog;

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
/* tira error en el dialog con PlanillaNotasViewModel
public class PlanillaNotasWindow extends Dialog<PlanillaNotasViewModel> {


	public PlanillaNotasWindow(WindowOwner parent) {
		super();
	}
	
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Asignaciones y Notas Alumno");
		
		
		formPanel.setLayout(new VerticalLayout());
		formPanel.setWidth(500);

		
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
	
}*/

/*
 {"assignments":[{"id":1,"title":"TPA1","description":"Entrega 1 del TP Anual","grades":[]},
 {"id":2,"title":"TPA2","description":"Entrega 2 del TP Anual","grades":[]}]}
 */
