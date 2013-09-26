package examen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class examenServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FizzBuzz fb = new FizzBuzz();
		String hasta = request.getParameter("hasta");
		response.getWriter().println(fb.imprimir(Integer.parseInt(hasta)));
		//response.getWriter().println("Se recibio el parametro: " + hasta);
	}
}
