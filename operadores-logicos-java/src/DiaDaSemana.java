import javax.sql.rowset.CachedRowSet;

public class DiaDaSemana {
    public static void main(String[] args){

     String dia = "Domingo";

     switch (dia){
        case "Segunda":
        System.out.println(1);
        break;
        case "Terça":
        System.out.println(2);
        break;
        case "Quarta":
        System.out.println(3);
        break;
        case "Quinta":
        System.out.println(4);
        break;
        case "Sexta":
        System.out.println(5);
        break;
        case "Sabado":
        System.out.println(6);
        break;
        case "Domingo":
        System.out.println(7);
        break;
        default:
        System.out.println("Favor escrever o nome de um dia válido");
        
        
     }
    }
}