package hello;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FormationMapper implements RowMapper<Formation>{
	  public Formation mapRow(ResultSet rs, int rowNum) throws SQLException {
		     Formation f = new Formation();
		     f.setId(rs.getInt("id"));
		     f.setLabel(rs.getString("label"));
		     return f;
	  }
	  
}
