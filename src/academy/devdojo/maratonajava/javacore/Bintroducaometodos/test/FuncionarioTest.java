package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();



        funcionario1.setNome("Gustavo");
        funcionario1.setIdade(20);
        funcionario1.setSalarios(new double[]{500,500,500});

        funcionario1.impressaoDados();
        System.out.println(funcionario1.getMedia());


    }
}
