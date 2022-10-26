import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
public class Image {
    public static void main(String[] args) {
        //Program to read and copy a image
        int width = 950;
        int height = 600;
        BufferedImage image;
        image = null;

        try {
            File input_file = new File("C:\\Users\\ELCOT\\Documents\\NetBeansProjects\\OOPS\\src\\rose.png");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(input_file);
            System.out.println("Reading.....");
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
        
        try {
            File output_file = new File("C:\\Users\\ELCOT\\Documents\\NetBeansProjects\\OOPS\\src\\NewImage.png");
            ImageIO.write(image, "png", output_file);
            System.out.println("Writing completed.....");
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
        
    }
    
}
