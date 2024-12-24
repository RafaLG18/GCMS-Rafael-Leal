package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, everybody!";
	}
	
	@RequestMapping("/rafael")
	public @ResponseBody String greetingRafael() {
	return "Hello, rafael leal guimaraes!";
	}

	@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {
	return "Hello, hotfix!";
	}
}
