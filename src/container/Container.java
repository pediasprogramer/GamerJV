
package container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import user.sigup;

import container.Fase.Fase;


public class Container extends JFrame {
    public Container (){
		add(new Fase());
    	setTitle("Meu jogo de Espaçonave ecologica");
    	ImageIcon icone = new ImageIcon("res\\icon_spaceship.png");
        this.setIconImage(icone.getImage());

		setSize(1024,728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
             
	public static void main (String [] args){
		
		user.sigup us = new sigup();
                us.setVisible(true);
	}

    
}
