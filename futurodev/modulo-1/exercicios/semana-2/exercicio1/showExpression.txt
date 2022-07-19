

public class showLargerExpressionResult{
	public static void main(String args[]) {
		//  " !((i > 4) || (j <= 5)) "" 
		int i = 10;
		int j = 3;
		
		boolean firstPart = (i > 4);
		boolean secondPart = (j <= 5);
		boolean thirdPart = firstPart || secondPart;
		boolean result = !thirdPart;
		
		System.out.println("(i > 4) -> " + firstPart );
		System.out.println("(j <= 5) -> " + secondPart );
		System.out.println("((i > 4) || (j <= 5)) -> " + thirdPart );
		System.out.println("!((i > 4) || (j <= 5)) -> " + result );
		
	}
}
