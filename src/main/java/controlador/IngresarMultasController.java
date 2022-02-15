package controlador;

import java.io.IOException;
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
 * Servlet implementation class IngresarMultasController
 */
@WebServlet("/IngresarMultasController")
public class IngresarMultasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarMultasController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String placa = request.getParameter("txtPlaca");
		request.setAttribute("placa", placa);
		getServletContext().getRequestDispatcher("/jsp/registrarMulta.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String placa = request.getParameter("txtPlaca");
		String valor = request.getParameter("txtValor");
		String año = request.getParameter("txtAño");
		String descripcion = request.getParameter("txtDescripcion");

		MultaDAO multaDAO = new MultaDAO();
		
		Multa m = new Multa(placa, Integer.parseInt(valor), Integer.parseInt(año) , descripcion);
		
		multaDAO.ingresar(m);
		
		response.sendRedirect("ListarMultasAdminController?Placa="+placa);
	}

}
