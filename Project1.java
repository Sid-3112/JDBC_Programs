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
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
       Statement stmt=con.createStatement();
       stmt.executeUpdate("create database favemovies");
       
           System.out.println("Database created successfully");
       con.close();
       } 
       catch(Exception e){
           System.out.println(e);
       }
    }  
}
