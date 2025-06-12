package academy.devdojo.maratonajava.javacore.Hexercicioassociacao.test;

import academy.devdojo.maratonajava.javacore.Hexercicioassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Hexercicioassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Hexercicioassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Hexercicioassociacao.dominio.Seminario;

public class SistemaTest01 {
    public static void main(String[] args) {
        Seminario seminario01 = new Seminario("TI");
        Local local = new Local("Sala Lontra");
        Professor professor01 = new Professor("Banco de Dados", "Marcos");
        Aluno aluno01 = new Aluno("Lucas", 18);
        Aluno aluno02 = new Aluno("Pedro", 18);
        Aluno[] alunos = {aluno01,aluno02};

        seminario01.setAlunos(alunos);
        seminario01.setLocal(local);
        Seminario[] seminarios = {seminario01};

        professor01.setSeminarios(seminarios);

        professor01.imprime();


    }
}
