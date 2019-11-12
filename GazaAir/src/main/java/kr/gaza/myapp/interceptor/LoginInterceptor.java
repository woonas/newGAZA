package kr.gaza.myapp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession sess = request.getSession();
		String memberName = (String)sess.getAttribute("memberName");
		
		if(memberName==null || memberName.equals("")) {
			response.sendRedirect("/myapp/account/login/loginForm");
			return false;
		}
		return true;
	}
	
}
