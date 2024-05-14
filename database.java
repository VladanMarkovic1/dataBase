import java.sql.*;
public class database{

    public static void main(String[] args) {
       
        String url = "jdbc:mysql://localhost:3306/softwarecompany";
        String username= "root";
        String password = "VIve23kielce!";
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet =statement.executeQuery("select * from programmers");

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+ resultSet.getString(2)+ resultSet.getString(3));
        }
        connection.close();

       }
       catch (ClassNotFoundException e) {
        System.out.println("MySQL JDBC driver not found.");
        e.printStackTrace();
    } catch (SQLException e) {
        System.out.println("SQL Exception occurred:");
        e.printStackTrace();
    }
    
}
}
