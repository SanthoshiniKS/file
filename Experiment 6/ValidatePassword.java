package oops;
import java.util.Scanner;
public class ValidatePassword {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String sts="Weak";
        while("Weak".equals(sts))   
        {
            System.out.println("______________________________________");
            System.out.println("Enter Password:");
            String str=obj.next();
            char c[]=str.toCharArray();
            Password ps=new Password();
            sts=ps.getPassword(c,ps.length(c));
        }
    }
}
class Password
{
    char c2[]=new char[20];
    String getPassword(char p[],int l)
    {
        this.c2=p;
        int lwr=0,upr=0,digit=0,other=0;
        int j=1;
        int len=l;
        if(len>=8)
        {
        for(char c1:c2)
        {
            if(Character.isLowerCase(c1))
            {
                lwr++;
            }
            else if(Character.isUpperCase(c1))
            {
                upr++;
            }
            else if(Character.isDigit(c1))
            {
                digit++;
            }
            else
            {
                other++;
            }
        }
        }
        else
        {
            System.out.println("======Enter minimum 8 Characters======");
        }
        if(lwr>=2 && upr>=2 && digit>=2)
        {            
            System.out.println("<<<<<<<Your Password is Strong>>>>>>>");
            String Status="Strong";
            return Status;
        }
        else
        {
            System.out.println("Your Password is Weak!!");
            System.out.println("Enter atleast 2 Lowecase letters, 2 Uppercase letters & 2 digits");
            String Status="Weak";
            return Status;
        }
    }
    int length(char c[])
    {
        int length=0;
        for(char c1:c)
        {
            length++;
        }
        System.out.println("Your Password Contains "+length+" characters");
        return length;
    }
}
