package modelo.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.conexion.conexionBDD;
import modelo.entidades.Vehiculo;

public class VehiculoDAO {
	
	private static final String SQL_SELECT = "SELECT * FROM VEHÍCULO";
	private static final String SQL_SELECT_PLACA = "SELECT * FROM VEHÍCULO WHERE Placa = ?";
	private static final String SQL_SELECT_CHASIS = "SELECT * FROM VEHÍCULO WHERE Chasis = ?";
	private static final String SQL_INSERT = "INSERT INTO VEHÍCULO (Placa,Marca,Año,Modelo,Chasis,Propietario) VALUES (?,?,?,?,?,?)";
	private static final String SQL_UPDATE = "UPDATE VEHÍCULO SET Marca=? , Año=? , Modelo=? , Chasis=? , Propietario=? WHERE Placa = ?";
	private static final String SQL_DELETE = "DELETE FROM VEHÍCULO WHERE Placa = ?";
	
	
	public List<Vehiculo> getVehiculos() {
		List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
		try {
			ResultSet rs = null;
			PreparedStatement pstat = null;
			
			pstat=conexionBDD.getConexion().prepareStatement(SQL_SELECT);
			
			rs=pstat.executeQuery();
			
			while(rs.next()) {
				Vehiculo v = new Vehiculo(rs.getString("Placa"),rs.getString("Marca"),rs.getInt("Año"),rs.getString("Modelo"),rs.getString("Chasis"),rs.getString("Propietario"));
				vehiculos.add(v);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vehiculos;
	}
	
	public Vehiculo getVehiculoPlaca(String placa) {
		
		Vehiculo v = null;
		
		try {
			ResultSet rs = null;
			PreparedStatement pstat = null;
			pstat= conexionBDD.getConexion().prepareStatement(SQL_SELECT_PLACA);
			pstat.setString(1, placa);
			
			rs = pstat.executeQuery();
			
			
			while(rs.next()) {
				v=new Vehiculo(rs.getString("Placa"),rs.getString("Marca"),rs.getInt("Año"),rs.getString("Modelo"),rs.getString("Chasis"),rs.getString("Propietario"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return v;	
	}
	
	public Vehiculo getVehiculoChasis(String chasis) {
		
		Vehiculo v = null;
		
		try {
			ResultSet rs = null;
			PreparedStatement pstat = null;
			pstat= conexionBDD.getConexion().prepareStatement(SQL_SELECT_CHASIS);
			pstat.setString(1, chasis);
			
			rs = pstat.executeQuery();
			
			while(rs.next()) {
				v=new Vehiculo(rs.getString("Placa"),rs.getString("Marca"),rs.getInt("Año"),rs.getString("Modelo"),rs.getString("Chasis"),rs.getString("Propietario"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return v;	
	}
	
	public void insertar(Vehiculo v) {
		try {
			PreparedStatement pstat = null;
			pstat=conexionBDD.getConexion().prepareStatement(SQL_INSERT);
			pstat.setString(1, v.getPlaca());
			pstat.setString(2, v.getMarca());
			pstat.setInt(3, v.getAño());
			pstat.setString(4, v.getModelo());
			pstat.setString(5, v.getChasis());
			pstat.setString(6, v.getPropietario());
			
			int fila=pstat.executeUpdate();
			System.out.println("Numero de fialas adectadas:"+fila);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void actualizar(Vehiculo v) {
		try {
			PreparedStatement pstat = null;
			pstat=conexionBDD.getConexion().prepareStatement(SQL_UPDATE);
			
			pstat.setString(1, v.getMarca());
			pstat.setInt(2, v.getAño());
			pstat.setString(3, v.getModelo());
			pstat.setString(4, v.getChasis());
			pstat.setString(5, v.getPropietario());
			pstat.setString(6, v.getPlaca());
			
			int fila=pstat.executeUpdate();
			System.out.println("Numero de filas adectadas:"+fila);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void eliminar (String Placa) {
		try {
			PreparedStatement pstat = null;
			pstat=conexionBDD.getConexion().prepareStatement(SQL_DELETE);
			pstat.setString(1, Placa);
			int fila=pstat.executeUpdate();
			System.out.println("Numero de filas adectadas:"+fila);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}



}
