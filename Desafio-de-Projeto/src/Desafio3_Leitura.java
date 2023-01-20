import java.util.Scanner; 
    
public class Desafio3_Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        int tempo = paginas/paginasLidas;
        System.out.println(tempo+" dias");

    }
}