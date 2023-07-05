package HandleRequests;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class HandleRegisterAction extends HttpServlet{
	public void doPost(HttpServletRequest req ,HttpServletResponse res ) {
		System.out.println("i am the register servlet");
	}
}
