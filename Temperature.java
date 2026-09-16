import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius:");
		double Celsius = in.nextDouble();
		double Fahrenheit = Celsius*9/5+32;
		System.out.print(Celsius+" "+"C"+" "+"="+" "+Fahrenheit+"F");
	}
}












