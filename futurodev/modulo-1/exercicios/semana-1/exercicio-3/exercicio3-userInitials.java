import java.util.Scanner;

public class printUserInitials {
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String userName = scanner.nextLine();
		
			System.out.println("Qual seu sobrenome?");
			String userSurname = scanner.nextLine();
			
			char firstLetter = userName.charAt(0);
			char firstSurnameLetter = userSurname.charAt(0);
			
			String fullName = userSurname + " " + userName;
			String userInitials = firstLetter + " " + firstSurnameLetter;
			
		System.out.println("Seu nome é " + fullName + "\n com as iniciais sendo: " + userInitials);
	}
	
}
