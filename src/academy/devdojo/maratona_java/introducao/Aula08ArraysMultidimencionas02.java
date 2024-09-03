package academy.devdojo.maratona_java.introducao;

public class Aula08ArraysMultidimencionas02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[3];
        arrayInt[1] = new int[]{1, 2, 3, 4, 5};
        arrayInt[2] = new int[6];

        int[][] array2 = {{1, 2}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5, 6}};

        int[][] array3 = new int[][]{{1,2,3}, {1,2,3}, {1,2,3}};


        for (int[] arrayBase : arrayInt) {
            System.out.println("\n---");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("\n---");
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");

            }

        }
    }
}
