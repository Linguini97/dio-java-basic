package Ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int funcao;

        System.out.println("Por gentileza informe a função desejada> 1- Calculadora; 2- Saudação; 3- Empréstimo");
        funcao = scan.nextInt();

        switch(funcao){
            case 1:
                Calculadora.soma(7, 6);
                Calculadora.subtracao(9, 1.8);
                Calculadora.multiplicacao(4, 8);
                Calculadora.divisao(8, 10);
                break;
            case 2:
                Saudacao.obterMensagem(9);
                Saudacao.obterMensagem(4);
                Saudacao.obterMensagem(25);
                break;
            case 3:
                System.out.println("Informe o valor do empréstimo: ");
                Double valor = scan.nextDouble();
                System.out.println("Informe o número de parcelas");
                int numeroParcelas = scan.nextInt();
                Emprestimo.calcular(valor, numeroParcelas);
                break;



        }

    }
}
