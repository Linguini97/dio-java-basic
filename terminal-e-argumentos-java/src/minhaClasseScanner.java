import java.util.Locale;
import java.util.Scanner;

public class minhaClasseScanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o seu nome ? ");
        String nome = scanner.next();

        System.out.println("Qual seu sobrenome ? ");
        String sobrenome = scanner.next();

        System.out.println("Qual é a sua altura ? ");
        double altura = scanner.nextDouble();

        System.out.println("Qual a sua idade ? ");
        int idade = scanner.nextInt();

        System.out.println("Olá, meu nome é "+nome+ " " +sobrenome);
        System.out.println("Tenho "+idade+" anos");
        System.out.println("E minha altura é de "+altura+ "m");
    }
}
