package kr.gaza.myapp.mypage;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyHomeController {
	@Autowired
	SqlSession sqlSession;
	@RequestMapping(value="/JSP/mypage/myhome",method=RequestMethod.GET)
	public ModelAndView myHome() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("JSP/mypage/myhome");
		return mav;
	}
}
