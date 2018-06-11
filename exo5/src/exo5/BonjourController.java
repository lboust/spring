package exo5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bonjour")
public class BonjourController {
	
	public BonjourController() {
		System.out.println("Bonjour controller");
	}
		
	@RequestMapping (value="/v1")
	@ResponseBody
	public String ditBonjour() {
		System.out.println("ditBonjour");
		return "Bonjour Lorraine";
	}
	
	@RequestMapping (value="/v2")
	@ResponseBody
	public String ditBonjour(@RequestParam ("aqui") String aqui) {
		System.out.println("ditBonjour");
		return "Bonjour " + aqui;
	}

}
