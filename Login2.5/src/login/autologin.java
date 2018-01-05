package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class test
 */
public class autologin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public autologin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		Cookie c1;
		Cookie c2;
		
		String name=req.getParameter("name");
		String pass=req.getParameter("password");
		String checkbox=req.getParameter("auto");
		//System.out.println(checkbox==null);
		if(name.equals("user") && (pass.equals("pass"))){
			
			if(checkbox!=null){
				c1=new Cookie("name","user");
				c2=new Cookie("pass","pass");
				//c1.setMaxAge(60*60*24);
				//c2.setMaxAge(60*60*24);
				resp.addCookie(c1);
				resp.addCookie(c2);
			}
			
		
			resp.sendRedirect("autosuccess.html");
		}
		else{
			
			PrintWriter pw=new PrintWriter(resp.getWriter());
			pw.println("登录失败");
			pw.println("<br/>");
			pw.println("<a href=\"autologin.html\">返回</a>");
			pw.flush();
			pw.close();
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
