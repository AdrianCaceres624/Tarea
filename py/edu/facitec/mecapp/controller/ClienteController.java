/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mecapp.controller;

import java.util.List;
import py.edu.facitec.mecapp.model.Cliente;

/**
 *
 * @author ADRIANDJ
 */
public interface ClienteController {
    //definimos la regla de negocios, que es lo que va a hacer el usuario
    void registrarCliente(Cliente cliente);
    void modificarCliente(Cliente cliente);
    void eliminarCliente(int codigo);
    Cliente consultarClientePorCodigo(int codigo);
    List<Cliente> consultarClientePorFiltro(String filtro);
}
