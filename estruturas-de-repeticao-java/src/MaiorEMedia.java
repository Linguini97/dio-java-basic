import java.util.Scanner;

public class MaiorEMedia {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int contador = 0; 
        
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero  > maior){
                maior = numero;
            }
            soma = numero + soma;
            contador++;
        } while(contador < 5);
        
        Double media = (double) (soma / 5); 
        System.out.println("O maior número foi: " +maior);
        System.out.println("A média dos números foi: " +media);
    }
}
