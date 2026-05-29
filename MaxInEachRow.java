public class MaxInEachRow {

    public static void main(String[] args) {

        int[][] arr = {
            {3, 8, 1},
            {7, 2, 6},
            {5, 9, 4}
        };

        for(int i = 0; i < arr.length; i++) {

            int max = arr[i][0];  // assume first element as max

            for(int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

            System.out.println("Max of row " + i + " = " + max);
        }
    }
}

