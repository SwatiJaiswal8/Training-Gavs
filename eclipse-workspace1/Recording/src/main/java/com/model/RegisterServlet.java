package com.model;
 
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
/**
* Servlet implementation class RegisterServlet
*/
@WebServlet("/RegisterServlet")
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		String email =request.getParameter("email");
		Register obj = new Register(username,password,email);
		HttpSession session =request.getSession();
		session.setAttribute("user", username);
		
		
		if(session.getAttribute("users")==null) {
			HashMap<String,Register> users = new HashMap<String,Register>();
			users.put(username, obj);
			ArrayList<Product>products=new ArrayList<Product>();
			products.add(new Product(1,"toy",500));
			products.add(new Product(2,"book",1500));
			products.add(new Product(3,"shirt",500));
			products.add(new Product(4,"pen",750));
			
			
			session.setAttribute("products",products);
		}
		else {
			
			@SuppressWarnings("unchecked")
			HashMap<String,Register> users =(HashMap<String,Register>)session.getAttribute("users");
			users.put(username, obj);
		}
		response.sendRedirect("productlist.jsp");
 
 
	}
 
}