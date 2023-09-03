import java.util.Scanner;

public class O3restart {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("skriv inn eit heiltall: ");
			
			int n = Integer.valueOf(scanner.nextInt());
			
			int svar = 1;
			
			for (int i = 1; i <= n; i++) {
				svar = svar * i;
			}
			
			System.out.println(n + "! = " + svar);
			
		scanner.close();
	

		}

	}