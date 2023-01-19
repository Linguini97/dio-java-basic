import java.util.Scanner;

public class Nota {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double nota;

        while(true){
        System.out.println("Insira uma nota de 0 a 10: " );
        nota = scan.nextDouble();

        if (nota >= 0 && nota <= 10){
            break;
        }
        System.out.println("Você por acaso é burro ? Por favor insira uma nota válida. ");
    }
    }
}
