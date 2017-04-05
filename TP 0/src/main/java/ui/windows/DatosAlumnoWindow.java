package ui.windows;

import java.awt.Color;

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
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import usuario.Alumno;

import ui.vm.DatosViewModel;


@SuppressWarnings({ "serial", "unused" })
public class DatosAlumnoWindow extends Dialog<DatosViewModel> {


	public DatosAlumnoWindow(WindowOwner parent) {
		super(parent, new DatosViewModel());
	}
	
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Datos Alumno");
		
		
		formPanel.setLayout(new VerticalLayout());
		formPanel.setWidth(500);

		new Label(formPanel).setText("Codigo: ");
		new Label(formPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("code");
		
		new Label(formPanel).setText("Nombre: ");
		new Label(formPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("firstName");
		
		new Label(formPanel).setText("Apellido: ");
		new Label(formPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("lastName");
		
		new Label(formPanel).setText("Usuario de Git: ");
		new Label(formPanel) //
		.setBackground(Color.ORANGE)
		.bindValueToProperty("gitUser");

		
	}
	
	
	
}
