package servlets;

import java.io.IOException;

import es.cursojava.hibernate.ejercicio1.dto.AlumnoDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EjercicioFormularioAlumno")
public class EjercicioFormularioAlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Recoger parámetros del formulario
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String edad = request.getParameter("edad");
		String email = request.getParameter("email");
		
		// Crear objeto AlumnoDTO
				
		AlumnoDTO alumno = new AlumnoDTO();
		alumno.setNombre(nombre + " " + apellidos);
		alumno.setEdad(Integer.parseInt(edad));
		alumno.setEmail(email);
		

		
				
		
		// Respuesta simple en pantalla
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("<h2>Alumno registrado correctamente</h2>");
		response.getWriter().println("<p>Nombre: " + nombre + "</p>");
		response.getWriter().println("<p>Apellidos: " + apellidos + "</p>");
		response.getWriter().println("<p>Edad: " + edad + "</p>");
		response.getWriter().println("<p>Email: " + email + "</p>");
		
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("<h2>Alumno registrado correctamente</h2>");
	}
}
