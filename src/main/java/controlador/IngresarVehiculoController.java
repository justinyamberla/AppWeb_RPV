package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.VehiculoDAO;
import modelo.entidades.Vehiculo;

/**
 * Servlet implementation class IngresarVehiculoController
 */
@WebServlet("/IngresarVehiculoController")
public class IngresarVehiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarVehiculoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/jsp/registrarVehiculo.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String placa = request.getParameter("txtPlaca");
		String marca = request.getParameter("txtMarca");
		String año = request.getParameter("txtAño");
		String modelo = request.getParameter("txtModelo");
		String chasis = request.getParameter("txtChasis");
		String propietario = request.getParameter("txtPropietario");
		
		VehiculoDAO vehiculoDAO = new VehiculoDAO();
		
		Vehiculo v = new Vehiculo(placa, marca, Integer.parseInt(año) , modelo, chasis, propietario);
		
		vehiculoDAO.insertar(v);
		
		response.sendRedirect("ListarVehiculoController");
		
		
	}

}
