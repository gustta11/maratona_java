package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante pessoa1 = new Estudante();
        pessoa1.idade = 18;
        pessoa1.nome = "Jaqueline";
        pessoa1.sexo = 'F';

        System.out.println(pessoa1.nome);
    }
}
