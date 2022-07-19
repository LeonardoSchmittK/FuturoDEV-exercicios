import java.util.Scanner;

public class isItHotOrColdDetailed{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		// ask the user the actual temperature
		System.out.printf("Qual a temperatura?");
		
		int temperature = scanner.nextInt();
		
		String result = 
			temperature < 18 ? "Frio":
			temperature >= 19 && temperature <= 23 ?"Agradavel":
			temperature >= 24 && temperature <=35 ? "Quente":
			"Muito quente";
		
		System.out.println(result);
		scanner.close();
		
	}
}
