  import java.io.StringReader;
    public class StringReaderExample1 {
        public static void main(String[] args) throws Exception {
            String srg = "Hello Programer!! \n Welcome to Java.";
            StringReader reader = new StringReader(srg);
            int k=0;
                while((k=reader.read())!=-1){
                    System.out.print((char)k);
                }
            }
    }