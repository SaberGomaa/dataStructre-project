package My project;

class Quick {
    int[] arr = new int[30];
    int n = 0;
public void aad(int value) {
        arr[n++] = value;
}
public void display() {
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + "  ");
        }
            System.out.println();
}
public void quickSort() {
        recQuickSort(0, n- 1);
}
public void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        }
        else {
            long pivot = arr[right];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
}
public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (arr[++leftPtr] < pivot);
            while (rightPtr > 0 && arr[--rightPtr] > pivot);
            if (leftPtr >= rightPtr) {
                break;
            } 
            else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);
        return leftPtr;
}
public void swap(int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
}
}
public class quick {
    public static void main(String[] args) {
        Quick q = new Quick();
        q.aad(1);
        q.aad(10);
        q.aad(50);
        q.aad(80);
        q.aad(44);
        q.aad(14);
        q.aad(47);
        q.aad(18);
        q.display();
        q.quickSort();
        q.display();
    }
}
