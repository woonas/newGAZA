package kr.gaza.myapp.information;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InformationController {
	@RequestMapping("/JSP/serviceinfo/info_")
	public String info() {
		return "JSP/serviceinfo/info_";
	}
	
	@RequestMapping("/JSP/serviceinfo/businesszone")
	public String businesszone() {
		return "JSP/serviceinfo/info_businesszone";
	}
	
	@RequestMapping("/JSP/serviceinfo/disable_passenger")
	public String disable() {
		return "JSP/serviceinfo/info_disabled_passenger";
	}
	
	@RequestMapping("/JSP/serviceinfo/duo")
	public String duo() {
		return "JSP/serviceinfo/info_duo";
	}
	
	@RequestMapping("/JSP/serviceinfo/economysmartium")
	public String economysamrtium() {
		return "JSP/serviceinfo/info_economysmartium";
	}
	
	@RequestMapping("/JSP/serviceinfo/family_service")
	public String familyservice() {
		return "JSP/serviceinfo/info_family_service";
	}
	
	@RequestMapping("/JSP/serviceinfo/faq")
	public String gazafaq() {
		return "JSP/serviceinfo/info_faq";
	}
	
	@RequestMapping("/JSP/serviceinfo/fare")
	public String fare() {
		return "JSP/serviceinfo/info_fare";
	}
	
	@RequestMapping("/JSP/serviceinfo/frontzone")
	public String frontzone() {
		return "JSP/serviceinfo/info_frontzone";
	}

	@RequestMapping("/JSP/serviceinfo/infant")
	public String infant() {
		return "JSP/serviceinfo/info_infant";
	}
	
	@RequestMapping("/JSP/serviceinfo/legroom")
	public String legroom() {
		return "JSP/serviceinfo/info_legroom";
	}
	
	@RequestMapping("/JSP/serviceinfo/medical")
	public String medical() {
		return "JSP/serviceinfo/info_medical";
	}
	
	@RequestMapping("/JSP/serviceinfo/pregnant")
	public String pregnant() {
		return "JSP/serviceinfo/info_pregnant";
	}
	
	@RequestMapping("/JSP/serviceinfo/requirements")
	public String requirements() {
		return "JSP/serviceinfo/info_requirements";
	}
	
	@RequestMapping("/JSP/serviceinfo/reservation")
	public String reservation() {
		return "JSP/serviceinfo/info_reservation";
	}
	
	@RequestMapping("/JSP/serviceinfo/subNav")
	public String subnav() {
		return "JSP/serviceinfo/info_subNav";
	}
	
	@RequestMapping("/JSP/serviceinfo/upgrade")
	public String gazaupgrade() {
		return "JSP/serviceinfo/info_upgrade";
	}
	
	@RequestMapping("/JSP/serviceinfo/upgradestandby")
	public String upgradestandby() {
		return "JSP/serviceinfo/info_upgradestandby";
	}
	
	@RequestMapping("/JSP/serviceinfo/wifi")
	public String gazawifi() {
		return "JSP/serviceinfo/info_wifi";
	}
	
	@RequestMapping("/JSP/serviceinfo/withpets")
	public String withpets() {
		return "JSP/serviceinfo/info_with_pets";
	}
	
	@RequestMapping("/JSP/serviceinfo/baggage_guide")
	public String baggageguide() {
		return "JSP/serviceinfo/info_baggage_guide";
	}
	
	@RequestMapping("/JSP/serviceinfo/baggage_free")
	public String baggagefree() {
		return "JSP/serviceinfo/info_baggage_free";
	}
}