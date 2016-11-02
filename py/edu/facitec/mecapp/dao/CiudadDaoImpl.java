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
public class CiudadDaoImpl implements CiudadDao {

    @Override
    public void guardarCiudad(Ciudad ciudad) {
       String sql="insert into ciudad (nombre, iso, estado)values('"+ciudad.getNombre()+"', '"+ciudad.getIso()+"', "+ciudad.getEstado()+")";
    }

    @Override
    public void modificarCiudad(Ciudad ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCiudad(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ciudad buscarCiudadPorCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ciudad> buscarClientePorFiltro(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
