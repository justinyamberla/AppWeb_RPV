package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.MultaDAO;
import modelo.dao.VehiculoDAO;
import modelo.entidades.Multa;
import modelo.entidades.Vehiculo;

/**
 * Servlet implementation class ListarMultasAdminController
 */
@WebServlet("/ListarMultasAdminController")
public class ListarMultasAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarMultasAdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String placa = request.getParameter("Placa");
		request.setAttribute("placa", placa);
		
		MultaDAO multaDAO = new MultaDAO();
		VehiculoDAO vehiculoDAO = new VehiculoDAO();
		
		Vehiculo v= new Vehiculo();
		List<Multa> multas= new ArrayList<Multa>();
		v=vehiculoDAO.getVehiculoPlaca(placa);
		multas=multaDAO.getMultasPlaca(placa);
		
		
		if (v!=null) {
			request.setAttribute("vehiculo", v);
			request.setAttribute("multas", multas);
			getServletContext().getRequestDispatcher("/jsp/listarMultaAdmin.jsp").forward(request, response);
		} else {
			response.sendRedirect("ListarVehiculosController");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
