import java.util.Scanner;
public class Marks {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter mark:");
        float m=obj.nextFloat();
        if(m>90&&m<100)
            System.out.println("Excellent!");
        else if(m>80)
            System.out.println("Good :)");
        else if(m>70)
            System.out.println("Keep it up");
        else if(m>60)
            System.out.println("Study well: Work more");
        else if(m>50)
            System.out.println("Try to Study Hard");
        else 
            System.out.println("Need Improvement");
    }
    
}
