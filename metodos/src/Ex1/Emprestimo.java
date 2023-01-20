package Ex1;

import java.util.Scanner;

public class Emprestimo {

 
 
    public static void calcular (double valor, int numeroParcelas){
        double taxaParcelas = 0.02;
        double valorfinal = valor + (valor *taxaParcelas * numeroParcelas);
        System.out.println("O valor final para "+numeroParcelas+" parcelas é de R$ "+valorfinal);
    }

}
