package kr.gaza.myapp.account.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.gaza.myapp.account.member.MemberInterface;
import kr.gaza.myapp.account.member.MemberVO;

@Controller
public class LoginController {
	@Autowired
	SqlSession sqlSession;
	//�α��� �������� �̵�.
	@RequestMapping("/JSP/account/login/loginView")
	public String loginView() {
		
		return "JSP/account/login/login";
	}
	//�α��� Ȯ��
	@RequestMapping(value="/JSP/account/login/loginOk", method=RequestMethod.POST)
	public ModelAndView loginOk(MemberVO vo1, HttpServletRequest req) {
		MemberInterface dao = sqlSession.getMapper(MemberInterface.class);
		MemberVO vo = dao.login(vo1);
		
		ModelAndView mav = new ModelAndView();
		boolean status = false;
		if (vo != null) {
	       	status = true;
	    	HttpSession ses = req.getSession();
	        ses.setAttribute("memberNum", vo.getMemberNum());
	        ses.setAttribute("memberId", vo.getMemberId());
	        ses.setAttribute("memberName", vo.getMemberNameKor());
	        
	    }
	    req.setAttribute("status", status);
		mav.setViewName("JSP/account/login/loginOk");
	    
	    return mav;
	}
	//�α׾ƿ�
	@RequestMapping("/JSP/account/login/logout")
	public String logOut() {
		return "JSP/account/login/logout";
	}
}
