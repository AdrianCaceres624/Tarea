/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mecapp.dao;
import java.util.List;
import py.edu.facitec.mecapp.model.Ciudad;
/**
 *
 * @author ADRIANDJ
 */
public interface CiudadDao {
    
    void guardarCiudad(Ciudad ciudad);
    void modificarCiudad(Ciudad ciudad);
    void eliminarCiudad(int codigo);
    Ciudad buscarCiudadPorCodigo(int codigo);
    List<Ciudad> buscarClientePorFiltro(String filtro);
    
}
