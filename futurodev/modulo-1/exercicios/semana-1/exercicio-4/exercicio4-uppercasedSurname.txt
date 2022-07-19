import java.util.Scanner;

public class printUserInitials {

	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Qual seu sobrenome?");
			String userSurname = scanner.nextLine();
			
			int userSurnameLength = userSurname.length();
			
			String uppercasedUserSurname = userSurname.toUpperCase()
		
		System.out.println("Olá, seu sobrenome é " + uppercasedUserSurname + ". Seu sobrenome contém " + userSurnameLength + " letras.");
	}

}
