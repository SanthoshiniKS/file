import java.util.*;
public class CollectionSort {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Student arr[]=new Student[20];
        ArrayList<Student> list=new ArrayList<>();
        for(int i=0;i<20;i++)
        {
            arr[i]=new Student();
            arr[i].getdata();
            list.add(arr[i]);
        }
        System.out.println("---------------Student Details-------------- ");
        System.out.println(list);
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("Student Details in Sorted order with respect to Lowest CGPA: ");
        Collections.sort(list, new increasesorting());
        System.out.println(list);
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("Student Details in Sorted order with respect to Highest CGPA: ");
        Collections.sort(list, new decreasesorting());
        System.out.println(list);
    }
}
class Student
{
    String name;
    int rollno;
    double cgpa;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Roll number:");
        rollno=obj.nextInt();
        System.out.println("Enter Name:");
        name=obj.next();
        System.out.println("Enter CGPA:");
        cgpa=obj.nextDouble();
    }

    @Override
    public String toString() {
        return "(" + "Roll No.=" + rollno + ", Name=" +name  + ", CGPA=" + cgpa + ")\n";
    }
}
class increasesorting implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return Double.compare(s1.cgpa, s2.cgpa);
    }
}
class decreasesorting implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return Double.compare(s2.cgpa, s1.cgpa);
    }
}