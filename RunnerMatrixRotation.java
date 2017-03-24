package lesson1.matrixRotation;

/**

 * @ author Anderwerty
 */
public class RunnerMatrixRotation {

    public static void main(String[] args) {

        int [][] matrix = {{1, 0, 2}, {3, 1, 8}, {9, 10, 23}};

        MatrixRotation matrixRotation = new MatrixRotation();
        System.out.println("Matrix:");
        matrixRotation.printMatrix(matrix);
        System.out.println("Rotation matrix 90 degree:");
        matrixRotation.printMatrix(matrixRotation.rotation90(matrix));

        System.out.println("Rotation matrix 180 degree:");
        matrixRotation.printMatrix(matrixRotation.rotation180(matrix));
        System.out.println("Rotation matrix 270 degree:");
        matrixRotation.printMatrix(matrixRotation.rotation270(matrix));
        System.out.println("Rotation matrix 360 degree:");
        matrixRotation.printMatrix(matrixRotation.rotation90(matrixRotation.rotation270(matrix)));


    }
}
