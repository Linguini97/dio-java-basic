public class NumeroDoMes {
    public static void main(String[] args){

        
        int mes = 7;


        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2){
            System.out.println("Fevereiro");
        } else if (mes == 3){
            System.out.println("Março");
        } else if (mes == 4){
            System.out.println("Abril");
        } else if (mes == 5){
            System.out.println("Maio");
        } else if (mes == 6){
            System.out.println("Junho");
        } else if (mes == 7){
            System.out.println("Julho");
        } else if (mes == 8){
            System.out.println("Agosto");
        } else if (mes == 9){
            System.out.println("Setembro");
        } else if (mes == 10){
            System.out.println("Outubro");
        } else if (mes == 11){
            System.out.println("Novembro");
        } else if (mes == 12){
            System.out.println("Dezembro");
        } else{
            System.out.println("Por favor digite um mês válido");
        }
        
        /*Contudo nessa segunda parte do exercício como se trata de um valor exato deveria ter sido utilizado o switch*/

        if (mes == 12 || mes == 1 || mes == 7){
            System.out.println("Férias !!");
        }
    }

}


