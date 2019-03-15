package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tablero {
	int numJugadores;
	int numCasillas;
	int contadorTurnos;
	public int getNumJugadores() {
		return numJugadores;
	}
	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}
	public int getNumCasillas() {
		return numCasillas;
	}
	public void setNumCasillas(int numCasillas) {
		this.numCasillas = numCasillas;
	}
	public int getContadorTurnos() {
		return contadorTurnos;
	}
	public void setContadorTurnos(int contadorTurnos) {
		this.contadorTurnos = contadorTurnos;
	}
	
	public void ingresoJugadores() {
		setNumJugadores(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jugadores")));
		
	}
	
	public void mostrarJugadores() {
		
	}
	
    public void mostrarSerpientes() {
		
	}
    
    public void mostrarEscaleras() {
		
	}
    
    public void mostrarTablero() {
    	
    }
    
    public void dificultadTablero() {
    	
    }
    
    public void darTurno() {
    	
    }
    
    public void tirarDados() {
    	
    }
    
    
	
}
