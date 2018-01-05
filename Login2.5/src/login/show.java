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
public class show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public show() {
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
		PrintWriter pw=new PrintWriter(resp.getOutputStream());
		
		pw.println("用户:"+session.getAttribute("user"));
		pw.println("<br/>");
		//System.out.println(session.getAttribute("buy2"));
		if(session.getAttribute("buy1")!=null){
		     pw.println(session.getAttribute("buy1"));
		     pw.println("<br/>");
		    }
		if(session.getAttribute("buy2")!=null){
			  pw.println(session.getAttribute("buy2"));
			  pw.println("<br/>");
			}
		if(session.getAttribute("buy3")!=null){
			  pw.println(session.getAttribute("buy3"));
			  pw.println("<br/>");
			}
		pw.println("<a href=\"book.html\">返回</a>");
		pw.flush();
		pw.close();
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
