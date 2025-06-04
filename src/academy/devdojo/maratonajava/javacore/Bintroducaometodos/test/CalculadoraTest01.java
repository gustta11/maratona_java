package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        calcular.somaDoisNumeros(10, 5);
        double resultado = calcular.divideDoisNumeros(10,2);
        System.out.println(resultado);
    }
}
