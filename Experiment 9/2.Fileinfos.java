
import java.io.File;
import java.util.Scanner;


public class Fileinfos {
    public static void main(String[] args) {
        Scanner  obj=new Scanner(System.in);
        System.out.println("Enter your file name:");
        String s=obj.next();
        File f= new File(s);  
        if (f.exists()) {  
             System.out.println("The name of the file is: " + f.getName());  
             System.out.println("The absolute path of the file is: " + f.getAbsolutePath());
             System.out.println("Is file writeable: " + f.canWrite());
             System.out.println("Is file readable: " + f.canRead());
             System.out.println("The size of the file is: " + f.length());
             System.out.println("File last Modified: "+f.lastModified()+"(milli sec)");
        } 
        else {  
            System.out.println("The file does not exist.");  
        }  
    }
}
