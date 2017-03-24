package lesson1.matrixRotation;

/**
 * Class {@code MatrixRotation} is  responsible for  the matrix rotation.
 * @author Anderwerty
 * @version 1.0
 */
public class MatrixRotation {



    public MatrixRotation() {
    }

    private boolean isValid(int matrix[][]) {

        if (matrix[0].length == matrix.length) {
            return true;
        }
        return false;
    }
    public int [][] rotation90(int matrix[][]){

       int rotateMatrix[][]=new int[matrix.length][matrix.length];

        for (int i = 0; i <matrix.length ; i++) {

            for (int j = 0; j <matrix.length ; j++) {
                rotateMatrix[i][j]=matrix[matrix.length-1-j][i];
                
            }
        }
        return rotateMatrix;
        
    }

    public int [][] rotation180(int matrix[][]){

        return rotation90(rotation90(matrix));
    }

    public int [][] rotation270(int matrix[][]){

        return rotation90(rotation180(matrix));
    }

    public void printMatrix(int matrix [][]){
        for (int i = 0; i <matrix.length ; i++) {

            for (int j = 0; j <matrix.length ; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }

}
