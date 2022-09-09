import java.util.Scanner;
public class Creditcard {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i=1;
        System.out.println("Enter number of customers:");
        int n=obj.nextInt();
        Customer cus[]=new Customer[n];
       for(i=0;i<n;i++){
            System.out.println("Enter customer "+(i+1)+" name:");
            String na=obj.next();
            System.out.println("Enter Card number:");
            int cno=obj.nextInt();
            System.out.println("Enter Pin Number:");
            int pi=obj.nextInt();
            System.out.println("Enter Amount:");
            double amt=obj.nextDouble();
            cus[i]=new Customer(na,cno,pi,amt);
            cus[i].viewcreditamount();
            cus[i].viewpin();
            System.out.println("\nTo check balance or change pin enter one of the following choices");
            
            System.out.println("1. Pay Balance");
            System.out.println("2. Change Pin");
            System.out.println("Enter choice:");
            int ch=obj.nextInt();
            if(ch==1){
             cus[i].paybalance();
            }
            else if(ch==2)
            {
             System.out.println("Enter New pin to be changed:");
             int newpin=obj.nextInt();
             cus[i].setpin(newpin);
             cus[i].changepin();
            }
            System.out.println(cus[i]);
            System.out.println("---------------");
        }
        
    }
}
interface Creditcardinterface
{
   public void viewcreditamount();
   public void viewpin();
   public void changepin();
   public void paybalance();
}
class Customer implements Creditcardinterface
{
    String name;
    double cardnumber;
    int pin=1234;
    double creditamount=0;
    Customer(String n,double cn,int p,double ca)
    {
        name=n;
        cardnumber=cn;
        pin=p;
        creditamount=ca;
    }
    @Override
    public void viewcreditamount()
    {
        System.out.println("Credit Card Amount="+creditamount);
    }
    @Override
    public void changepin()
    {
        System.out.println("Your Secret pin"+pin);
    }
    public void setpin(int p)
    {
            pin=p;
    }
    public void viewpin()
    {
        System.out.println("Your Secret pin"+pin);
    }
    public void paybalance()
    {
        Scanner obj=new Scanner(System.in);
        if(creditamount!=0){
        System.out.println("Enter paid amount:");
        double paid=obj.nextDouble();
        double balance=creditamount-paid;
        System.out.println("----------------------------");
        System.out.println("Balance amount:"+balance);
        }
        else
        System.out.println("No Balance amount");
    }
    public String toString()
    {
        return "\nName:"+name+"\nCardnumber:"+cardnumber;
    }
}