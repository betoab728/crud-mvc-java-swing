/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;
import modelo.PersonaDAO;
import vista.Vista;
/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener {
    PersonaDAO dao=new PersonaDAO();
     Persona p=new Persona();
     Vista vista=new Vista();
     DefaultTableModel modelo=new DefaultTableModel();
     
    
     public void Listar (JTable tabla){
        modelo=(DefaultTableModel)tabla.getModel();
        List<Persona> lista = dao.Listar();
        Object[ ]object=new Object[4];
        for(int i=0; i<lista.size(); i++){
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getNom();
           
            modelo.addRow(object);
        }
        vista.tabla.setModel(modelo);
    } 
     
     

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
