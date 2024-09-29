
import java.lang.*;
import java.sql.DriverManager;
public class tablesql {
    // instance variable to store connection object
    private Connection con;
    // since my connection info is not going to chnage thus we'll use static variable.
    private static final String url = "jdbc:mysql://3306/mit",user ="root",pass ="somepass";
    // static block to load the driver
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    // cconstructor to create connection object
    public tablesql(){
        try {
            con = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
         e.printStackTrace();
        }
    }
    
}
