package formation;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PingpongController {
	

	public PingpongController () {

	}

	@RequestMapping (value="/", method=RequestMethod.GET)
	public ModelAndView pingpong () {
		Map<String, String> data = new HashMap<String, String>();
		data.put("le", "");
		data.put("re", "");	
		ModelAndView mav = new ModelAndView ("index");
		return mav;
	}
	@RequestMapping (value="/", method=RequestMethod.POST)
	public ModelAndView pingpong (	@RequestParam("le") String le,
	@RequestParam("re") String re, @RequestParam("action") String action) {
		System.out.println("le = " + le);
		System.out.println("re = " + re);
		System.out.println("action = " + action);
		Map<String, String> data = new HashMap<String, String>();
		data.put("le", re);
		data.put("re", le);	
		ModelAndView mav = new ModelAndView ("index", "data", data);
		return mav;
	}


	
}
