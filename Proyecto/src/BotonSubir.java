import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;


public class BotonSubir {
	public BotonSubir(int x, int y, final JLabel lista,final JTextField pedido,final JFrame pantalla){
		final JButton boton = new JButton();
		boton.setBounds(x,y, 100, 30);
		boton.setText("Aceptar");
		pantalla.add(boton);
		boton.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						String textPedido = pedido.getText();
						lista.setText(textPedido);
					}
		});
		
		
	}

}
