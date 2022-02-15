package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dao.AdministradorDAO;
import modelo.entidades.Administrador;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginController() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/jsp/inicio.jsp").forward(request,response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("txtUsuario");
		String clave = request.getParameter("txtClave");
		
		
		AdministradorDAO adminDAO = new AdministradorDAO();
		Administrador adminAut= adminDAO.autenticar(usuario,clave);
		
		if (adminAut!= null) {
			HttpSession miSesion = request.getSession();
			miSesion.setAttribute("usuario", adminAut);
			request.getRequestDispatcher("ListarVehiculoController").forward(request, response);
		}else{
			response.sendRedirect("index.html");
		}
	}

}
