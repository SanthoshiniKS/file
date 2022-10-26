
import java.io.*;

public class IOstreams {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        System.out.println("Totsl no. of files : "+args.length);
        for (int i = 0; i < args.length; i++) {
            countlines(args[i]);
        }

    }

    public static void countlines(String fn) throws FileNotFoundException, IOException {
        String s = fn;
        File f = new File(s);
        FileReader fr = new FileReader(s);
        BufferedReader br = new BufferedReader(fr);
        String str;
        int count = 0;
        while ((str = br.readLine()) != null) {
            count++;
        }
        System.out.println("FileName: " + f.getName() + "\nNo.of lines: "+count);
    }
}
