public class Maximum
{
    public static void main(String args[])
    {
        int a1= Integer.parseInt(args[0]);
        int a2= Integer.parseInt(args[1]);
        if(a1> a2)
            System.out.println(a1+" is greater than "+a2);
        else
            System.out.println(a2+" is greater than "+a1);
    }
}