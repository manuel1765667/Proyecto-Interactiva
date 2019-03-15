package Interfaz;

import java.awt.*;

import javax.swing.*;

public class dibujarRectangulo extends JPanel{
		
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.cyan);
		g.drawRect(5, 1, 100, 100);
		g.fillRect(5, 1, 100, 100);
		
	}
	public static void main(String[] args) {
		
		GridLayout layout = new GridLayout(5,5,0,0);
		JPanel panel = new JPanel(layout);
		
		JFrame frame = new JFrame("Serpientas y Escaleras");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < 25; i++) {
			for(int j = 0; i < 25; i++) {
		dibujarRectangulo rectangulo = new dibujarRectangulo();
		rectangulo.setBackground(Color.white);
		panel.add(rectangulo);
		frame.add(panel);
			}
		}
		
		
		frame.setVisible(true);
		frame.setSize(500,500);
		
	}
}