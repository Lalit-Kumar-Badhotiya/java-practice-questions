// 11111
// 12111
// 11311
// 11141
// 11115

public class Pat_Print {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if (i == j) {
                    System.out.print((i + 1));
                } else {
                    System.out.print("1");
                }
            }

            System.out.println();
        }
    }
}
