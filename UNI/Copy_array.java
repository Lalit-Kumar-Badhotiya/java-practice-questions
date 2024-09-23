//java program to copy an array
public class Copy_array {
    public static void main(String[] args) {
        int[] originalArray = { 10, 20, 30, 40, 50 };
        int[] copiedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
            System.out.print(copiedArray[i] + " ");
        }
    }
}