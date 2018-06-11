package formation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/")
public class BonjourController {
	
	
	public BonjourController ()
	{
		System.out.println("BonjourControler");
	}

	@RequestMapping (value="/index")
	@ResponseBody
	public String ditBonjour ()
	{
		System.out.println("ditBonjour");
		return "Bonjour a  Karim";
	}
	
}
