import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class VentanaPrincipal extends JFrame {
	private JLabel titulo;           // etiqueta o titulo no editable
    //private JTextField caja;        // caja de titulo, para insertar datos
    private JButton boton;          // boton con una determinada accion
    //private JButton boton1;
    //private JButton botonActual;
    private Boolean estado;
    PopUpStock popUpStock = new PopUpStock();  //creo la ventana del stock
    
	//constructor
	public VentanaPrincipal() {
		configurarVentana("Restaurante Santino",1366,768);
		inicializarComponentes(15);
	}
	
	public void configurarVentana(String nombreVentana,int x ,int y) {
        this.setTitle(nombreVentana);                   // colocamos titulo a la ventana
        this.setSize(x, y);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

	private void inicializarComponentes(int mesas){
		inicializarMesas(mesas);
		//Creamos el contenido de la pantalla principal
		titulo = new JLabel();
        boton = new JButton();
        // configuramos los componentes
        titulo.setText("Restaurante Santino");    // colocamos un titulo a la etiqueta
        titulo.setBounds(600, 20, 549, 30);   // colocamos posicion y tamanio al titulo (x, y, ancho, alto)
        boton.setText("Stock");   // colocamos un titulo al boton
        boton.setBounds(1200, 150, 120, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						popUpStock.setVisible(true); //hago visible la ventana del stock
					}
		});
       // boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
        this.add(titulo);
        this.add(boton);
		
		
	}
	
	private void inicializarMesas(int mesas){
		int x;
		HashMap<String,JButton> botones = new HashMap<String,JButton>();
		int posX=0;
		int posY=0;
		for(x=0;x<=mesas;x++) {
			final JButton boton = new JButton();
			String numeroS= Integer.toString(x);
			boton.setText(numeroS);   // colocamos un titulo al boton
			if (x==0){
				posX=30;
				posY=150;
			}
			else if (x<=4 && x>0){
				posX=(posX+130);
			}
			else if (x==5){
				posY=(posY+120);
				posX=30;
			}
			else if (x>5 && x<=9){
				posX=(posX+130);
			}
			else if(x==10){
				posY=(posY+120);
				posX=30;
			}
			else if (x>10 && x<=14){
				posX=(posX+130);
			}
			boton.setBounds(posX,posY, 100, 100);
			encenderBoton(boton);
			this.add(boton);
			botones.put("boton"+x,boton);  
			boton.addActionListener(
					new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent e) {
							//Tengo que ver la forma de que la accion de los botones sea por boton, porque como esta ahora funciona mal
							if (estado==true){
								apagarBoton(boton);
								//Cambio Cavallaro
								PopUpMesas popUp = new PopUpMesas();
								popUp.setVisible(true);
							}else{
								encenderBoton(boton);
							}
							//PopUpMesas popUp = new PopUpMesas();
							//popUp.setVisible(true);
							
						}
			});
			
		    }
		//asi es como tengo que iterar los botones.
		/*Iterator it = botones.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}*/
		
		
		
	}

	public void encenderBoton(JButton boton){
		boton.setBackground(Color.green);
		estado=true;
	}
	
	public void apagarBoton(JButton boton){
		boton.setBackground(Color.red);
		estado=false;
	}
		
	}
	
	
	
