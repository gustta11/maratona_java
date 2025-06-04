package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Gustavo";
        pessoa1.setIdade(22);

        pessoa1.setCpf("076.774.003-06");
        System.out.println(pessoa1.getCpf());
    }
}
