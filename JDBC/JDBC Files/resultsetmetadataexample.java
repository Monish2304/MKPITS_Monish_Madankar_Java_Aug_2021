import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class resultsetmetadataexample {
    public static void main(String args[]) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employee");
        ResultSetMetaData rsMetaData = rs.getMetaData();
        System.out.println("Number of columns: "+rsMetaData.getColumnCount());
        System.out.println("Column Label: "+rsMetaData.getColumnLabel(1));
        System.out.println("Column Name: "+rsMetaData.getColumnName(1));
        System.out.println("Table Name: "+rsMetaData.getTableName(1));
    }
}
