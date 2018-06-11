package hello;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ServiceFormationDAOImpl implements ServiceDAO<Formation>{

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
	public void ajouter(Formation f) {
		String SQL = "insert into formation (id, label) values (?, ? )";
		jt.update(SQL, f.getId(), f.getLabel());
		
	}

	@Override
	public List<Formation> lister() {
		String SQL = "select * from formation";
		List <Formation> fs = jt.query(SQL, new FormationMapper());
		return fs;
	}

	@Override
	public Formation trouver(int id) {
		String SQL = "select * from formation where id=?";
		Formation f = jt.queryForObject(SQL, new Object[] {id}, new FormationMapper());
		return f;
	}

	@Override
	public void modifier(Formation f) {
		String SQL = "update formation set label = ? where id = ?";
		jt.update(SQL, f.getLabel(), f.getId());		
	}

	@Override
	public void supprimer(Formation f) {
		String SQL = "delete formation set label = ? where id = ?";
		jt.update(SQL, f.getId());	
		
	}

}
