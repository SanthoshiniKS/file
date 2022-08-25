package lab;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Studentde o=new Studentde();
        o.getdata();
        o.display();
    }
}
class Studentde
{
     String Studname;
     int regno;
     int days;
     int pre;
     float avg;
     void getdata()
     {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        Studname=obj.next();
        System.out.println("Enter Register Number:");
        regno=obj.nextInt();
        System.out.println("Enter Total No. of working days in the Semester");
        days=obj.nextInt();
        System.out.println("Enter Total No. of days present:");
        pre=obj.nextInt();
        avg=(pre*100)/days;
        System.out.println("Attendance Percentage: "+avg);
     }
     void display()
     {
        if(avg>=90)
            System.out.println("Attendance Mark: 5 Marks");
        else if(avg>=80 && avg<90)
            System.out.println("Attendance Mark: 4 Marks");
        else if(avg>=75 && avg<80)
            System.out.println("Attendance Mark: 3 Marks");
        else
            System.out.println("Attendance Mark: 0 Marks");
     }
}
