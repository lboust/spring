package formation;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ServicePersonDAOImpl implements ServiceDAO<Person>{

	JdbcTemplate jt;
	
	@Autowired
	DataSource ds;
	
	@Override
	public void setDataDource(DataSource ds) {
		this.ds = ds;
		this.jt= new JdbcTemplate(ds);	
	}

	@Override
	public void setDataDource() {
		this.jt= new JdbcTemplate(ds);	
	}

	@Override
	//nouvelle personne
	public void ajouter(Person p) {
		String SQL = "insert into table ( prenom, valeur) values (?, ? )";
		jt.update(SQL, p.getPrenom(), 0 );
	}

	@Override
	public List<Person> lister() {
		String SQL = "select * from table";
		List <Person> fs = jt.query(SQL, new PersonMapper());
		return fs;
	}

	@Override
	public void modifier(Person p) {
		String SQL = "update table set label = ? where prenom = ?";
		jt.update(SQL, p.getPrenom(), p.getPrenom());		
	}

	@Override
	public void supprimer(Person p) {
		String SQL = "delete table set prenom = ? where prenom = ?";
		jt.update(SQL, p.getPrenom());	
		
	}

	@Override
	public Person trouver(String prenom) {
		String SQL = "select * from formation where prenom=?";
		Person p = jt.queryForObject(SQL, new Object[] {prenom}, new PersonMapper());
		return p;
	}
}
