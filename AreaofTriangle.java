import java.util.Scanner;
public class AreaofTriangle {
    public static void main (String[] args){
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the base of the triangle in cm: ");
		double base_cm = scanner.nextDouble();
		System.out.println("Enter the height of the triangle in cm: ");
		double height_cm = scanner.nextDouble();
		
		double area_cm = 0.5 * base_cm * height_cm;
		double area_in = area_cm / (2.54 * 2.54);
		
		System.out.println("The Area of the triangle in sq in is " + area_cm + " and sq cm is " + area_in);
	}
}