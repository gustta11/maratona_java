package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimenssionais {
    public static void main(String[] args) {

        int[] arr = {5,5};
        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[]{10,20,30};
        array[2] = arr;

        int [][] array2 = {{0,1 ,2}, {4,5,6}};
        for(int[] arrayBase : array2){
            for(int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}
