/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_tortue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import projet_tortue.core.*;

public class main {
    
    public static Connection connect() {
        Connection conn = null;
        try {
            String localDir = System.getProperty("user.dir");
            // db parameters
            String url = "jdbc:sqlite:" + localDir + "/src/projet_tortue/database/test.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    
    public static void selectTest(){
        String sql = "Select idToto from Toto";
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("idToto"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TestCanvasTortue test = new TestCanvasTortue();
        selectTest();
    }
    
}
