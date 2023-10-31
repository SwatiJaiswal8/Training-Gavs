package java1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Cookie;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//using url method
		/*PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h2 > WELCOME TO HOME PAGE</h2>");
		String user = request.getParameter("username");
		out.println("currently loged in user "+user);*/
		//using cookies
		PrintWriter out=response.getWriter();
		String user=null;
		response.setContentType("text/html");
		out.println("<h2>Home Page</h2><br/>");
		Cookie[] cookies=request.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("user"))
				user=c.getValue();
		}
		
		out.println("currently logged in user " +user);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
