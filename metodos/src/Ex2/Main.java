package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;

        System.out.println("Informe qual quadrilátero você deseja saber a área: 1- Quadrado; 2- Retângulo; 3- Trapézio");
        escolha = scan.nextInt();

        switch (escolha){
            case 1: 
                System.out.println("Informe o tamanho do lado: ");
                double lado = scan.nextDouble();
                Quadrilatero.area(lado);
                break;
            case 2:
                System.out.println("Informe o tamanho do primeiro lado: ");
                double lado1 = scan.nextDouble();
                System.out.println("Informe o tamanho do segundo lado: ");
                double lado2 = scan.nextDouble();
                Quadrilatero.area(lado1, lado2);
                break;
            case 3:
                System.out.println("Informe o tamanho da base maior: ");
                double baseMaior = scan.nextDouble();
                System.out.println("Informe o tamanho da base menor: ");
                double baseMenor = scan.nextDouble();
                System.out.println("Informe a altura: ");
                double altura = scan.nextDouble();
                Quadrilatero.area(baseMaior, baseMenor, altura);
                break;
            default:
            System.out.println("Opção Inválida. ");
        }
    }
}
