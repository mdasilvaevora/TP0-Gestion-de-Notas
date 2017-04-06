package ui.windows;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;


import ui.vm.TokenViewModel;


@SuppressWarnings("serial")
public class IngresarToken extends SimpleWindow<TokenViewModel>{

	public IngresarToken(WindowOwner parent) {
		super(parent, new TokenViewModel());
	}
	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Sistema de calificaciones");
		Panel form = new Panel(mainPanel);
		form.setLayout(new ColumnLayout(2));
		
		new Label(form).setText("Ingrese su Token");
		
		new TextBox(form).setWidth(400).bindValueToProperty("token");
		
		
	}
	
	protected void addActions(Panel actionsPanel) {
		new Button(actionsPanel)
		.setCaption("Ingresar")
		.onClick(this::DatosAlumnoWindow);
	
	}
	
	public void DatosAlumnoWindow() {
		Dialog<?> dialog = new DatosAlumnoWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
}
	
/* tira error en el dialog
	public void PlanillaNotasWindow() {
		Dialog<?> dialog = new PlanillaNotasWindow(this); 
		dialog.open();
		dialog.onAccept(() -> {});
}
*/
			
}
