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
public class GuessANumberController {
	
	private Integer secretNumber;
	private Integer currentNumber;
	private Integer countDown;
	private Integer maxCounter;
	private String outputMessage;	

	public GuessANumberController () {
		secretNumber=(int) (Math.random()*101);
		maxCounter=10;	
		countDown=maxCounter;
	}

	@RequestMapping (value="/", method=RequestMethod.GET)
	public ModelAndView pingpong () {
		Map<String, Integer> data = new HashMap<String, Integer>();
		data.put("currentNumber", 1);
		data.put("countDown", 10);	
		ModelAndView mav = new ModelAndView ("index", "data", data);
		return mav;
	}
	@RequestMapping (value="/", method=RequestMethod.POST)
	public ModelAndView pingpong (	@RequestParam("currentNumber") Integer currentNumber) {		
		System.out.println( countDown);
		if (currentNumber<1 
				||currentNumber>100) {
					outputMessage="Entre un nombre entre 1 et 100 inclus";
				} else {
			countDown--;
			int counter=maxCounter-countDown;
			 if (currentNumber == secretNumber) {
				 outputMessage="Gagné en " + counter + " coup(s)";
			 } else if (currentNumber < secretNumber) {
				 outputMessage="Essaie un nombre plus grand";
			 } else {
				 outputMessage="Essaie un nombre plus petit";
			 }
				}
		System.out.println(outputMessage);
		Map<String, String> data = new HashMap<String, String>();
		data.put("currentNumber", currentNumber.toString());
		data.put("countDown", countDown.toString());
		data.put("outputMessage", outputMessage);
		ModelAndView mav = new ModelAndView ("index", "data", data);
		return mav;
	}


	
}
