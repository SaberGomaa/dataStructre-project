
package My project;

public class BubbleSort {

    static void bubblesort(int []arr,int n)
    {
        for (int i=0;i<n-1;++i)
        {
            for (int j=0;j<n-i-1;++j)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,1,17,86,22,78,56,2,19,29};
        bubblesort(arr,arr.length);
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    
}
