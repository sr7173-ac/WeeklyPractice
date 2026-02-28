import java.util.Scanner;
public class TemperatureConversion {
    public static void main (String[] args){
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature in celsius: ");
		double celsius = scanner.nextDouble();
		
		double farenheitResult = (celsius * 1.8) + 32;
		
		System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit");
	}
}