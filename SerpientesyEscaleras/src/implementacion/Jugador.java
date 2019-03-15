package implementacion;

import javax.swing.JOptionPane;

public class Jugador extends Ficha {
	public String nombre;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void escogerFicha() {
		
		setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
		setColorFicha(JOptionPane.showInputDialog("Ingrese el color de la ficha"));
		
	}
	
	
}
