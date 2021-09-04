
package My project;
public class Insertion {

    public static void main(String[] args) {

        
        int[] arr = {10, 60, 90, 80, 70, 50, 20};
        int val, j;
        for (int i = 1; i < arr.length; i++) {
            val = arr[i];
            j = i;

            while (arr[j - 1] > val && j > 0) {
                arr[j] = arr[j - 1];
                j--;

            }
            arr[j] = val;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
