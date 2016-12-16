
public class Cuadrilateros extends FiguraGeometrica {

	private Punto pta;
	private Punto ptb;
	private Punto ptc;
	private Punto ptd;
	
	public Cuadrilateros(Punto pta, Punto ptb, Punto ptc, Punto ptd){
		this.pta= pta;
		this.ptb=ptb;
		this.ptc= ptc;
		this.ptd= ptd;
	}
	
	public Cuadrilateros(){
		pta= new Punto(0,0);
		ptb= new Punto(0,1);
		ptc= new Punto(1,0);
		ptd= new Punto(1,1);
	}

	public Punto getPta() {
		return pta;
	}

	public double CalcularArea(Punto pta, Punto ptb, Punto ptc, Punto ptd, int Indicador){
		
		double a, b, alt,c,d;
		
		if(Indicador==0){
			a=Math.sqrt(Math.pow((ptb.getX()-pta.getX()), 2)+Math.pow((ptb.getY()-pta.getY()), 2));
			return a*a;
		}else if(Indicador==1){
			a=Math.sqrt(Math.pow((ptb.getX()-pta.getX()), 2)+Math.pow((ptb.getY()-pta.getY()), 2));
			b=Math.sqrt(Math.pow((ptc.getX()-ptd.getX()), 2)+Math.pow((ptc.getY()-ptd.getY()), 2));
			return a*b;
		}else if(Indicador==2){
			a=Math.sqrt(Math.pow((ptc.getX()-pta.getX()), 2)+Math.pow((ptc.getY()-pta.getY()), 2));
			b=Math.sqrt(Math.pow((ptd.getX()-ptb.getX()), 2)+Math.pow((ptd.getY()-ptb.getY()), 2));
			return a*b/2;
		}else if(Indicador==3){
			a=Math.sqrt(Math.pow((ptb.getX()-pta.getX()), 2)+Math.pow((ptb.getY()-pta.getY()), 2));
			b=Math.sqrt(Math.pow((ptc.getX()-ptd.getX()), 2)+Math.pow((ptc.getY()-ptd.getY()), 2));
			c=Math.sqrt(Math.pow((ptd.getX()-pta.getX()), 2)+Math.pow((ptd.getY()-pta.getY()), 2));
			d=Math.sqrt(Math.pow((ptc.getX()-ptb.getX()), 2)+Math.pow((ptc.getY()-ptb.getY()), 2));
			alt=(Math.sqrt(4*Math.pow((b-a), 2)*c-Math.pow(Math.pow(c, 2)+ Math.pow((b-a), 2)-Math.pow(d, 2),2)))/2*(b-a);
			return (a+b)*alt/2;
		}
		
		return 0;
		
		
			
	}
	public void setPta(Punto pta) {
		this.pta = pta;
	}

	public Punto getPtb() {
		return ptb;
	}

	public void setPtb(Punto ptb) {
		this.ptb = ptb;
	}

	public Punto getPtc() {
		return ptc;
	}

	public void setPtc(Punto ptc) {
		this.ptc = ptc;
	}

	public Punto getPtd() {
		return ptd;
	}

	public void setPtd(Punto ptd) {
		this.ptd = ptd;
	}

	@Override
	public String toString() {
		return "Cuadrado [pta=" + pta + ", ptb=" + ptb + ", ptc=" + ptc
				+ ", ptd=" + ptd + "]";
	}

	@Override
	public double CalcularArea(Punto pta, double rad) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double CalcularArea(Punto pta, Punto ptb, Punto ptc, int Indicador) {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
}
