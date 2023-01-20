import java.util.Scanner;

public class Desafio4_LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();

        int quantidade = doce * 2;
        
        System.out.println("O cliente obteve "+quantidade+ " doces");
    }
}
