package oops;
import java.util.*;
public class genericoddnum {
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
        System.out.println("\nEnter Beginning index:");
        Integer beg=obj.nextInt();
        System.out.println("Enter Ending index:");
        Integer end=obj.nextInt();
        Intlist<Integer> list=new Intlist<>(num);
        list.check();
        list.maxelement(beg, end);
    }
}
class Intlist<T>
{
    T[] value;
    public Intlist(T[] value)
    {
        this.value=value;
    }
    public void check()
    {
        for(int i=0;i<value.length;i++)
        {
            int s=(Integer)value[i];
            if(s%2!=0)
            {
                System.out.println("Odd Integer:"+value[i]);
            }
        }
    }
    public void maxelement(int begin,int end)
    {
        int max=(Integer)value[0];
        for(int i=begin;i<=end;i++)
        {
            if(((Integer)value[i])>max)
            {
                max=(Integer)value[i];
            }
        }
        System.out.println("\n=================\nMaximum Element= "+max);
    }

}

