import java.util.Scanner;

public class isItHotOrCold{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		// ask the user the actual temperature
		System.out.printf("Qual a temperatura?");
		
		int temperature = scanner.nextInt();
		
		String result = temperature > 30 ? "Está calor!" : "Está frio!";
		
		System.out.println(result);
		
	}
}
