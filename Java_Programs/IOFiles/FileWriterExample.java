
    import java.io.FileWriter;
    public class FileWriterExample {
        public static void main(String args[]){
             try{
               FileWriter fw=new FileWriter("M:\\IO\\testout.txt");
               fw.write("Welcome to the world of JAVA.");
               fw.close();
              }catch(Exception e){System.out.println(e);}
              System.out.println("Success...");
         }
    }
