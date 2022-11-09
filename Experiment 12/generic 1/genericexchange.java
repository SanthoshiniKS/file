package oops;
import java.util.*;
public class genericexchange {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n=obj.nextInt();
        Integer num[]=new Integer[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            num[i]=obj.nextInt();
        }
        System.out.println("Elements of array before exchanging:");
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+"  ");
        }
        System.out.println("\nEnter element 1 to swap:");
        Integer e1=obj.nextInt();
        System.out.println("Enter element 2 to swap:");
        Integer e2=obj.nextInt();
        Exchange ex=new Exchange<>(e1,e2,num);
        ex.swap();
    }
}
class Exchange<T,V>
{
    T data1;
    T data2;
    V[] array;
    Exchange(T d1,T d2,V[] a)
    {
        data1=d1;
        data2=d2;
        array=a;
    }
    public void swap()
    {
        int e1 = 0,e2 = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==data1)
            {
                 e1=i;
            }
            if(array[i]==data2)
            {
                 e2=i;
            }
        }
        array[e1]=(V) data2;
        array[e2]=(V) data1;
        System.out.println("Elements of array after exchanging:");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+"   ");
        }
    }
}
