import java.sql.*;

public class conn
{
    Connection c;
    Statement s;
    public conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/electricbilling","root","MySQL");
            s=c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
