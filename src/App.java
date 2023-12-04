import java.util.Scanner;

public class Frågesport {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int totalPoang = 0;
                int maxPoang = 5; // Antalet frågor
        
                // Fråga 1
                System.out.println("Fråga 1: Vad är huvudstaden i Frankrike?");
                String svar1 = scanner.nextLine();
                if (svar1.equalsIgnoreCase("Paris")) {
                    totalPoang += 1;
                }
        
                // Fråga 2
                System.out.println("Fråga 2: Vilket är världens största ocean?");
                String svar2 = scanner.nextLine();
                if (svar2.equalsIgnoreCase("Stilla havet")) {
                    totalPoang += 1;
                }
        
                // Fråga 3
                System.out.println("Fråga 3: Vad är 2 + 2?");
                int svar3 = scanner.nextInt();
                if (svar3 == 4) {
                    totalPoang += 1;
                }
        
                // Fråga 4
                System.out.println("Fråga 4: Vilket år inträffade det amerikanska inbördeskriget?");
                int svar4 = scanner.nextInt();
                if (svar4 == 1861) {
                    totalPoang += 1;
                }
        
                // Fråga 5
                System.out.println("Fråga 5: Vilken planet är närmast solen?");
                String svar5 = scanner.next();
                if (svar5.equalsIgnoreCase("Mercury")) {
                    totalPoang += 1;
                }
        
                // Avslutning
                System.out.println("\nResultat:");
                System.out.println("Du fick " + totalPoang + " poäng av " + maxPoang + " möjliga.");
    }
}
