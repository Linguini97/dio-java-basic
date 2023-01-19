import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int quantidade;
        int contador = 0;
        int numero;
        int quantideNumeroPar = 0;
        int somaNumeroPar = 0;
        int quantideNumeroImpar = 0;
        int somaNumeroImpar = 0;

        System.out.println("Informe a quantidade de números: ");
        quantidade = scan.nextInt();

        do{
            System.out.println("Número");
            numero = scan.nextInt();
                if (numero % 2 == 0) {
                    quantideNumeroPar = quantideNumeroPar + 1;
                    somaNumeroPar = somaNumeroPar + numero;
                }else{
                    quantideNumeroImpar = quantideNumeroImpar + 1;
                    somaNumeroImpar = somaNumeroImpar + numero;
                }
            contador++;
        }while(contador < quantidade);
    
        System.out.println("Ao todo foram " +quantideNumeroPar+" números pares que resultaram em uma soma total de " +somaNumeroPar);
        System.out.println("Ao todo foram " +quantideNumeroImpar+" números impares que resultaram em uma soma total de " +somaNumeroImpar);
    }
    
}
