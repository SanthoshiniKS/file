
import java.util.Scanner;


public class Array {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no. of elements in array:");
        int a[]=new int[20];
        int i,n;
        n=obj.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int small=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]<small)
                small=a[i];
        }
        int large=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>large)
                large=a[i];
        }
         System.out.println("Smallest element in array: "+small);
         System.out.println("Largest element in array: "+large);
    }
    
}
