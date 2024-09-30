package uasOOP;

public class Trapezoid extends Geometric{
	
	double a;
	double b;
	double height;
	
	@Override
	public void hitungArea(){
		this.area = (a + b) * height * 0.5;
	}
	
	public Trapezoid(double a, double b, double height, boolean color){
		this.a = a;
		this.b = b;
		this.height = height;
		hitungArea();
		this.color = color;
	}

}
