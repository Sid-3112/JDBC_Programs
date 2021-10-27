/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

/**
 *
 * @author SHARAD
 */
import java.sql.*;
public class Table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/favemovies","root","root"); 
         System.out.println("Connected to Database Successfully");
         Statement stmt=con.createStatement();
                   String sql = "CREATE TABLE Movies " +
                   "(moviename VARCHAR(30), " +
                   " actor VARCHAR(30), " + 
                   " actress VARCHAR(30), " + 
                   " director VARCHAR(30), " + 
                   " released DATE)"; 

         stmt.executeUpdate(sql);
         System.out.println("Table created successfully");
       con.close();
       } 
       catch(Exception e){
           System.out.println(e);
       }
    }  
}
