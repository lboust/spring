package formation;


import java.util.ArrayList;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class FormationController {
	//instance fields
	ApplicationContext context = null;
	ServiceFormationDAOImpl sfdi = null;
	
	//constructor
	public FormationController () {
		context = new ClassPathXmlApplicationContext("Beans.xml");
		sfdi = (ServiceFormationDAOImpl) context.getBean("sfdi");
		sfdi.setDataDource();
	}
	
	//method GET
	@RequestMapping (value="/", method=RequestMethod.GET)
	public String formationFormIndex (@RequestParam (value="action", required = false) String action) {
		if (action== null)  {
			action = "index";
		}
		System.out.println("action : " + action);
		return action;
	}
	
	//methods POST
	@RequestMapping (value="/creation", method=RequestMethod.POST)
	public void formationFormCreation (@RequestParam("label") String label) {	
			System.out.println("**" + label);
			sfdi.ajouter(new Formation(4,label));
	}

	@RequestMapping (value="/list", method=RequestMethod.POST)
	public ModelAndView formationFormList() {	
		List<String> data = new ArrayList<String>();
		//action = list
		System.out.println(sfdi.lister().isEmpty());
			for (Formation f: sfdi.lister()) {
				System.out.println(f.getInfo());
				data.add(f.getInfo() );
			}
		ModelAndView mav = new ModelAndView ("list", "data", data);
		return mav;
	}


	
}
