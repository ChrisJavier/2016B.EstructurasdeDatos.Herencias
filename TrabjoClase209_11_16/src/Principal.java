import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Principal extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	private JLabel lblTituloGui, lblOpciones, lblCoordX, lblCoordY, lblPto1, lblPto2, lblPto3, lblPto4, lblRad, lblSector;
	private JButton btmAceptar, btmCancelar, btmSalir;
	private JComboBox cboFiguras;
	private JTextField txtCoordX, txtCoordY, txtCoordX1, txtCoordY1, txtCoordX2, txtCoordY2, txtCoordX3, txtCoordY3, txtCoordRad;
	private JPanel pnlPrincipal;
	private Container cntPrincipal;
	
	private String[] arrElemGeoM={"Punto","Linea", "Cuadrilateros","Circulo","Triangulo"};
	
	private Punto Pt1= new Punto();
	private Linea Lin1= new Linea();
	private Cuadrilateros Cuadri1= new Cuadrilateros();
	private Circulo Circ1= new Circulo();
	private Triangulo Trian1= new Triangulo();
	
	public Principal(){
		
		super("Geometria");
		
		
		cntPrincipal=getContentPane();
		cntPrincipal.setLayout(new BorderLayout());
		
		
		pnlPrincipal= new JPanel();
		pnlPrincipal.setLayout(null);
		pnlPrincipal.setPreferredSize(new Dimension(200, 400));
		
		lblTituloGui = new JLabel("Programa de Geometria");
		lblTituloGui.setBounds(100,0,200,40);
		pnlPrincipal.add(lblTituloGui);
		
		lblOpciones = new JLabel("Elija una opcion...");
		lblOpciones.setBounds(50,70,200,40);
		pnlPrincipal.add(lblOpciones);
		
		cboFiguras = new JComboBox(arrElemGeoM);
		cboFiguras.setBounds(180,80,150,20);
		cboFiguras.setSelectedIndex(-1);
		cboFiguras.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent a) {
				// TODO Auto-generated method stub
				
				if(a.getStateChange()==ItemEvent.SELECTED)
					cboFiguras.getSelectedIndex();
				if(cboFiguras.getSelectedIndex()==0){
					Limpiar();
					txtCoordX.setEnabled(true);
					txtCoordY.setEnabled(true);
					txtCoordX1.setEnabled(false);
					txtCoordY1.setEnabled(false);
					txtCoordX2.setEnabled(false);
					txtCoordY2.setEnabled(false);
					txtCoordX3.setEnabled(false);
					txtCoordY3.setEnabled(false);
					txtCoordRad.setEditable(false);
				}else if(cboFiguras.getSelectedIndex()==1){
					Limpiar();
					txtCoordX.setEnabled(true);
					txtCoordY.setEnabled(true);
					txtCoordX1.setEnabled(true);
					txtCoordY1.setEnabled(true);
					txtCoordX2.setEnabled(false);
					txtCoordY2.setEnabled(false);
					txtCoordX3.setEnabled(false);
					txtCoordY3.setEnabled(false);
					txtCoordRad.setEditable(false);
				}else if(cboFiguras.getSelectedIndex()==2){
					Limpiar();
					txtCoordX.setEnabled(true);
					txtCoordY.setEnabled(true);
					txtCoordX1.setEnabled(true);
					txtCoordY1.setEnabled(true);
					txtCoordX2.setEnabled(true);
					txtCoordY2.setEnabled(true);
					txtCoordX3.setEnabled(true);
					txtCoordY3.setEnabled(true);
					txtCoordRad.setEditable(false);
				}else if(cboFiguras.getSelectedIndex()==3){
					Limpiar();
					txtCoordX.setEnabled(true);
					txtCoordY.setEnabled(true);
					txtCoordX1.setEnabled(false);
					txtCoordY1.setEnabled(false);
					txtCoordX2.setEnabled(false);
					txtCoordY2.setEnabled(false);
					txtCoordX3.setEnabled(false);
					txtCoordY3.setEnabled(false);
					txtCoordRad.setEnabled(true);
				}else{
					Limpiar();
					txtCoordX.setEnabled(true);
					txtCoordY.setEnabled(true);
					txtCoordX1.setEnabled(true);
					txtCoordY1.setEnabled(true);
					txtCoordX2.setEnabled(true);
					txtCoordY2.setEnabled(true);
					txtCoordX3.setEnabled(false);
					txtCoordY3.setEnabled(false);
					txtCoordRad.setEditable(false);
				}
				}
		});
		pnlPrincipal.add(cboFiguras);
		
		lblSector = new JLabel("------------------------Escriba sus puntos y longitudes ----------------------");
		lblSector.setBounds(10,140,400,30);
		pnlPrincipal.add(lblSector);
		
		lblCoordX = new JLabel("Coordenada X");
		lblCoordX.setBounds(10,220,200,30);
		pnlPrincipal.add(lblCoordX);
		
		lblCoordY = new JLabel("Coordenada Y");
		lblCoordY.setBounds(10,260, 200, 30);
		pnlPrincipal.add(lblCoordY);
		
		lblRad = new JLabel("Radio");
		lblRad.setBounds(10,300,200,30);
		pnlPrincipal.add(lblRad);
		
		lblPto1 = new JLabel("Punto A");
		lblPto1.setBounds(110, 180, 100, 30);
		pnlPrincipal.add(lblPto1);
		
		lblPto2 = new JLabel("Punto B");
		lblPto2.setBounds(180, 180, 100, 30);
		pnlPrincipal.add(lblPto2);
		
		lblPto3 = new JLabel("Punto C");
		lblPto3.setBounds(250, 180, 100, 30);
		pnlPrincipal.add(lblPto3);
		
		lblPto4 = new JLabel("Punto D");
		lblPto4.setBounds(320, 180, 100, 30);
		pnlPrincipal.add(lblPto4);
		
		txtCoordX = new JTextField();
		txtCoordX.setBounds(110, 220, 50, 20);
		txtCoordX.setEnabled(false);
		pnlPrincipal.add(txtCoordX);
		
		txtCoordX1 = new JTextField();
		txtCoordX1.setBounds(180, 220, 50, 20);
		txtCoordX1.setEnabled(false);
		pnlPrincipal.add(txtCoordX1);
		
		txtCoordX2 = new JTextField();
		txtCoordX2.setBounds(250, 220, 50, 20);
		txtCoordX2.setEnabled(false);
		pnlPrincipal.add(txtCoordX2);
		
		txtCoordX3 = new JTextField();
		txtCoordX3.setBounds(320, 220, 50, 20);
		txtCoordX3.setEnabled(false);
		pnlPrincipal.add(txtCoordX3);
		
		txtCoordY = new JTextField();
		txtCoordY.setBounds(110, 260, 50, 20);
		txtCoordY.setEnabled(false);
		pnlPrincipal.add(txtCoordY);
		
		txtCoordY1 = new JTextField();
		txtCoordY1.setBounds(180, 260, 50, 20);
		txtCoordY1.setEnabled(false);
		pnlPrincipal.add(txtCoordY1);
		
		txtCoordY2 = new JTextField();
		txtCoordY2.setBounds(250, 260, 50, 20);
		txtCoordY2.setEnabled(false);
		pnlPrincipal.add(txtCoordY2);
		
		txtCoordY3 = new JTextField();
		txtCoordY3.setBounds(320, 260, 50, 20);
		txtCoordY3.setEnabled(false);
		pnlPrincipal.add(txtCoordY3);
		
		txtCoordRad = new JTextField();
		txtCoordRad.setBounds(110, 300, 50, 20);
		txtCoordRad.setEnabled(false);
		pnlPrincipal.add(txtCoordRad);
		
		btmAceptar = new JButton();
		btmAceptar.setText("Aceptar");
		btmAceptar.setBounds(20, 350, 100, 30);
		btmAceptar.setActionCommand("aceptar");
		btmAceptar.addActionListener(this);
		pnlPrincipal.add(btmAceptar);
		
		btmSalir= new JButton();
		btmSalir.setText("Salir");
		btmSalir.setBounds(140, 350, 100, 30);
		btmSalir.setActionCommand("salir");
		btmSalir.addActionListener(this);
		pnlPrincipal.add(btmSalir);
		
		btmCancelar = new JButton();
		btmCancelar.setText("Cancelar");
		btmCancelar.setBounds(250, 350, 100, 30);
		btmCancelar.setActionCommand("cancelar");
		btmCancelar.addActionListener(this);
		pnlPrincipal.add(btmCancelar);
		
		
		cntPrincipal.add(pnlPrincipal, BorderLayout.NORTH);
		
		
		super.setBounds(10,5,400,450);
		this.setVisible(true);
	}
	
	public static void main (String args[]){
		
		
		Principal app = new Principal();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		double DistLd, DistLdTemp;
		double La,Lb,Lc,Ld;
		
		if(action.equals("aceptar")){
		
			if(!ValidarContenido().equals("")){
				Imprimir(ValidarContenido());
			}else{
				GuardarClases();
				if(cboFiguras.getSelectedIndex()==0 || cboFiguras.getSelectedIndex()==1){
					Imprimir(cboFiguras.getSelectedIndex()==0 ? "LAS COORDENADAS DEL PUNTO(X,Y)  SON:   ("+Pt1.getX()
					+","+Pt1.getY()+")":cboFiguras.getSelectedIndex()==1 ? "LAS COORDENADAS DE LA RECTA SON EN (X,Y):\nPUNTO A ("+Lin1.getA().getX()
					+","+Lin1.getA().getY()+")"+" Y  PUNTO B ("+Lin1.getB().getX()+","+Lin1.getB().getY()+")"
					+"\nLA DISTANCIA  DE LA RECTA ES:  "+(Math.sqrt(Math.pow((Lin1.getB().getX()-Lin1.getA().getX()), 2)
							+Math.pow((Lin1.getB().getY()-Lin1.getA().getY()), 2)))+" Unidades":"");
				
				}else if(cboFiguras.getSelectedIndex()==2){
					GuardarClases();
					DistLd=Math.sqrt(Math.pow((Cuadri1.getPtc().getX()-Cuadri1.getPta().getX()), 2)+Math.pow((Cuadri1.getPtc().getY()-Cuadri1.getPta().getY()), 2));
					DistLdTemp=Math.sqrt(Math.pow((Cuadri1.getPtd().getX()-Cuadri1.getPtb().getX()), 2)+Math.pow((Cuadri1.getPtd().getY()-Cuadri1.getPtb().getY()), 2));
					
					La=Math.sqrt(Math.pow((Cuadri1.getPtb().getX()-Cuadri1.getPta().getX()), 2)+Math.pow((Cuadri1.getPtb().getY()-Cuadri1.getPta().getY()), 2));
					Lb=Math.sqrt(Math.pow((Cuadri1.getPtc().getX()-Cuadri1.getPtb().getX()), 2)+Math.pow((Cuadri1.getPtc().getY()-Cuadri1.getPtb().getY()), 2));
					Lc=Math.sqrt(Math.pow((Cuadri1.getPtc().getX()-Cuadri1.getPtd().getX()), 2)+Math.pow((Cuadri1.getPtc().getY()-Cuadri1.getPtd().getY()), 2));
					Ld=Math.sqrt(Math.pow((Cuadri1.getPta().getX()-Cuadri1.getPtd().getX()), 2)+Math.pow((Cuadri1.getPta().getY()-Cuadri1.getPtd().getY()), 2));
					
					if(DistLd==DistLdTemp && La==Lb && Lb==Lc && Lc==Ld && Ld==La){
						Imprimir("\n La Figura es un Cuadrado de Lado: "+La+"\nSu Area es : "+Cuadri1.CalcularArea(Cuadri1.getPta(),Cuadri1.getPtb(),Cuadri1.getPtc(),Cuadri1.getPtd(),0)+" Unidades Cubicas");
					}else if(DistLd!=DistLdTemp && La==Lb && Lb==Lc && Lc==Ld && Ld==La){
						Imprimir("\n La Figura es un Rombo de Lado: "+La+"\nSu Area es : "+Cuadri1.CalcularArea(Cuadri1.getPta(),Cuadri1.getPtb(),Cuadri1.getPtc(),Cuadri1.getPtd(),2)+" Unidades Cubicas");
						
					}else if(DistLd!=DistLdTemp && La!=Lb && Lc!=Ld){
						Imprimir("\n La Figura es un Rectangulo de Lados: \nBase :"+La+" y Altura"+Lb+"\nSu Area es : "+Cuadri1.CalcularArea(Cuadri1.getPta(),Cuadri1.getPtb(),Cuadri1.getPtc(),Cuadri1.getPtd(),1)+" Unidades Cubicas");
					}else if(DistLd!=DistLdTemp && La!=Lc){
						Imprimir("\n La Figura es un Trapecio de Lados: \n Base Mayor:"+Lc+" y Base Menor"+La+"\nSu Area es : "+Cuadri1.CalcularArea(Cuadri1.getPta(),Cuadri1.getPtb(),Cuadri1.getPtc(),Cuadri1.getPtd(),1)+" Unidades Cubicas");
					}
					
				}else if(cboFiguras.getSelectedIndex()==3){
					GuardarClases();
					Imprimir("\nEl Circulo tiene Radio:"+Circ1.getRad()+"  y un Centro(x, y):  ("+Circ1.getCentro().getX()+","+Circ1.getCentro().getY()+") \nSu Area es : "+Circ1.CalcularArea(Circ1.getCentro(),Circ1.getRad())+" Unidades Cubicas");
					
				}else{
					GuardarClases();
					Lc=Math.sqrt(Math.pow((Trian1.getPtB().getX()-Trian1.getPtA().getX()), 2)+Math.pow((Trian1.getPtB().getY()-Trian1.getPtA().getY()), 2));
					La=Math.sqrt(Math.pow((Trian1.getPtC().getX()-Trian1.getPtB().getX()), 2)+Math.pow((Trian1.getPtC().getY()-Trian1.getPtB().getY()), 2));
					Lb=Math.sqrt(Math.pow((Trian1.getPtC().getX()-Trian1.getPtA().getX()), 2)+Math.pow((Trian1.getPtC().getY()-Trian1.getPtA().getY()), 2));

					if(La>Lc && La>Lb){
						Imprimir("\n La Figura es un Triangulo Rectangulo de hipotenusa: "+La+" y catetos de :"+Lb+" y "+Lc+"\nSu Area es : "+Trian1.CalcularArea(Trian1.getPtA(), Trian1.getPtB(), Trian1.getPtC(),0)+" Unidades Cubicas");
					}else if(La==Lb && Lb==Lc && Lc==La){
						Imprimir("\n La Figura es un Triangulo Equilatero de Lado: "+La+"\nSu Area es : "+Trian1.CalcularArea(Trian1.getPtA(), Trian1.getPtB(), Trian1.getPtC(),3)+" Unidades Cubicas");
					}else if(La==Lb || Lb==Lc || Lc==La){
						Imprimir("\n La Figura es un Triangulo Isoceles de LadoS: \n Lados Iguales :"+La+ " Lado Desigual : "+(La==Lb ? Lc: Lb==Lc ? La: Lc==La ? Lb:"Na")+"\nSu Area es : "+Trian1.CalcularArea(Trian1.getPtA(), Trian1.getPtB(), Trian1.getPtC(),4)+" Unidades Cubicas");
					}else if(La!=Lb && Lb!=Lc && Lc!=La){
						Imprimir("\n La Figura es un Triangulo Escaleno de Lados: \nLado A : "+La+"  LADO B :"+Lb+"  Lado C : "+Lc+"\nSu Area es : "+Trian1.CalcularArea(Trian1.getPtA(), Trian1.getPtB(), Trian1.getPtC(),5)+" Unidades Cubicas");
					}
				}
			}
			
			
		}else if(action.equals("salir")){
			System.exit(0);
		}else if(action.equals("cancelar")){
			
			cboFiguras.setSelectedIndex(-1);
			txtCoordX.setEnabled(false);
			txtCoordY.setEnabled(false);
			txtCoordX1.setEnabled(false);
			txtCoordY1.setEnabled(false);
			txtCoordX2.setEnabled(false);
			txtCoordY2.setEnabled(false);
			txtCoordX3.setEnabled(false);
			txtCoordY3.setEnabled(false);
			txtCoordRad.setEnabled(false);
			Limpiar();
			
			
		}
		
		
		
	}
	public String ValidarContenido(){
		
		if(cboFiguras.getSelectedIndex()==-1){
			return "\nError, Elija una opcion";
		}else if(cboFiguras.getSelectedIndex()==0){
			try{
				Integer.parseInt(txtCoordX.getText());
				Integer.parseInt(txtCoordY.getText());
			}catch(Exception e)
			{
				return"\nError,  Caracteres incorrectos O ningun contenido encontrado";
			}
			return"";
		}else if(cboFiguras.getSelectedIndex()==1){
			try{
				Integer.parseInt(txtCoordX.getText());
				Integer.parseInt(txtCoordY.getText());
				Integer.parseInt(txtCoordX1.getText());
				Integer.parseInt(txtCoordY1.getText());
			}catch(Exception e)
			{
				return"\nError,  Caracteres incorrectos O ningun contenido encontrado";
			}
			return"";
		}else if(cboFiguras.getSelectedIndex()==2){
			try{
				Integer.parseInt(txtCoordX.getText());
				Integer.parseInt(txtCoordY.getText());
				Integer.parseInt(txtCoordX1.getText());
				Integer.parseInt(txtCoordY1.getText());
				Integer.parseInt(txtCoordX2.getText());
				Integer.parseInt(txtCoordY2.getText());
				Integer.parseInt(txtCoordX3.getText());
				Integer.parseInt(txtCoordY3.getText());
			}catch(Exception e)
			{
				return"\nError,  Caracteres incorrectos O ningun contenido encontrado";
			}
			return"";
		}else if(cboFiguras.getSelectedIndex()==3){
			try{
				Integer.parseInt(txtCoordX.getText());
				Integer.parseInt(txtCoordY.getText());
				Integer.parseInt(txtCoordRad.getText());
			}catch(Exception e)
			{
				return"\nError,  Caracteres incorrectos O ningun contenido encontrado";
			}
			return"";
		}else if(cboFiguras.getSelectedIndex()==4){
			try{
				Integer.parseInt(txtCoordX.getText());
				Integer.parseInt(txtCoordY.getText());
				Integer.parseInt(txtCoordX1.getText());
				Integer.parseInt(txtCoordY1.getText());
				Integer.parseInt(txtCoordX2.getText());
				Integer.parseInt(txtCoordY2.getText());
			}catch(Exception e)
			{
				return"\nError,  Caracteres incorrectos O ningun contenido encontrado";
			}
			return"";
		}
		return "";
		
	}
	public void Imprimir(String Cad){
		JOptionPane.showMessageDialog(null, Cad);
	}
	public void Limpiar(){
		txtCoordX.setText("");
		txtCoordY.setText("");
		txtCoordX1.setText("");
		txtCoordY1.setText("");
		txtCoordX2.setText("");
		txtCoordY2.setText("");
		txtCoordX3.setText("");
		txtCoordY3.setText("");
		txtCoordRad.setText("");
		
	}
	public void GuardarClases(){
		if(cboFiguras.getSelectedIndex()==0){
			
				Pt1.setX(Double.parseDouble(txtCoordX.getText()));
				Pt1.setY(Double.parseDouble(txtCoordY.getText()));
		
		}else if(cboFiguras.getSelectedIndex()==1){

			Lin1.setA(new Punto(Double.parseDouble(txtCoordX.getText()),Double.parseDouble(txtCoordY.getText())));
			Lin1.setB(new Punto(Double.parseDouble(txtCoordX1.getText()),Double.parseDouble(txtCoordY1.getText())));
		}else if(cboFiguras.getSelectedIndex()==2){
			
				Cuadri1.setPta(new Punto(Double.parseDouble(txtCoordX.getText()),Double.parseDouble(txtCoordY.getText())));
				Cuadri1.setPtb(new Punto(Double.parseDouble(txtCoordX1.getText()),Double.parseDouble(txtCoordY1.getText())));
				Cuadri1.setPtc(new Punto(Double.parseDouble(txtCoordX2.getText()),Double.parseDouble(txtCoordY2.getText())));
				Cuadri1.setPtd(new Punto(Double.parseDouble(txtCoordX3.getText()),Double.parseDouble(txtCoordY3.getText())));
				
		}else if(cboFiguras.getSelectedIndex()==3){

			Circ1.setCentro(new Punto(Double.parseDouble(txtCoordX.getText()),Double.parseDouble(txtCoordY.getText())));
			Circ1.setRad(Double.parseDouble(txtCoordRad.getText()));
			
		}else if(cboFiguras.getSelectedIndex()==4){

			Trian1.setPtA(new Punto(Double.parseDouble(txtCoordX.getText()),Double.parseDouble(txtCoordY.getText())));
			Trian1.setPtB(new Punto(Double.parseDouble(txtCoordX1.getText()),Double.parseDouble(txtCoordY1.getText())));
			Trian1.setPtC(new Punto(Double.parseDouble(txtCoordX2.getText()),Double.parseDouble(txtCoordY2.getText())));
		}
	}
}
