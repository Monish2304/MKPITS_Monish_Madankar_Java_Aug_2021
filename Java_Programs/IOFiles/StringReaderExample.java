import java.io.StringReader;
    public class StringReaderExample {
        public static void main(String[] args) throws Exception {
            String srg = "* * * Hello Everyone!! * * * \n \n   Welcome to the World of JAVA...";
            StringReader reader = new StringReader(srg);
            int k=0;
                while((k=reader.read())!=-1){
                    System.out.print((char)k);
                }
            }
    }