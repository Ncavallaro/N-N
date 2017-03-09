import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;


public class BotonSubir {
	public BotonSubir(int x, int y,final JFrame pantalla){
		final JButton boton = new JButton();
		boton.setBounds(x,y, 100, 30);
		boton.setText("Aceptar");
		pantalla.add(boton);
		boton.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						
					}
		});
		
		
	}

}
