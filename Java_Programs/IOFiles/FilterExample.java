 import java.io.*;
    public class FilterExample {
        public static void main(String[] args) throws IOException {
            File data = new File("M:\\IO\\testout.txt");
            FileOutputStream file = new FileOutputStream(data);
            FilterOutputStream filter = new FilterOutputStream(file);
            String s="Welcome to the world of JAVA.";
            byte b[]=s.getBytes();
            filter.write(b);
            filter.flush();
            filter.close();
            file.close();
            System.out.println("Success...");
        }
    }