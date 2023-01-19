import java.util.Vector;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {
        
        int contador = 0;
        int[] vetor = {8, -5, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        while(contador < (vetor.length)){
        System.out.println(vetor[contador] + " ");
        contador++;
    }
        System.out.println("Vetor Inverso:");
        for (int i = (vetor.length -1 );i >= 0 ;i-- ){
            System.out.println(vetor[i] + " ");

        }
}
}