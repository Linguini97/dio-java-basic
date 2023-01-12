import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {

        /*Operador de Atribuição */
            String nome = "Vinicius";
            int idade = 24;
            double peso = 80.5;
            char sexo = 'M';
            boolean doadorSangue = true;
            Date dataNascimento = new Date();
            
        /*Operadores Aritméticos */
            double soma = 10.5 + 15.7;
            int subtracao = 456 - 7;
            int multiplicacao = 7 * 7;
            double divisao = 17 / 7 ;
            int modulo = 78 % 8;
            double resultado = (10 * 2) + (divisao);
        /*Concatenação de textos */
            String nomeCompleto = "Vinicius" + " Fernandes";

        /*Operadores Unários */
            int numero = 5;
            numero++;

            System.out.println(++ numero);

            boolean falso = true;
            falso = !falso;

            System.out.println(!falso);
            
        /*Operador Ternário*/
            int a,b;

            a = 5;
            b = 6;
            String novoResultado = a==b ? "Os números são iguais": "Os números são diferentes";
            System.out.println(novoResultado);
        
            /* Operadores Relacionais */

            int primeiroNumero = 5;
            int segundoNumero = 7; 

            if (primeiroNumero > segundoNumero)
                System.out.println("O primeiro número é maior");
            if (primeiroNumero < segundoNumero)
                System.out.println("O segundo número é maior");
            if (primeiroNumero == segundoNumero)
                System.out.println("O primeiro e o segundo valor são iguais");

            /*Operadores Condicionais */
             boolean condicao1 = true;
             boolean condicao2 = true;

             if (condicao1 && condicao2){
                System.out.println("Ambas as condições são verdadeiras");
             }
            else System.out.println("Erro!! Condições não atendidas, verifique e tente novamente.");
    }
}
