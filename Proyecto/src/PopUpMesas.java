import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;


public class PopUpMesas extends JFrame{
	private JLabel titulo;
	private JList lista;
	private JTextField pedido;
	public PopUpMesas(){
		configurarPopUp("Configure su mesa",400,400);
		inicializarComponentes();
	}
	
	
	public void configurarPopUp(String nombreVentana,int x ,int y) {
        this.setTitle(nombreVentana);                   // colocamos titulo a la ventana
        this.setSize(x, y);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
	
	public void inicializarComponentes(){
		titulo = new JLabel();
		lista = new JList();
		pedido = new JTextField(20);
		String textPedido = pedido.getText();
		titulo.setText("Cargue el pedido");
		titulo.setBounds(120, 20, 200, 30);
		pedido.setBounds(0,200,210,40);
		this.add(titulo);
		this.add(pedido);
		BotonCancelar cancelar = new BotonCancelar(150, 300, this);
		BotonSubir subir = new BotonSubir(250, 300, this);
		
	}
	
}
