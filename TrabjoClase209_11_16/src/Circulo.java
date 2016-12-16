
public class Circulo extends FiguraGeometrica{

	private Punto Centro;
	private double Rad;
	
	
	public Circulo(Punto  Centro, double rad){
		
		this.Centro= Centro;
		this.Rad= rad;
	}
	
	
	public Circulo(){
		
		Centro= new Punto();
		Rad=1;
	}
	
	
	public double CalcularArea(Punto pta, double rad){
		
		return Math.PI*Math.pow(rad, 2);	
	}
	
	public Punto getCentro() {
		return Centro;
	}


	public void setCentro(Punto centro) {
		Centro = centro;
	}


	public double getRad() {
		return Rad;
	}


	public void setRad(double rad) {
		Rad = rad;
	}


	@Override
	public String toString() {
		return "Circulo [Centro=" + Centro + ", Rad=" + Rad + "]";
	}



	@Override
	public double CalcularArea(Punto pta, Punto ptb, Punto ptc, Punto ptd, int Indicador) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double CalcularArea(Punto pta, Punto ptb, Punto ptc, int Indicador) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
	
}
