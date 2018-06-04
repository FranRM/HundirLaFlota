
package com.fran.xogadores;
import com.fran.metodos.Entradaspred;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proxectoprog.Tableiro;

public class Puntuacion {
    
   
    Connection connect;
    ResultSet rs ;
    Statement s;
    private String ruta="Puntuacion.db";
    ArrayList <Xogador>lista=new ArrayList();
    DefaultTableModel modelo=new DefaultTableModel();
    Xogador xog=new Xogador();
    int sumpunt=0;
    String id;
    public Puntuacion(){}
    
    
    
    public void conectar(){
        
        try{
        connect=DriverManager.getConnection("jdbc:sqlite:"+ruta);
        if(connect!=null){
            System.out.println("Base conectada.");
        }
        }catch(SQLException sqe1){
            System.out.println("Erro:"+sqe1.getMessage());
        }
    }
    
        public ArrayList cargarArray(){
        try{
            s=connect.createStatement();
            rs=s.executeQuery("select * from xogador order by puntos desc;");
            while(rs.next()){
            lista.add(new Xogador(rs.getString(1),rs.getInt(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Puntuacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
        
    public void consultar(){
    
        
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("ID");
        modelo.addColumn("Points");
        
//        Iterator<Xogador> it=this.cargarArray().iterator();
//        
//        while(it.hasNext()){
//            Xogador x=it.next();
//            modelo.addRow(new Object[]{x.getID(),x.getPoints()});
//        }
        try{
            s=connect.createStatement();
            rs=s.executeQuery("select * from xogador order by puntos desc;");
            while(rs.next()){
            modelo.addRow(new Object[]{rs.getString(1), rs.getInt(2)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Puntuacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertar(Tableiro t){
        conectar();
        sumpunt=t.getAcertoH()*10;
        
    try {
            PreparedStatement st = connect.prepareStatement("insert into xogador (nome, puntos) values (?,?)");
            
            st.setString(1, id);
            st.setInt(2,sumpunt);

            st.execute();
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
}
    public void pechar(){
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Puntuacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void nome(){
        id=Entradaspred.pedirString("Benvido a Batalla naval, indique o seu usuario.");
    }
}