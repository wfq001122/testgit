package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class test
 */
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
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
		
		String name=req.getParameter("name");
		String pass=req.getParameter("password");
		if(name.equals("user") && (pass.equals("pass"))){
			HttpSession session=req.getSession();
			session.setAttribute("user", req.getParameter("name"));
			session.setAttribute("pass", req.getParameter("password"));
			
			
			req.getRequestDispatcher("book.html").forward(req, resp);
		}
		else{
			
			PrintWriter pw=new PrintWriter(resp.getWriter());
			pw.println("登录失败");
			pw.println("<br/>");
			pw.println("<a href=\"login.html\">返回</a>");
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
