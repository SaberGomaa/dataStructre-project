package My project;
 
public class LargestInArray{  
public static int getLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-1];  
}  
public static void main(String args[]){  
int a[]={10,11,14,15,12,11};  
int b[]={40,60,90,70,30,42,75};  
System.out.println("Largest: "+getLargest(a,6));  
System.out.println("Largest: "+getLargest(b,7));  
}}  