package Exercício1;
 class Carro {
    String cor;
    String modelo;
    Double capacidadeTanque;

    Carro(){

    }

    Carro(String cor, String modelo, double capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo (){
        return modelo;
    }

    void setCapacidadeTanque (Double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    Double getCapacidadeTanque(){
        return capacidadeTanque;
    }
    Double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}