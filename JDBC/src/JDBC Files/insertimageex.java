import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.io.*;
public class insertimageex {
    public static void main(String args[]) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123", "root", "");
            System.out.println("Connection established......");
            File file=new File("M:\\Images\\cat1.jpg");
            FileInputStream fis=new FileInputStream(file);
            PreparedStatement ps=con.prepareStatement("insert into mytable (name,image) values(?,?)");
            ps.setString(1,"cat1");
            ps.setBinaryStream(2,fis,(int)file.length());
            ps.executeUpdate();
            System.out.println("image saved in database successfully");
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }
}
