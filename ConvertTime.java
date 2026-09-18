import java.util.Scanner;
public class ConvertTime {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of seconds");
		int seconds = in.nextInt();
		int hours = seconds/3600;
		int hoursecondsremanining = seconds%3600;
		int minutes = hoursecondsremanining/60;
		int minutesecondsremaining = hoursecondsremanining%60;
		System.out.printf(seconds + " seconds ="+ hours +" hours, "+minutes+" minutes, and "+minutesecondsremaining+" seconds");
	}
}
