import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero; 
        int resultado;
        System.out.println("Informe o número: ");
        numero = scan.nextInt();

        for (int contador = 1; contador <=10; contador++){
            resultado = numero * contador;
            System.out.println(numero+ " x " +contador+" = "+resultado);
        }
    }

}
