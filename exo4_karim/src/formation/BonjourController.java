package formation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

@Controller
@RequestMapping("/bonjour")
public class BonjourController {
	
	
	public BonjourController ()
	{
		System.out.println("BonjourControler");
	}

	@RequestMapping (value="/v1")
	@ResponseBody
	public String ditBonjour ()
	{
		System.out.println("ditBonjour");
		return "Bonjour a karim";
	}

	@RequestMapping (value="/v2")
	@ResponseBody
	public String ditBonjour2(@RequestParam ("aqui") String aqui)
	{
		System.out.println("ditBonjour");
		return "v2 : Bonjour a " + aqui ;
	}
	
	@RequestMapping (value="/v3/{aqui}")
	@ResponseBody
	public String ditBonjour3(@PathVariable("aqui") String aqui)
	{
		System.out.println("ditBonjour");
		return "v3 : Bonjour a " + aqui ;
	}
	@RequestMapping (value="/v4")
	@ResponseBody
	public String ditBonjour4(HttpServletRequest request)
	{
		System.out.println("ditBonjour");
		return "v4 : Bonjour a " + request.getParameter("aqui") ;
	}
	
}
