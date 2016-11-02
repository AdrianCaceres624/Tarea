/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mecapp.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mecapp.model.Cliente;
import py.edu.facitec.mecapp.util.ConexionManager;

/**
 *
 * @author Personal
 */
public class ClienteDaoImpl implements py.edu.facitec.mecapp.dao.ClienteDao {

    //Strin='"++"'
    //numerico="++"
    public void guardarCliente(Cliente cliente) {
       String sql="insert in to clientes (nombres, apellidos,direccion) values"
               + "('"+cliente.getNombre()+"', )'"+cliente.getApellido()+"', "
               + "'"+cliente.getDireccion()+"' ";
    
        System.out.print(sql);
        
        ConexionManager.conectar();
        
        try {
            //conectar a la base de datos
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConexionManager.desconectar();
        
    }  

    @Override
    public void guardarClinte(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarCliente(Cliente cliente) {
        String sql = "update Clientes set nombres='"+cliente.getNombre()+"',"
                + "apellidos='"+cliente.getApellido()+"',"
                + "direccion='"+cliente.getDireccion()+"',"
                + " where codigo="+cliente.getCodigo()+"   ";
        
        //Conectar 
        ConexionManager.conectar();
        
        try {
            //ejecutar el sql
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        //desconectar
        ConexionManager.desconectar();
        
        
    }

    @Override
    public void eliminarCliente(int codigo) {
        String sql= "delete from clientes where codigo= "+codigo+"";
        //Conectar 
        ConexionManager.conectar();
        
        try {
            //ejecutar el sql
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        //desconectar
        ConexionManager.desconectar();
    }

    @Override
    public Cliente buscarClientePorCodigo(int codigo) {
        String sql= "select nombres, apellidos, direccion from clientes "
                +" where codigo= "+codigo+" ";
        
        Cliente cliente = null;
        
        ConexionManager.conectar();
        
        List<Cliente> lista = new ArrayList();
        
        try {
            ResultSet rs = ConexionManager.stm.executeQuery(sql);
            
            if (rs.next()) { //si tuvo resultado
                cliente= new Cliente();
                cliente.setNombre(rs.getString("nombres")); //cargamos en el atributo el valor de la columna
                cliente.setApellido(rs.getString("apellidos"));
                cliente.setDireccion(rs.getString("direccion"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
        
        return cliente;
        
        }   

    @Override
    public List<Cliente> buscarClientePorFiltro(String filtro) {
        String sql= "select nombres, apellidos, direccion from clientes where nombres LIKE '%"+filtro+"' or apellidos LIKE '%"+filtro+"' " ;
        List<Cliente> lista = new ArrayList();
        Cliente cliente;
         try {
            ResultSet rs = ConexionManager.stm.executeQuery(sql);
            
            while (rs.next()) { //si tuvo resultado
                cliente= new Cliente();
                cliente.setNombre(rs.getString("nombres")); //cargamos en el atributo el valor de la columna
                cliente.setApellido(rs.getString("apellidos"));
                cliente.setDireccion(rs.getString("direccion"));
                lista.add(cliente);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConexionManager.desconectar();
         
        return lista;
    }
}