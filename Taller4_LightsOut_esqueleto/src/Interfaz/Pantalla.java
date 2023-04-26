package Interfaz;
import javax.swing.*;
import java.awt.*;



public class Pantalla extends JFrame{
	
	public Pantalla() {
		
		setLayout( new BorderLayout());

		Panel_inferior paneli = new Panel_inferior();
		Panel_superior panels = new Panel_superior();
		
		add(paneli,BorderLayout.SOUTH);
		add(panels,BorderLayout.NORTH); 
			
		setTitle("Juego ligths out");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,350);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pantalla();

	}

}
