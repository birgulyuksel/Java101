public class Transpoze {
    public static void main(String[] args) {
        int [][] matrix = { {2,3,4},
                            {5,6,4} };
        System.out.println("Before the change");
        printArray(matrix);
        System.out.println("After the change");
        change(matrix);
    }
    public static void change (int [][] matrix) { //This method is for replacing the rows and columns of the matrix.
        int [][] newMatrix = new int [matrix[0].length][matrix.length];// Here we created new matrix.
        for (int rows = 0; rows < matrix.length; rows++) { //With this for loop, we first look at the rows of the matrix.
            for (int col = 0; col < matrix[0].length; col++) { //And with this for loop, we look at the columns of the matrix.
                newMatrix[col][rows] = matrix [rows][col]; //With this operation we changed the rows and columns.
            }
        }
        printArray(newMatrix); //Here, we called the printArray method and printed the new array on the screen.
    }
    public static void printArray(int [][] matrix) { // This method for print array.
        for (int [] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}