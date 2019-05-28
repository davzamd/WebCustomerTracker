package testDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




@WebServlet("/TestDbServlet")
public class TestDbServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String user = "springstudent";
        String password = "springstudent";
        String jdbcURL = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String driver = "com.mysql.jdbc.Driver";


        try{
            PrintWriter out = response.getWriter();

            out.println("Connecting to DB: "+jdbcURL);

            Class.forName(driver);
            Connection connection = DriverManager.getConnection(jdbcURL, user, password);

            out.println("Connection Success!!");

            connection.close();

        }catch (Exception e){
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}
