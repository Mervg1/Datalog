import java.sql.*;

public class SqlQuery {

    public  void getQuery(String query) {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=AdventureWorks;integratedSecurity=false;";

        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd;

        try {
            // Establish the connection.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl,"sa","Compiladores@2021");

            // Create and execute an SQL statement that returns some data.
            //String SQL = "select EmployeeID, ManagerID from HumanResources.Employee";
            System.out.println(query);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            rsmd = rs.getMetaData();
            for(int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.printf("%40s", rsmd.getColumnLabel(i));
            }
            System.out.println();
            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                for(int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.printf("%40s",rs.getString(i));
                }
                System.out.println();
            }
        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            if (rs != null) try { rs.close(); } catch(Exception e) {}
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
    }
}