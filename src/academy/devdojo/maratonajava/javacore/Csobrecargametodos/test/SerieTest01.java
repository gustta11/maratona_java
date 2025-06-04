package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {
        Serie serie1 = new Serie();

        serie1.init("La Casa De Papel", 5, "Comédia", 16, "Netflix");

        System.out.println(serie1.getClassificacao());
        System.out.println(serie1.getTipo());
        System.out.println(serie1.getPlataforma());
    }
}
