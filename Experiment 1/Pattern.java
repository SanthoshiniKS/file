
import java.util.Scanner;


public class pattern {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int row=obj.nextInt();
        int i,j;
        for(i=1;i<=row;i++)
        {
           
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    
}
