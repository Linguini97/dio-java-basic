package Ex1;

public class Saudacao {
    public static void obterMensagem(int hora){
        if ((hora >= 5) && (hora <= 12)){
            mensagemBomDia();
        } else if ((hora > 12) && (hora <= 18)){
            mensagemBoaTarde();
        }else if (((hora > 18) && (hora <= 24))  || (hora < 5) ){
            mensagemBoaNoite();
        }else {
            System.out.println("Horário Inválido.");
        }
    }
    public static void mensagemBomDia(){
        System.out.println("Bom dia !");
    }
    public static void mensagemBoaTarde(){
        System.out.println("Boa Tarde !");
    }
    public static void mensagemBoaNoite(){
        System.out.println("Boa noite !");
    }
}
