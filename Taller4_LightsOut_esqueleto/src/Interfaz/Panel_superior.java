package Interfaz;
import javax.swing.*;
import java.awt.*;

public class Panel_superior extends JPanel{
	public Panel_superior() {
		 setLayout(new FlowLayout());
		 JLabel Tama�o = new JLabel("Tama�o");
		 JLabel dificultad = new JLabel("Dificultad");
		 JLabel facil = new JLabel("F�cil");
		 JLabel medio = new JLabel("Medio");
		 JLabel dificil = new JLabel("Dif�cil");
		 
		 add(Tama�o);
		 add(dificultad);
		 add(facil);
		 add(medio);
		 
		 add(dificil);
		 
		 
		
		
		 
	 }

}
