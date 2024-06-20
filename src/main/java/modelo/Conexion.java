/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class Conexion {
    Connection con;
    public Connection getConnection(){
       
     String URL="jdbc:mysql://localhost/bdempresa";
    
     String USERNAME="root";
    
     String PASSWORD="";

    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        return con;
    }catch(Exception e){
        System.out.println(e);
    }return con;
}
}
