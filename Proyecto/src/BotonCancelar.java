import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class BotonCancelar{
	
	public BotonCancelar(int x, int y,final JFrame pantalla){
		final JButton boton = new JButton();
		boton.setBounds(x,y, 100, 30);
		boton.setText("Cancelar");
		pantalla.add(boton);
		boton.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						pantalla.setVisible(false);
					}
		});
		
		
	}
}
