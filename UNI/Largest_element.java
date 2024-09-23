//java array program to find the largest element in array
public class Largest_element {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 10, 22, 38 };
        int largeele = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largeele]) {
                largeele = i;
            }
        }
        System.out.println(largeele);
    }
}