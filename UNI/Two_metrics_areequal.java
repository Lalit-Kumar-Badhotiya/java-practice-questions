public class Two_metrics_areequal {
    public static void main(String[] args) {

        int[][] m1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] m2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        boolean areEqual = true;
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            areEqual = false;
        } else {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    if (m1[i][j] != m2[i][j]) {
                        areEqual = false;
                        break;
                    }
                }
                if (!areEqual) {
                    break;
                }
            }
        }
        if (areEqual) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
        }
    }
}