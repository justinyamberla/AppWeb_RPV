package modelo.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.conexion.conexionBDD;
import modelo.entidades.Multa;

public class MultaDAO {
	
	private static final String SQL_SELECT_PLACA = "SELECT * FROM MULTA WHERE Placa = ?";
	private static final String SQL_SELECT_CHASIS = "SELECT MULTA.* FROM MULTA LEFT JOIN VEH�CULO ON MULTA.Placa=VEH�CULO.Placa WHERE VEH�CULO.Chasis =?";
	private static final String SQL_INSERT = "INSERT INTO MULTA (Placa,Valor,A�oM,Descripci�n) VALUES (?,?,?,?)";

	
	public List<Multa> getMultasPlaca(String placa) {
		
		List<Multa> multas= new ArrayList<Multa>();
		try {
			ResultSet rs = null;
			PreparedStatement pstat = null;
			
			pstat=conexionBDD.getConexion().prepareStatement(SQL_SELECT_PLACA);
			pstat.setString(1, placa);
			
			rs=pstat.executeQuery();
			
			while(rs.next()) {
				Multa m = new Multa(rs.getString("Placa"),rs.getFloat("Valor"),rs.getInt("A�oM"),rs.getString("Descripci�n"));
				multas.add(m);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return multas;
	}
	
	public List<Multa> getMultasChasis(String chasis) {
		List<Multa> multas= new ArrayList<Multa>();
		try {
			ResultSet rs = null;
			PreparedStatement pstat = null;
			
			pstat=conexionBDD.getConexion().prepareStatement(SQL_SELECT_CHASIS);
			pstat.setString(1, chasis);
			
			rs=pstat.executeQuery();
			
			while(rs.next()) {
				Multa m = new Multa(rs.getString("Placa"),rs.getFloat("Valor"),rs.getInt("A�oM"),rs.getString("Descripci�n"));
				multas.add(m);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return multas;
	}
	
	public void ingresar(Multa m) {
		try {
			PreparedStatement pstat = null;
			pstat=conexionBDD.getConexion().prepareStatement(SQL_INSERT);
			pstat.setString(1, m.getPlaca());
			pstat.setFloat(2, m.getValor());
			pstat.setInt(3, m.getA�o());
			pstat.setString(4, m.getDescripcion());

			int fila=pstat.executeUpdate();
			System.out.println("Numero de filas adectadas:"+fila);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	


}
