package Interfaz;
import javax.swing.*;
import java.awt.*;

public class Panel_inferior extends JPanel {
 public Panel_inferior() {
	 setLayout(new FlowLayout());
	 JLabel jugadas = new JLabel("jugadas");
	 JLabel jugador = new JLabel("jugador");
	 JTextField numeroJugadas = new JTextField(""); 
	 JTextField nombrejug = new JTextField("");
	
	
	 
	 
	 add(jugadas);
	 add(numeroJugadas);
	 add(jugador);
	 add(nombrejug);
	 
 }
 
 

	
}
