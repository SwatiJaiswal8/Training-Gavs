package java1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// using url method
		/*String username = request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if(username.equals("tester")&&password.equals("tester")) {
			out.println("WELCOME tester" );
			out.println("<a href ='/SessionDemo/HomeServlet?username="+username+"'>click to move on homepage</a>");
		}*/
		//using cookies method
		String user=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		if(user.equals("tester") && password.equals("tester")) {
			out.println("Welcome " + user);
			Cookie cookie=new Cookie("user", user);
			response.addCookie(cookie);
			out.println("<a href='/SessionDemo/Home.html'>Click to home page</a>");
		}
	}

}
