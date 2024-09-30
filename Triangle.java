package uasOOP;

public class Triangle extends Geometric{
	
	double base;
	double height;
	
	@Override
	public void hitungArea(){
		this.area = 0.5 * base * height;
	}
	
	public Triangle(double base, double height, boolean color){
		this.base = base;
		this.height = height;
		hitungArea();
		this.color = color;
	}
	
}
