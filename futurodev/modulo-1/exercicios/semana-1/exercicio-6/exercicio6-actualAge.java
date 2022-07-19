import java.util.Scanner;

public class printUserInitials {

	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Que ano nasceu? Formato: dd-mm-yyyy");
			String userBirthDate = scanner.nextLine();
			
			System.out.println("Qual a data atual? Formato: dd-mm-yyyy");
			String actualDate = scanner.nextLine();
			
		
			String monthBirth = userBirthDate.substring(3,5);
			String monthActualYear = actualDate.substring(3,5);
			
			String actualYear = actualDate.substring(6,10);
			String yearOfBirth = userBirthDate.substring(6,10);
			
			boolean hasHadAnniversary;
			int actualAge = Integer.parseInt(actualYear) - Integer.parseInt(yearOfBirth);
			
			if(Integer.parseInt(monthBirth)>Integer.parseInt(monthActualYear)) {
				actualAge = actualAge - 1;
			}
		
			
		System.out.println("Você tem " + actualAge + " anos");
	}

}
