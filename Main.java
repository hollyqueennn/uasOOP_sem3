package uasOOP;

import java.util.Scanner;
import java.util.Vector;

public class Main{
	static Scanner scanner = new Scanner(System.in);
	static Vector<Double> colored = new Vector<>();
	static Vector<Double> uncolored = new Vector<>();
	
    public static void main(String[] args){

        while (true){
            printMenu();
            System.out.print(" --> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hitungLuas();
                    break;
                case 2:
                    inputTriangle();
                    break;
                case 3:
                    inputSquare();
                    break;
                case 4:
                    inputCircle();
                    break;
                case 5:
                    inputTrapezoid();
                    break;
                case 6:
                    clearData();
                    break;
                case 7:
                    System.out.println("Terima Kasih.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan invalid, silakan pilih lagi.");
            }
        }
    }

    private static void printMenu(){
        System.out.println("....................................");
        System.out.println(".        Geometry Calculator       .");
        System.out.println("....................................");
        System.out.println(".         1. Hitung Luas           .");
        System.out.println(".         2. Input Triangle        .");
        System.out.println(".         3. Input Square          .");
        System.out.println(".         4. Input Circle          .");
        System.out.println(".         5. Input Trapezoid       .");
        System.out.println(".         6. Clear Data            .");
        System.out.println(".         7. Exit                  .");
        System.out.println("....................................");
    }

    private static void hitungLuas(){
    	if(colored.isEmpty() && uncolored.isEmpty()){
			System.out.println("List is empty");
			return;
		}
		
		System.out.printf("Result : %.3f\n", Geometric.jumlahArea(colored) - Geometric.jumlahArea(uncolored));
       
    }

    private static void inputTriangle(){
    	
    	double base;
    	double height;
    	boolean color;
    	
    	
    	System.out.println("   .  ...  .  ");
    	System.out.println(".  Triangle  .");
    	System.out.println("   .  ...  .  ");

    	System.out.print("Base : ");
    	base = scanner.nextDouble(); scanner.nextLine();
    	System.out.print("Height: ");
    	height = scanner.nextDouble(); scanner.nextLine();
    	
    	char yn;
        do{
        	System.out.print("Colored? (Y/N): ");            
        	yn = scanner.next().charAt(0); scanner.nextLine();
        } while (!(yn == 'Y' || yn == 'y' || yn == 'N' || yn == 'n'));

        color = (yn == 'Y' || yn == 'y') ? true : false;
        
        Triangle triangleBaru = new Triangle(base, height, color);
        
        if(triangleBaru.color)
			colored.add(triangleBaru.area);
		else
			uncolored.add(triangleBaru.area);
    }
    
    

    private static void inputSquare(){
    	
    	double length;
    	double height;
    	boolean color;
    	
    	
    	System.out.println("  .  ..  .  ");
    	System.out.println(".  Square  .");
    	System.out.println("  .  ..  .  ");

    	System.out.print("Length : ");
    	length = scanner.nextDouble(); scanner.nextLine();
    	System.out.print("Height: ");
    	height = scanner.nextDouble(); scanner.nextLine();
    	
    	char yn;
        do{
        	System.out.print("Colored? (Y/N): ");            
        	yn = scanner.next().charAt(0); scanner.nextLine();
        } while (!(yn == 'Y' || yn == 'y' || yn == 'N' || yn == 'n'));

        color = (yn == 'Y' || yn == 'y') ? true : false;
        
        Square squareBaru = new Square(length, height, color);
        
        if(squareBaru.color)
			colored.add(squareBaru.area);
		else
			uncolored.add(squareBaru.area);
    }

	private static void inputCircle(){
    	
    	double r;
    	boolean color;
    	
    	
    	System.out.println("  .  ..  .  ");
    	System.out.println(".  Circle  .");
    	System.out.println("  .  ..  .  ");

    	System.out.print("Radius : ");
    	r = scanner.nextDouble(); scanner.nextLine();
    	
    	char yn;
        do{
        	System.out.print("Colored? (Y/N): ");            
        	yn = scanner.next().charAt(0); scanner.nextLine();
        } while (!(yn == 'Y' || yn == 'y' || yn == 'N' || yn == 'n'));

        color = (yn == 'Y' || yn == 'y') ? true : false;
        
        Circle circleBaru = new Circle(r, color);
        
        if(circleBaru.color)
			colored.add(circleBaru.area);
		else
			uncolored.add(circleBaru.area);
    }

    private static void inputTrapezoid(){
    	
    	double a;
    	double b;
    	double height;
    	boolean color;
    	
    	
    	System.out.println("  .   ...   .  ");
    	System.out.println(".  Trapezoid  .");
    	System.out.println("  .   ...   .  ");

    	System.out.print("Length 1 : ");
    	a = scanner.nextDouble(); scanner.nextLine();
    	System.out.print("Length 2: ");
    	b = scanner.nextDouble(); scanner.nextLine();
    	System.out.print("Height: ");
    	height = scanner.nextDouble(); scanner.nextLine();
    	
    	char yn;
        do{
        	System.out.print("Colored? (Y/N): ");            
        	yn = scanner.next().charAt(0); scanner.nextLine();
        } while (!(yn == 'Y' || yn == 'y' || yn == 'N' || yn == 'n'));

        color = (yn == 'Y' || yn == 'y') ? true : false;
        
        Trapezoid trapezoidBaru = new Trapezoid(a, b, height, color);
        
        if(trapezoidBaru.color)
			colored.add(trapezoidBaru.area);
		else
			uncolored.add(trapezoidBaru.area);
    }

    private static void clearData(){
    	if(colored.isEmpty() && uncolored.isEmpty()){
    		System.out.println("List is empty");
    		return;
    	}
    	else{
    		colored.clear();
    		uncolored.clear();
    		System.out.println("List has been cleared");
    	}
    
    }
}
