
import java.util.*;

public class Collectionsum {
    public static void main(String[] args) {
        Collection<Integer> greaterlist=new ArrayList<>();
        Collection<Integer> smallerlist=new ArrayList<>();
        int arr[]=new int[10];
        int sum=0;
        double avg;
        Scanner obj=new Scanner(System.in);
        System.out.println("Array Elements : ");
        for(int i=0;i<arr.length;i++)
        {
                arr[i]=(int)(Math.random()*80+10);
                System.out.print(arr[i]+" ");
                sum+=arr[i];
        }
        avg=sum/10;
        System.out.println("\nSum : "+sum);
        System.out.println("Average : "+avg);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<avg)
            {
                smallerlist.add(arr[i]);
            }
            if(arr[i]>avg)
            {
                greaterlist.add(arr[i]);
            }
        }
        System.out.println("List with Elements Smaller than Average : "+smallerlist);
        System.out.println("List with Elements Greater than Average : "+greaterlist);
    }  
}
