package kr.gaza.myapp.information;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InformationController {
	@RequestMapping("/JSP/serviceinfo/info_")
	public String info() {
		return "JSP/serviceinfo";
	}
}
