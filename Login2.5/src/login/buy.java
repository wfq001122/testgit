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
public class buy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buy() {
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
		HttpSession session=req.getSession();
		String buy1=req.getParameter("buy1");
		String buy2=req.getParameter("buy2");
		String buy3=req.getParameter("buy3");
		if(buy1!=null){
			session.setAttribute("buy1", "软件工程");
		}
		else if(buy2!=null){
			session.setAttribute("buy2", "操作系统");
		}
		else if(buy3!=null){
			session.setAttribute("buy3", "数据库原理");
		}
		req.getRequestDispatcher("success.html").forward(req, resp);

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
