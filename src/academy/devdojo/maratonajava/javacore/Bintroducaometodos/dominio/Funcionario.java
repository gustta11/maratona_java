package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void impressaoDados(){
        System.out.println(this.nome + " " + this.idade + " ");

        if(salarios == null){
            return;
        }

        for(double aux:salarios){
            System.out.println(aux);
        }
        mediaSalarios();
    }

    public void mediaSalarios(){
        if(salarios == null){
            return;
        }
        double soma = 0;
        for(double aux:salarios){
            soma += aux;
        }

        media = soma/salarios.length;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
