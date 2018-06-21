package formation;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<Person>{
	  public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Person p = new Person();
		     p.setPrenom(rs.getString("prenom"));
		     return p;
	  }
	  
}
