package Interfaz;
import javax.swing.*;
import java.awt.*;

public class Panel_superior extends JPanel{
	public Panel_superior() {
		 setLayout(new FlowLayout());
		 JLabel Tamaño = new JLabel("Tamaño");
		 JLabel dificultad = new JLabel("Dificultad");
		 JLabel facil = new JLabel("Fácil");
		 JLabel medio = new JLabel("Medio");
		 JLabel dificil = new JLabel("Difícil");
		 
		 add(Tamaño);
		 add(dificultad);
		 add(facil);
		 add(medio);
		 
		 add(dificil);
		 
		 
		
		
		 
	 }

}
