package edu.vinicius.primeiromodulo;

public class MinhaClasse {
    
    public static void main(String[] args) {

        String primeiroNome = "Vinicius";
        String segundoNome = "Fernandes";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome , String segundoNome){
        return "O seu nome completo é  " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
