
public class Linea {

	private Punto a;
	private Punto b;

	
	public Linea(Punto Pta, Punto Ptb) {

		this.a=Pta;
		this.b=Ptb;
	}

	public Linea(){
		
		a= new Punto(0,0);
		b= new Punto(2,2);
	}

	public Punto getA() {
		return a;
	}



	public void setA(Punto a) {
		this.a = a;
	}



	public Punto getB() {
		return b;
	}



	public void setB(Punto b) {
		this.b = b;
	}



	public String EcuacionRecta(){
		
		return "";
	}



	@Override
	public String toString() {
		return "Linea [a=" + a + ", b=" + b + "]";
	}

	


}
