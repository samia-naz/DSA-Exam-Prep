public class DiagonalMaxMin {

    public static void main(String[] args) {

        int[][] arr = {
            {5, 2, 3},
            {4, 9, 6},
            {7, 8, 1}
        };

        int max = arr[0][0];
        int min = arr[0][0];

        // main diagonal → i == j
        for(int i = 0; i < arr.length; i++) {

            if(arr[i][i] > max) {
                max = arr[i][i];
            }

            if(arr[i][i] < min) {
                min = arr[i][i];
            }
        }

        System.out.println("Main Diagonal Max: " + max);
        System.out.println("Main Diagonal Min: " + min);
    }
}
