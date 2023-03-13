package com.digital.oo;

public class RodarAplicacao {
    public static void main(String[] args) {

        Carro carro1= new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2=new Carro("cinza","Mercedes-Benz Classe c",66);
        System.out.println(carro2.modelo);
        System.out.println(carro2.cor);
        System.out.println(carro2.capacidadeTanque);
        System.out.println(carro2.totalValorTanque(6.46));
    }
}
