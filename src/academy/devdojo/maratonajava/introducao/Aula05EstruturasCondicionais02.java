package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        int idade = 16;
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);
    }
}
