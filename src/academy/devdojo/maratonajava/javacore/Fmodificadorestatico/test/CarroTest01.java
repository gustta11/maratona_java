package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("Mustang", 280);
        carro01.imprime();

        System.out.println(Carro.velocidadeLimite);
    }


}
