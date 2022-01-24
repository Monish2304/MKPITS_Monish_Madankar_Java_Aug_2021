import java.sql.*;

public class callablestatement {
    static final String QUERY = "{call getEmpName (?, ?)}";
    public static void main(String[] arg) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
            CallableStatement stmt=con.prepareCall(QUERY);
            stmt.setInt(1,8);
            stmt.registerOutParameter(2, Types.VARCHAR);
            stmt.execute();
            String ename=stmt.getString(2);
            System.out.println("emp_name name for emp_no 2 is " + ename);
        }catch (Exception ee) {

        }
    }
}
