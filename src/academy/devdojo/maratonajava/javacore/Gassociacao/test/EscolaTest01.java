package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Gustavo");
        Professor professor02 = new Professor("Jaqueline");
        Professor professor04 = new Professor("Juliana");
        Professor[] professors = {professor01,professor02,professor04};
        Escola escola = new Escola("ABC");
        escola.setProfessores(professors);
        escola.imprime();
    }
}
