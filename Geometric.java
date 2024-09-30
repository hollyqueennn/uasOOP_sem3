package uasOOP;

import java.util.Vector;

public abstract class Geometric{
	
	public double area;
	public boolean color;
	
	public abstract void hitungArea();
	
	public static double jumlahArea (Vector<Double> geometry){	
		double jumlah = 0;
		for(double a : geometry){
			jumlah += a;
		}
		return jumlah;
	}

}
