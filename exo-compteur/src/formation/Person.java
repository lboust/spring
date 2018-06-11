package formation;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	//instance fields

	@Autowired

	private String prenom;

	//constructors
	
	public Person(String prenom) {

		this.prenom=prenom;
	}
	
	public Person() {

	}
		
	//accessors
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	

}
