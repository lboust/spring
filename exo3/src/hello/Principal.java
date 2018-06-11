package hello;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//DataSource ds = (DataSource) context.getBean("ds");
		ServiceFormationDAOImpl sfdi = (ServiceFormationDAOImpl) context.getBean("sfdi");
		sfdi.setDataDource();
/*		sfdi.ajouter(new Formation(1, "Programmation Java"));
		sfdi.ajouter(new Formation(2, "Framework Spring"));*/
		for (Formation f: sfdi.lister()) {
			System.out.println(f.getInfo());
		}
	}

}
