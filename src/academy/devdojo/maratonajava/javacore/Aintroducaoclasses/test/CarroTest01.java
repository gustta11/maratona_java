package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.Nome = "Palio";
        carro1.ano = 2016;
        carro1.Modelo = "FIAT";

        carro2.Nome = "Celta";
        carro2.ano = 2013;
        carro2.Modelo = "Chevrolet";

        System.out.println(carro1.Modelo + " " + carro1.Nome + " " + carro1.ano);
        System.out.println(carro2.Modelo + " " + carro2.Nome + " " + carro2.ano);}
}
