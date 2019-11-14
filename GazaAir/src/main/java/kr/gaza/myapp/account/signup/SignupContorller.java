package kr.gaza.myapp.account.signup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupContorller {
	@Autowired
	SqlSession sqlSession;
	//signup1 페이지 이동.
	@RequestMapping("/JSP/account/signup/signup1")
	public String signupView1() {
		return "JSP/account/signup/signup1";
	}
	//signup2 페이지 이동.
	@RequestMapping("/JSP/account/signup/signup2")
	public String signupView2() {
		return "JSP/account/signup/signup2";
	}
	//signup3 페이지 이동.
	@RequestMapping(value="/JSP/account/signup/signup3", method=RequestMethod.POST)
	public String signupView3(@RequestParam("agree_personalCollectionOption") String agree1, 
			@RequestParam("agree_personalProvide") String agree2, HttpServletRequest req) {
			HttpSession sess = req.getSession();
			sess.setAttribute("agree_personalCollectionOption", agree1);
			sess.setAttribute("agree_personalProvide", agree2);
		return "JSP/account/signup/signup3";
	}
	//signup4 페이지 이동.
	@RequestMapping("/JSP/account/signup/signup4")
	public String signupView4() {
		return "JSP/account/signup/signup4";
	}
}
