import java.util.Scanner;

public class threeQuestionsToUser {
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String userName = scanner.nextLine();
		
			System.out.println("Qual seu sobrenome?");
			String userSurname = scanner.nextLine();
		
			String fullName = userName + " " + userSurname;
			int fullNameLength = fullName.length() - 1; // decrease one because of the " " added to fullName as space bar doesn't count.
			
		System.out.println("Seu nome é " + fullName + "\n com " + fullNameLength + "letras");
	}
	
}
