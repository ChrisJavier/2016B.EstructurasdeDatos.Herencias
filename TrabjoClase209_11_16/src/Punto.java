
public class Punto {

	private double x;
	private double y;
	
	
	public Punto(double x, double y){
		
		this.x=x;
		this.y=y;
	}



	public double getX() {
		return x;
	}

	public Punto()
	{
		x=y=0;
	}
	
	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "ClasePunto [x=" + x + ", y=" + y + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
}
