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

import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class ListarMultasController
 */
@WebServlet("/ListarMultasController")
public class ListarMultasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarMultasController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/jsp/listarMultas.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dato = request.getParameter("rbtnDato");
		String txtDato = request.getParameter("txtDato");
		
		MultaDAO multaDAO = new MultaDAO();
		VehiculoDAO vehiculoDAO = new VehiculoDAO();
		
		Vehiculo v= new Vehiculo();
		List<Multa> multas= new ArrayList<Multa>();
		if(dato.equals("Placa")) {
			v=vehiculoDAO.getVehiculoPlaca(txtDato);
			multas=multaDAO.getMultasPlaca(txtDato);
		} else {
			v=vehiculoDAO.getVehiculoChasis(txtDato);
			multas=multaDAO.getMultasChasis(txtDato);
		}
		
		if (v!=null) {
			request.setAttribute("vehiculo", v);
			request.setAttribute("multas", multas);
			getServletContext().getRequestDispatcher("/jsp/listarMultas.jsp").forward(request, response);
		} else {
			response.sendRedirect("index.html");
		}
		
	}

}
