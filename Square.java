package uasOOP;

public class Square extends Geometric{
	
	double length;
	double height;
	
	
	@Override
	public void hitungArea(){
		this.area = length * height;
	}
	
	public Square(double length, double height, boolean color){
		this.length = length;
		this.height = height;
		hitungArea();
		this.color = color;
	}

}
