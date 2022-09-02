package lab;
import java.util.Scanner;
public class shape {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        cylinder o = new cylinder();
        System.out.println("\n Radius: " + o.getradius());
        System.out.println("\n Colour: " + o.getcolour());
        System.out.println("\n Area: " + o.getarea());
        System.out.println("\n Height: " + o.getHeight());
        System.out.println("\n Volume: " + o.getVolume());
        System.out.println();
        System.out.println("Enter radius:");
        double radius = obj.nextDouble();
        System.out.println("Enter Colour:");
        String colour = obj.next();
        System.out.println("Enter Height: ");
        double height = obj.nextDouble();
        cylinder cl = new cylinder(radius, height, colour);
        System.out.println("\n Radius: " + cl.getradius());
        System.out.println("\n Colour: " + cl.getcolour());
        System.out.println("\n Area: " + cl.getarea());
        System.out.println("\n Height: " + cl.getHeight());
        System.out.println("\n Volume: " + cl.getVolume());
        System.out.println();
        System.out.println("\n Enter new radius:");
        double newr = obj.nextDouble();
        cl.setradius(newr);
        System.out.println("\n Enter new Height:");
        double newh = obj.nextDouble();
        cl.setHeight(newh);
        System.out.println();
        System.out.println("\n Enter new colour:");
        String newc = obj.next();
        cl.setcolour(newc);
        System.out.println();
        System.out.println("volume=" + cl.getVolume());
        System.out.println(cl);
    }
}

class circle {

    double radius;
    String colour;
    double area;

    circle() {
        radius = 1.0;
        colour = "Red";
    }

    circle(double r) {
        radius = r;
        colour = "Red";
    }
    circle(double ra, String cl) {
        radius = ra;
        colour = cl;
    }

    public double getradius() {
        return radius;
    }

    public void setradius(double value) {
        radius = value;
    }

    public String getcolour() {
        return colour;
    }

    public void setcolour(String clr) {
        colour = clr;
    }

    public double getarea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public String toString()
    {
   
        return "circle[Radius="+radius+",Colour="+colour+"]";
    }
}

class cylinder extends circle {

    double height;
    double Volume;

    cylinder() {
        super();
        height = 1.0;
    }

    cylinder(double ra) {
        super(ra);
        radius = ra;
    }

    cylinder(double ra, double ht) {
        radius = ra;
        height = ht;
    }

    cylinder(double r, double h, String clr) {
        
        radius = r;
        colour = clr;
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double ht) {
        height = ht;
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

}
