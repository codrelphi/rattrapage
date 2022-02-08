package fr.farid.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AffichageDeNom
 */
@WebServlet("/AffichageDeNom")
public class AffichageDeNom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AffichageDeNom() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//this.getServletContext().getRequestDispatcher("/WEB-INF/affichageDeNom.jsp").forward(request, response);

		/*if(request.getParameter("nom") != null) {
			String nom = request.getParameter("nom");
			request.setAttribute("resultat", nom);
			request.getRequestDispatcher("/WEB-INF/affichageDeNom.jsp").forward(request, response);
			
		}*/
		request.getRequestDispatcher("/WEB-INF/affichageDeNom.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		
		request.setAttribute("resultat", nom);
		
		request.getRequestDispatcher("/WEB-INF/affichageDeNom.jsp").forward(request, response);
		
	}

}
