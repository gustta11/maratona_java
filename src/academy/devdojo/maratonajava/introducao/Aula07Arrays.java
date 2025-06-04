package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {

    public static void main(String[] args) {
        String[] nomes1 = new String[3];
        String[] nomes2 = new String[]{"Naruto", "Avatar"};
        String[] nomes = {"Goku", "Vegeta", "Picolo"};


        for(int i = 0; i < nomes2.length; i++){
            System.out.println(nomes2[i]);
        }

        for(String nom:nomes){
            System.out.println(nom);
        }
    }
}
