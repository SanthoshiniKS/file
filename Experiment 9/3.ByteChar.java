
import java.io.*;
import java.util.Scanner;

public class ByteChar {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner o=new Scanner(System.in);
        System.out.println("\tFile copy\t");
        System.out.println("=====CHARACTER STREAM=====");
        FileReader fr=new FileReader("C:\\Users\\ELCOT\\Documents\\NetBeansProjects\\OOPS\\src\\New Text Document.bin");
        FileWriter fw=new FileWriter("CharSample.bin");
        int i;
        while((i=fr.read())!=-1)
        {
            fw.write(i);
        }
        fr.close();
        fw.close();
        System.out.println("======BYTE STREAM=====");
        FileInputStream f=new FileInputStream("C:\\Users\\ELCOT\\Documents\\NetBeansProjects\\OOPS\\src\\new.bin");
        System.out.println(" ");
        FileOutputStream fb=new FileOutputStream("ByteSample.bin");
        int read;
        while((read=f.read())!=-1)
        {
            fb.write(read);
        }
        fr.close();
        fw.close();
        System.out.println("File Copied Successfully!!!");
    }
    
}
