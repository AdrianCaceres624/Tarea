/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mecapp.controller;
import java.util.List;
import py.edu.facitec.mecapp.model.Ciudad;
/**
 *
 * @author ADRIANDJ
 */
public interface CiudadController {
    
    void crearCiudad(Ciudad ciudad);
    void modificarCiudad(Ciudad ciudad);
    void eliminarCiudad(int codigo);
    Ciudad consultarCiudadPorCodigo(int codigo);
    List<Ciudad> consultarCiudadPorFiltro(String filtro);
        
}
