package com.training.vfislk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		int id=Integer.parseInt(request.getParameter("studentId"));
		String language=request.getParameter("language");
		String hobbies[]=request.getParameterValues("hobby");
		out.print("<html><body>");
		out.print("<strong>Name"+name+"</strong><br>");
		out.print("<strong>City"+city+"</strong><br>");
		out.print("<strong>Language"+language+"</strong><br>");
		out.print("<strong>Id"+id+"</strong><br>");
		/* out.print("<strong>hobby"+hobbies+"</strong><br>"); */
		 Stream.of(hobbies).forEach(out::println); 
		
		
		out.print("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
