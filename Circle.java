package uasOOP;

public class Circle extends Geometric{
	
	double phi = 3.14;
	double r;
	
	@Override
	public void hitungArea(){
		this.area = phi * r * r;
	}
	
	public Circle(double r, boolean color){
		this.r = r;
		hitungArea();
		this.color = color;
	}
	
}
