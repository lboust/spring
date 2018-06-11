package exo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BonjourController {
	
	public BonjourController() {
		System.out.println("Bonjour controller");
	}
		
	@RequestMapping (value="/index")
	@ResponseBody
	public String ditBonjour() {
		System.out.println("ditBonjour");
		return "Bonjour ";
	}

}
