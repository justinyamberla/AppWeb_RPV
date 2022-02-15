package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;


import modelo.entidades.Administrador;
import modelo.conexion.conexionBDD;


public class AdministradorDAO {
	
	public AdministradorDAO(){
		
	}
	
	public Administrador autenticar(String usuario, String clave) {
		Administrador admAut = null;
		
		ResultSet rs=null;
		PreparedStatement pstat=null;
		
		try {
			pstat = conexionBDD.getConexion().prepareStatement("SELECT * FROM ADMINISTRADOR WHERE usuario = ? AND clave=?");
			pstat.setString(1, usuario);
			pstat.setString(2, clave);
			
			rs=pstat.executeQuery();
			
			
			while(rs.next()) {
				admAut=new Administrador();
				admAut.setIdAdministrador(rs.getInt("id_administrador"));
				admAut.setUsuario(rs.getString("usuario"));
				admAut.setClave(rs.getString("clave"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return admAut;
	}
	
	
	
	

	
}



