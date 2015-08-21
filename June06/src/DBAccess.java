import java.sql.*;



public class DBAccess

{

    public static void main (String[] args)

    {

        Connection conn = null;



        try

        {

            String userName = "root";

            String password = "password";

            String url = "jdbc:mysql://localhost/test";

            Class.forName ("com.mysql.jdbc.Driver").newInstance ();

            conn = DriverManager.getConnection (url, userName, password);

         

            System.out.println ("Database connection established");

            Statement s = conn.createStatement ();

            int rc=s.executeUpdate ("Update student set email='abcded@gmail.com' where id=3");

            System.out.println(rc+" records are updated.");

            

            

           ResultSet rs= s.executeQuery ("SELECT * FROM student");

            

            while (rs.next ())

            {

                int idVal = rs.getInt ("id");

                String nameVal = rs.getString (2);// second column

                String catVal = rs.getString ("email");

                System.out.println (

                        "id = " + idVal

                        + ", name = " + nameVal

                        + ", email = " + catVal);

           //     ++count;

            }

            rs.close ();

            s.close ();



        // System.out.println (count + " rows were inserted");



        }

        catch (Exception e)

        {

            System.err.println ("Cannot connect to database server");

            System.out.println(e);

        }

        finally

        {

            if (conn != null)

            {

                try

                {

                    conn.close ();

                    System.out.println ("Database connection terminated");

                }

                catch (Exception e) { /* ignore close errors */ }

            }

        }

    }

}