package My project;
  
       
class mar {
    int[] arr = new int[30];
    int n = 0;
public void add(int value) {
        arr[n++] = value;
}
public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
}
public void recmerge() {
        int[] work = new int[n];
        recmerge(work, 0, n - 1);
}
public void recmerge(int[] work, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        recmerge(work, start, mid);
        recmerge(work, mid + 1, end);
        merge(work, start, mid, end);
    }
public void merge(int[] work, int start, int mid, int end) {
        int j = 0;
        int lowB = start;
        int m = mid - 1;
        int nu = start - end + 1;
        while (start <= m && mid <= end) {
            if (arr[start] < arr[mid]) {
                work[j++] = arr[start++];
            } 
            else {
                work[j++] = arr[mid++];
            }
        }
        while (start <= m) {
            work[j++] = arr[start++];
        }
        while (mid <= end) {
            work[j++] = arr[mid++];
        }
        for (int i = 0; i < n; i++) {
            arr[lowB + i] = work[i];
        }
    }
}
public class merge {
    public static void main(String[] args) {
        mar m = new mar();
        m.add(21);
        m.add(55);
        m.add(31);
        m.add(52);
        m.add(91);
        m.add(21);
        m.add(32);
        m.add(210);
        m.display();
        System.out.println();
        m.recmerge();
        m.display();
    }
}
