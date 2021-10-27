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
public class Select {

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
         String sql="Select * from movies";
         ResultSet rs=stmt.executeQuery(sql);
         if(rs.next()){
            do{
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5));
            }
            while(rs.next());
            }
         else{
            System.out.println("All records displayed");
		}
	con.close();
            }
	catch(Exception e){
            System.out.println(e);
	}
    }
}    

