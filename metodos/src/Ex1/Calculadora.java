package Ex1;

import java.util.Scanner;

public class Calculadora {
    
    Scanner scan = new Scanner(System.in);

    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println(numero1+ " + " +numero2+" = "+resultado);
    }
    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println(numero1+ " - " +numero2+" = "+resultado);
    }
    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println(numero1+ " x " +numero2+" = "+resultado);
    }
    public static void divisao(double numero1, double numero2){
        if (numero2 > 0){
            double resultado = numero1 / numero2;
            System.out.println(numero1+ " / " +numero2+" = "+resultado);
        }else{
            System.out.println("Insira um divisor válido");
        }
    }

}
