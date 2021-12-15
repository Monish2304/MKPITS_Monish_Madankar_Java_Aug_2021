package Connections;
import java.sql.*;
public class ConnectionClass {
    public static Connection createConnection() {
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc.mysql://localhost:3306/mkpits123","root","");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
        return con;
    }
}
