package com.violentstone.servlet.UserServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import com.violentstone.Util.format;
import com.violentstone.entity.user.User;
import com.violentstone.service.UserService.UserService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		
		String order = request.getParameter("order");
		
		System.out.println(order);
		
		if(!format.checkNull(order)){
			
			UserService  US = new UserService();
			
			User user = US.LoginService(order);
			
			JSONObject js = JSONObject.fromObject(user);
			
			pw.print(js.toString());
			
			pw.close();
			
		}else{
			
			pw.print("wrong action");
			
			pw.close();
			
		}
		
	}

}
