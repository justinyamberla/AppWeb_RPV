package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.VehiculoDAO;
import modelo.entidades.Vehiculo;

/**
 * Servlet implementation class ListarVehiculoController
 */
@WebServlet("/ListarVehiculoController")
public class ListarVehiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListarVehiculoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VehiculoDAO vehiculoDAO = new VehiculoDAO();
		List<Vehiculo> vehiculos = vehiculoDAO.getVehiculos();
		request.setAttribute("vehiculos", vehiculos);
		getServletContext().getRequestDispatcher("/jsp/listarVehiculo.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
