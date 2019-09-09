import java.util.Scanner;

public class findMaxArr2x {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[5][6];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println("\n");
        }
        int maxArr = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (maxArr < matrix[row][column]) {
                    maxArr = matrix[row][column];
                }
            }
        }
        System.out.println("\n"+ "MaxArrx2 "+ maxArr);
    }
}
