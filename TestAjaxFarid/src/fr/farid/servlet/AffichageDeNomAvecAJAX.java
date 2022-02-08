package fr.farid.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AffichageDeNom
 */
@WebServlet("/AffichageDeNomAvecAJAX")
public class AffichageDeNomAvecAJAX extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AffichageDeNomAvecAJAX() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/affichageDeNomAvecAJAX.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		String nom = request.getParameter("nom");
		
		PrintWriter out = response.getWriter();
		out.println("Votre nom: " + nom);
		
		
	}

}
