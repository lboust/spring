package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
/*		Person person1 = (Person) context.getBean("p1");
		System.out.println(person1.getAll());
		Person person2 = (Person) context.getBean("p2");
		System.out.println(person2.getAll());*/
		Person person3 = (Person) context.getBean("p3");
		System.out.println(person3.getAll());
		((ConfigurableApplicationContext)context).close();

	}

}
