package estudos.java.introducao;

public class vetoresMultDimensionais {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];

        numeros[0][0] = 5;
        numeros[0][1] = 4;
        numeros[0][2] = 7;

        numeros[1][0] = 55;
        numeros[1][1] = 43;
        numeros[1][2] = 73;

        numeros[2][0] = 45;
        numeros[2][1] = 24;
        numeros[2][2] = 87;


        for (int i = 0; i < numeros.length; i++){
            for(int j = 0; j<numeros[0].length;j++){
                System.out.println(numeros[i][j]);
            }
        }
        System.out.println("******************************************");
        int[][] idade = new int[3][];
        idade[0] = new int[2];
        idade[1] = new int[]{3,2,1};
        idade[2] = new int[2];
        for (int[] arrayBrase: idade){
            for(int array:arrayBrase){
                System.out.println(array);
            }
        }

        int[][] outraForma = {{1,2},{1,2,3,4},{1,2,3,4,5,6,7,8}};
    }
}
