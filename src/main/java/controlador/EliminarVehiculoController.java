package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.VehiculoDAO;

/**
 * Servlet implementation class EliminarVehiculoController
 */
@WebServlet("/EliminarVehiculoController")
public class EliminarVehiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarVehiculoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String placa = request.getParameter("Placa");
		request.setAttribute("placa", placa);
		getServletContext().getRequestDispatcher("/jsp/eliminarVehiculo.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String desicion = request.getParameter("rbtnDesicion");
		
		String placa= request.getParameter("txtPlaca");
		if (desicion.equals("Si")) {
			System.out.println(desicion);
			VehiculoDAO vehiculoDAO = new VehiculoDAO();
			vehiculoDAO.eliminar(placa);
		}
		response.sendRedirect("ListarVehiculoController");
	}

}
