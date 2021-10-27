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
public class Insert {

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
         String sql = "INSERT INTO movies VALUES ('Intersteller','Matthew McConaughey','Anne Hathaway','Christopher Nolan','2014-11-07')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO movies VALUES ('Inception','Leonardo DiCaprio','Ellen Page','Christopher Nolan','2010-07-16')";
          stmt.executeUpdate(sql);
         sql = "INSERT INTO movies VALUES ('The Usual Suspects','Kevin Spacey','Suzy Amis','Bryan Singer','1995-08-16')";
          stmt.executeUpdate(sql);
         sql = "INSERT INTO movies VALUES ('Fight Club','Edward Norton','Helena Bonham Carter','David Fincher','1999-10-15')";
          stmt.executeUpdate(sql);
         sql = "INSERT INTO movies VALUES ('The Departed', 'Leonardo DiCaprio', 'Vera Farmiga','Martin Scorsese','2006-10-06')";
          stmt.executeUpdate(sql);
         sql = "INSERT INTO movies VALUES ('The Martian','Matt Damon','Jessica Chastain','Ridley Scott','2015-10-02')";
          stmt.executeUpdate(sql);
         sql = "INSERT INTO movies VALUES ('Pulp Fiction','John Travolta','Uma Thurman','Quentin Tarantino','1994-10-14')";
          stmt.executeUpdate(sql);
         sql = "INSERT INTO movies VALUES ('The Wolf of Wall Street','Leonardo DiCaprio','Margot Robbie','Martin Scorsese','2013-12-25')";
         stmt.executeUpdate(sql);
         System.out.println("Records have been inserted into the Table");
         con.close();
         }
         catch(Exception e){
           System.out.println(e);
       }
    }  
}
