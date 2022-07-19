import java.util.Scanner;

public class printUserInitials {

	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Qual seu nome?");
			String userName = scanner.nextLine();
			
			System.out.println("Qual sua idade?");
			int userAge= scanner.nextInt();
			
			System.out.println("Gosta de praticar um esporte?");
			boolean userLikesToPracticeSomeSport= scanner.nextBoolean();
			
			String allUserInfoPrint;
			
			if(userLikesToPracticeSomeSport==false){
				 allUserInfoPrint = "O usuário é nomeado " + userName + ", com " + " anos. O usuário não gosta de praticar esportes";
				
			} else {
				 allUserInfoPrint = "O usuário é nomeado " + userName + ", com " + " anos. O usuário  gosta de praticar esportes";
			}
			
		System.out.println(allUserInfoPrint);
	}

}
