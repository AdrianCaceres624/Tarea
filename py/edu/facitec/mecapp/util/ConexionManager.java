package py.edu.facitec.mecapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionManager {

	private static Connection conexion;
	public static  Statement stm;


	private static final String URL = "jdbc:postgresql://localhost:5432/bd1_taller_mecanico";
	private static final String USER = "postgres";
	private static final String PASSWORD = "12345";

	public static Connection conectar(){
		try{
			Class.forName("org.postgres.Driver");
		}catch (ClassNotFoundException ex) {
			Logger.getLogger(ConexionManager.class.getName()).log(Level.SEVERE, null,ex);
		}
		try {
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			stm = conexion.createStatement();
		} catch (SQLException ex) {

			ex.printStackTrace();
		}
		return conexion;
	}
	public static void desconectar(){
		if (conexion != null) {
			try {
				stm.close();
				conexion.close();
			} catch (SQLException ex) {
				Logger.getLogger(ConexionManager.class.getName()).log(Level.SEVERE,null,ex);
			}
		}
	}
}

