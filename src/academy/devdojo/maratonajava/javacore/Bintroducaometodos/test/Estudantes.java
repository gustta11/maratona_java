package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class Estudantes {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante1.nome = "Lucas";
        estudante1.idade = 25;
        estudante1.sexo = 'M';

        estudante2.nome = "Mateus";
        estudante2.idade = 30;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();

    }

}
