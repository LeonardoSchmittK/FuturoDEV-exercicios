import java.util.Scanner;
import java.lang.Math;

public class simpleCalculator {
	
	
	
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.printf("Seja bem-vindo(a) à calculadora JAVA! \n");
		
		System.out.printf("Digite um Número: ");
		int firstInt = scanner.nextInt();
		
		System.out.printf("Digite outro Número: ");
		int secondInt = scanner.nextInt();
		
		System.out.println("Escolha uma opção: \n"
				+ "Adição: 1 \n"
				+ "Subtração: 2 \n"
				+ "Multiplicação: 3 \n"
				+ "Divisão: 4 \n"
				+ "Potencia: 5 \n"
				+ "Resto da divisão: 6 \n");
		
		int chosenOperation = scanner.nextInt();
		
		
		switch(chosenOperation) {
		  case 1:
			  System.out.println(secondInt + " adicionado a " + firstInt + " é: \n " + (firstInt + secondInt));
		    break;
		  case 2:
		    
			  System.out.println(secondInt + " subtraído de " + firstInt + " é: \n " + (firstInt - secondInt));
			  
			  
		    break;
		  case 3:
			    
			  System.out.println(firstInt + " multiplicado por " + secondInt + " é: \n " + firstInt * secondInt);
			  
			  
			    break;
		  case 4:
			  float resultDivision = (float) firstInt / secondInt;
			  
			  System.out.println(firstInt + " dividido por " + secondInt + " é: \n " +  resultDivision);
			  
			  
			  
			    break;
		  case 5:
			  System.out.println(firstInt + " elevado a " + secondInt + " é: \n " + Math.pow(firstInt, secondInt));
			  
			    break;
		  case 6:
			  System.out.println("O módulo da divisão é: \n " + firstInt % secondInt);
			    
			    break;
		  default:
			  System.out.println("Tente de novo!");
			  System.exit(0);
		  
		}
		
		scanner.close();
		System.out.printf("FIM!");
		System.exit(1);
	}
}
