public class CenterOfMatrix {
    public static Integer center(int[][] matrix) {
        int raw = matrix.length;

        if (raw == 0) {
            return null;
        }

        int rawIn = matrix[0].length;

        if (rawIn == 0) {
            return null;
        }

        if (raw % 2 == 1 && rawIn %2 == 1){
            return matrix[raw/2][rawIn/2];
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {1, 2},
                {3, 4}
        };

        System.out.println(center(matrix1)); // 5
        System.out.println(center(matrix2)); // null
    }
}

