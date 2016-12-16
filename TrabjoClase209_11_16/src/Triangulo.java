
public class Triangulo extends FiguraGeometrica{

	private Punto PtA;
	private Punto PtB;
	private Punto PtC;
	
	
	
	public Triangulo(Punto PtA, Punto Pt2B, Punto PtC){
		
		this.PtA= PtA;
		this.PtB= Pt2B;
		this.PtC= PtC;
	}
	
	
	public Triangulo(){
		
		PtA= new Punto(3,3);
		PtB = new Punto(0,0);
		PtC = new Punto(3,0);
	}


	public Punto getPtA() {
		return PtA;
	}


	public void setPtA(Punto ptA) {
		PtA = ptA;
	}


	public Punto getPtB() {
		return PtB;
	}


	public void setPtB(Punto ptB) {
		PtB = ptB;
	}


	public Punto getPtC() {
		return PtC;
	}


	public void setPtC(Punto ptC) {
		PtC = ptC;
	}


	@Override
	public String toString() {
		return "Triangulo [Pt1=" + PtA + ", Pt2=" + PtB + ", Pt3=" + PtC + "]";
	}


	@Override
	public double CalcularArea(Punto pta, Punto ptb, Punto ptc, Punto ptd, int Indicador) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double CalcularArea(Punto pta, double rad) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double CalcularArea(Punto pta, Punto ptb, Punto ptc, int Indicador) {
		
		double La,Lb,Lc, alt;
		
		Lc=Math.sqrt(Math.pow((ptb.getX()-pta.getX()), 2)+Math.pow((ptb.getY()-pta.getY()), 2));
		La=Math.sqrt(Math.pow((ptc.getX()-ptb.getX()), 2)+Math.pow((ptc.getY()-ptb.getY()), 2));
		Lb=Math.sqrt(Math.pow((ptc.getX()-pta.getX()), 2)+Math.pow((ptc.getY()-pta.getY()), 2));
	
		if(Indicador==0){
			
			alt= Lb*Lc/La;
			return (Lc*alt)/2;
			
		}else if(Indicador==1){
			
			alt= Math.sqrt(Math.pow((ptc.getX()-ptc.getX()), 2)+Math.pow((ptc.getY()-pta.getY()), 2));
			return (Lc*alt)/2;
			
		}else if(Indicador==2){
			
			double s;
			
			s=(La+Lb+Lc)/2;
			
			return Math.sqrt((s*(s-La)*(s-Lb)*(s-Lc)));
		
			
		}else if(Indicador==3){
			
			return (Math.pow(La, 2)*Math.sqrt(3))/4;
			
		}else if(Indicador==4){
			
			if(La==Lb){
				
				return (Lc*Math.sqrt((Math.pow(La, 2))-(Math.pow(Lc, 2))/4))/2;
				
			}else if(Lb==Lc){
				
				return (La*Math.sqrt((Math.pow(Lb, 2))-(Math.pow(La, 2))/4))/2;
				
			}else{
				
				return (Lb*Math.sqrt((Math.pow(La, 2))-(Math.pow(Lb, 2))/4))/2;
			}
				
		}else if(Indicador==5){
			
			double s;
			
			s=(La+Lb+Lc)/2;
			
			return Math.sqrt((s*(s-La)*(s-Lb)*(s-Lc)));
		}
		
		return 0;
	}
	
	
}
