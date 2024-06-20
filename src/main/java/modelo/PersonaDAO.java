/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PersonaDAO {
    Conexion conectar=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet dc;
    
    public List Listar (){
        List<Persona> datos =new ArrayList<> ();
        String sql ="select * from departamento, empleado ";
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            dc=ps.executeQuery();
            while(dc.next()){
                Persona p =new Persona();
                p.setId(dc.getInt(1));
                p.setNom(dc.getString(2));
                
            }
        }catch (Exception e){
        }
        return datos;
}}
