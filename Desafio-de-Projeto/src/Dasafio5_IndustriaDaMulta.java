import java.util.Scanner;

public class Dasafio5_IndustriaDaMulta {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        if(velocidadeAtual <= 60){
            System.out.println("Nao foi multado");
        }else{
            System.out.println("Foi multado");
        }

    }
}
