package oops;
import java.util.*;
public class genericsearch {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //Type: Integer
        Integer num[]={12,34,52,22,67,89,100,120,150,200};
        search<Integer> obj1=new search<>(num);
        System.out.println("Enter an Integer to search:");
        Integer n=obj.nextInt();
        obj1.comparing(n);
        
        //Type: Double
        Double dou1[]={1.2,3.4,5.2,2.2,6.7,8.9,10.0,12.0,15.0,20.0};
        search<Double> obj2=new search<>(dou1);
        System.out.println("Enter an Double value to search:");
        Double d=obj.nextDouble();
        obj2.comparing(d);
       
        //Type: Float
        Float fl1[]={1.2f,3.4f,5.2f,2.2f,6.7f,8.9f,10.0f,12.0f,15.0f,20.0f};
        search<Float> obj5=new search<>(fl1);
        System.out.println("Enter a Float value to search:");
        Float f=obj.nextFloat();
        obj5.comparing(f);
        
        //Type: String
        String list[]={"OOPS","JAVA","C","C++","PYTHON","DATASCIENCE"};
        search<String> obj3=new search<>(list);
        System.out.println("Enter a String to search:");
        String s=obj.next();
        obj3.comparing(s);
        
        //Type: Character
        Character ch[]={'a','b','c','d','e','f','g','h'};
        search<Character> obj4=new search<>(ch);
        System.out.println("Enter a Character to search:");
        Character c=obj.next().charAt(0);
        obj4.comparing(c);
    }
}
class search<T>
{
    T[] array;
    search(T[] array)
    {
        this.array=array;
    }
    public void comparing(T a)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i].equals(a))
            {
                int pos=i+1;
                System.out.println("The Searched element "+a+" is found in Position "+pos+" of the array");
            }
        }
    }
}