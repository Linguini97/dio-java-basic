 public class Comparacao {
    public static void main(String[] args) throws Exception {
    
        /*Declaração das variáveis */
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'z';
        char c2 = 'y';
        String s1 = "Vinicius";
        String s2 = "Fernandes";
        String s3 = "Oliveira";
        boolean b1 = true;
        boolean b2 = false; 
        
        long l1 = 1597L;
        long l2 = 8997l;
        byte y1 = 1;
        short h1 = 25;

        /*Comparação numérica */
        System.out.println(" i1 é igual a i2: " +(i1 ==i2));
        System.out.println("i1 é diferente de i2: " +(i1 != i2));
        System.out.println("i1 é maior que i2: " +(i1>i2));
        System.out.println("i1 é menor ou igual a i2: " +(i1<=i2));


        System.out.println(" f1 é igual a f2: " +(f1 ==f2));
        System.out.println("f1 é diferente de f2: " +(f1 != f2));
        System.out.println("f1 é maior que f2: " +(f1>f2));
        System.out.println("f1 é menor ou igual a f2: " +(f1<=f2));

        System.out.println(" y1 é igual a d1: " +(y1 ==d1));
        System.out.println("d1 é diferente de l2: " +(d1 != l2));
        System.out.println("l1 é maior que f2: " +(l1>f2));
        System.out.println("h1 é menor ou igual a f2: " +(h1<=f2));
    
        /*Comparação entre booleanos */

        System.out.println(" b1 é igual a b2: " +(b1 == b2));
        System.out.println(" b1 é diferente de b2: " +(b1 != b2));

        /*Comparação entre Strings*/

        System.out.println(" s1 é igual a s2: " +(s1 == s2));
        System.out.println(" s1 é diferente de s3: " +(s1 != s3));

        /*Comparação entre caracteres*/
        System.out.println("c1 é igual a c2: " +(c1 ==c2));
        System.out.println("c1 é diferente de c2: " +(c1 != c2));
        System.out.println("c1 é maior que c2: " +(c1>c2));
        System.out.println("c1 é menor ou igual a c2: " +(c1<c2));

    }
}
