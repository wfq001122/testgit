package login;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class filtertest implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse resp=(HttpServletResponse) response;
		Cookie[] Cookies=req.getCookies();
		//System.out.println("jump");
			boolean name=false;
			boolean pass=false;
			if(Cookies!=null){
			for(Cookie c:Cookies){
				if(c.getName().equals("name")){
					if(c.getValue().equals("user")){
						name=true;
					}
				}
			}
			for(Cookie c:Cookies){
				if(c.getName().equals("pass")){
					if(c.getValue().equals("pass")){
						pass=true;
					}
				}
			}
			}
			if(name&&pass){
			  resp.sendRedirect("autosuccess.html");
		    }
			
		      System.out.println("not");
		      chain.doFilter(request, response);
		      //req.getRequestDispatcher("autologin.html").forward(request, response);
			
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
