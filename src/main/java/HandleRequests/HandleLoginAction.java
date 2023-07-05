package HandleRequests;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class HandleLoginAction extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req , HttpServletResponse res ) {
		System.out.println(" i am the login handler");
		String name = req.getParameter("userEmail");
		String password = req.getParameter("userPass");
		
		System.out.println(name+ " " + password);
	}
}
