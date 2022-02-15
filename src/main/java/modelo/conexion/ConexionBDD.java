package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexionBDD {

	private static conexionBDD conexionClass = null;

	private static Connection instancia = null;

	private conexionBDD() {
		try {
			if (instancia == null) {
				String servidor = "localhost";
				String database = "rpv2";
				String usuario = "root";
				String clave = "";

				String url = "jdbc:mysql://" + servidor + "/" + database;

				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				instancia=DriverManager.getConnection(url,usuario,clave);
				System.out.println("Conexion Realizada");
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	public static Connection getConexion() {
		if (instancia == null) {
			conexionClass = new conexionBDD();
		}

		return instancia;
	}
	
	public static void cerrar(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs=null;
	}
	
	public static void cerrar(PreparedStatement pstat) {
		try {
			pstat.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pstat=null;
	}
}
