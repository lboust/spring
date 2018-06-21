package formation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		int compteur = 0;
		//instance fields
		ApplicationContext context = null;
		ServicePersonDAOImpl sfdi = null;
		context = new ClassPathXmlApplicationContext("Beans.xml");
		sfdi = (ServicePersonDAOImpl) context.getBean("sfdi");
		sfdi.setDataDource();
		sfdi.ajouter(new Person("toto"));
		
		
		for(;;) {
			if (compteur==1000) {
				compteur=0;
			} else {
				compteur++;

			}
			System.out.println(compteur);
		}

	}

}
