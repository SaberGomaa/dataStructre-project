package javaproject;
/**
 *
 * @author Saber , Abdo , Atia
 */
import java.util.Scanner;

public class JavaProject {

    public static class BubbleSort {

        void bubblesort(int[] arr, int n) {
            for (int i = 0; i < n - 1; ++i) {
                for (int j = 0; j < n - i - 1; ++j) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static class Insertion {

        void sort(int arr[], int n) {
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
    }

    public static class MergeSort {

        public void merge(int[] left_arr, int[] right_arr, int[] arr, int left_size, int right_size) {

            int i = 0, l = 0, r = 0;

            while (l < left_size && r < right_size) {

                if (left_arr[l] < right_arr[r]) {
                    arr[i++] = left_arr[l++];
                } else {
                    arr[i++] = right_arr[r++];
                }
            }
            while (l < left_size) {
                arr[i++] = left_arr[l++];
            }
            while (r < right_size) {
                arr[i++] = right_arr[r++];
            }
        }

        public void mergeSort(int[] arr, int len) {
            if (len < 2) {
                return;
            }

            int mid = len / 2;
            int[] left_arr = new int[mid];
            int[] right_arr = new int[len - mid];

            int k = 0;
            for (int i = 0; i < len; ++i) {
                if (i < mid) {
                    left_arr[i] = arr[i];
                } else {
                    right_arr[k] = arr[i];
                    k = k + 1;
                }
            }
            mergeSort(left_arr, mid);
            mergeSort(right_arr, len - mid);
            merge(left_arr, right_arr, arr, mid, len - mid);
        }

    }

    public static class Shell_Sort {

        public void shellsort(int[] arr, int num) {
            int i, j, k, tmp;
            for (i = num / 2; i > 0; i = i / 2) {
                for (j = i; j < num; j++) {
                    for (k = j - i; k >= 0; k = k - i) {
                        if (arr[k + i] >= arr[k]) {
                            break;
                        } else {
                            tmp = arr[k];
                            arr[k] = arr[k + i];
                            arr[k + i] = tmp;
                        }
                    }
                }
            }
        }
    }

    public static class QuickSort {

        public int partition(int a[], int beg, int end) {

            int left, right, temp, loc, flag;
            loc = left = beg;
            right = end;
            flag = 0;
            while (flag != 1) {
                while ((a[loc] <= a[right]) && (loc != right)) {
                    right--;
                }
                if (loc == right) {
                    flag = 1;
                } else if (a[loc] > a[right]) {
                    temp = a[loc];
                    a[loc] = a[right];
                    a[right] = temp;
                    loc = right;
                }
                if (flag != 1) {
                    while ((a[loc] >= a[left]) && (loc != left)) {
                        left++;
                    }
                    if (loc == left) {
                        flag = 1;
                    } else if (a[loc] < a[left]) {
                        temp = a[loc];
                        a[loc] = a[left];
                        a[left] = temp;
                        loc = left;
                    }
                }
            }
            return loc;
        }

        void quickSort(int a[], int beg, int end) {

            int loc;
            if (beg < end) {
                loc = partition(a, beg, end);
                quickSort(a, beg, loc - 1);
                quickSort(a, loc + 1, end);
            }
        }
    }

    public static class Heap {

        int temp;

        void heapify(int arr[], int size, int i) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size && arr[left] > arr[largest]) {
                largest = left;
            }

            if (right < size && arr[right] > arr[largest]) {
                largest = right;
            }

            if (largest != i) {
                temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                heapify(arr, size, largest);
            }
        }

        void heapSort(int arr[], int size) {
            int i;
            for (i = size / 2 - 1; i >= 0; i--) {
                heapify(arr, size, i);
            }
            for (i = size - 1; i >= 0; i--) {
                temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heapify(arr, i, 0);
            }
        }
    }

    static void print(int arr[], int sz) {
        for (int i = 0; i < sz; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of the array ");
        int sz = in.nextInt();

        int arr[] = new int[sz];
        System.out.println("Enter the array items ");
        for (int i = 0; i < sz; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter 1 to  bubblesort , \n_ 2 to insertion sort , \n_ 3 to merg sort  , \n_ 4 to shell sort ,\n_ 5 to quick sort , \n_ 6 to heap sort ,");
        int n = in.nextInt();

        if (n == 1) {
            BubbleSort bs = new BubbleSort();
            bs.bubblesort(arr, sz);
        } else if (n == 2) {
            Insertion ins = new Insertion();
            ins.sort(arr, sz);
        } else if (n == 3) {
            MergeSort merg = new MergeSort();
            merg.mergeSort(arr, sz);
        } else if (n == 4) {
            Shell_Sort sh = new Shell_Sort();
            sh.shellsort(arr, sz);
        } else if (n == 5) {
            QuickSort qu = new QuickSort();
            qu.quickSort(arr, 0, sz);
        } else if (n == 6) {
            Heap he = new Heap();
            he.heapSort(arr, sz);
        }
        print(arr, sz);
    }
}
