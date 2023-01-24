package Exercício1;
public class App {
    public static void main(String[] args){
        
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie 3");
        carro1.setCapacidadeTanque(59.0);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(4.50));

        Carro carro2 = new Carro("Cinza", "Mercerdez Benz Classe C", 66);
        System.out.println(carro2.getModelo());
        System.err.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(4.55));
    }
}
