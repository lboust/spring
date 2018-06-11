package exo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BonjourController {
		
	@RequestMapping(value="/Bonjour", method=RequestMethod.GET)
	@ResponseBody
	public String ditBonjour(@RequestBody String aqui) {
		return "Bonjour " + aqui;
	}

}
