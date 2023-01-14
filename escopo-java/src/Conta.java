public class Conta {
    
    double saldo = 10.0; /*Variável da classe conta */

    public void sacar (double valor){

        double novoSaldo = saldo - valor; /*Variável local do método */
    }

    public void ImprimirSaldo(){

        System.out.println(saldo); /*Disponível em toda classe */

        /*System.out.println(novoSaldo); 
        /*Disponível apenas no métdo sacar, por isso o erro */
    }
}
