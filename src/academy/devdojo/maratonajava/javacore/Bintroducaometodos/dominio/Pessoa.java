package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    public String nome;
    private int idade;
    private String cpf;

    public void imprimePessoa(){
        System.out.println(nome + idade);
    }


    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public int getIdade(){
        return idade;
    }
}
