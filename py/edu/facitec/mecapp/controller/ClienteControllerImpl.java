/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mecapp.controller;

import java.util.List;
import py.edu.facitec.mecapp.dao.ClienteDao;
import py.edu.facitec.mecapp.Dao.ClienteDaoImpl;
import py.edu.facitec.mecapp.model.Cliente;

/**
 *
 * @author ADRIANDJ
 */
public class ClienteControllerImpl implements ClienteController {

    private ClienteDao clienteDao;

    public ClienteControllerImpl() {
    
    this.clienteDao = new ClienteDaoImpl();
    
    }
  
    @Override
    public void registrarCliente(Cliente cliente) {
        clienteDao.guardarClinte(cliente);
        
      
    }

    @Override
    public void modificarCliente(Cliente cliente) {
        clienteDao.modificarCliente(cliente);
    }

    @Override
    public void eliminarCliente(int codigo) {
        clienteDao.eliminarCliente(codigo);
    }

    @Override
    public Cliente consultarClientePorCodigo(int codigo) {
      return clienteDao.buscarClientePorCodigo(codigo);
    }

    @Override
    public List<Cliente> consultarClientePorFiltro(String filtro) {
        return clienteDao.buscarClientePorFiltro(filtro);
   }
    
   
    
}
