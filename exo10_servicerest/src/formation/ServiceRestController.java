package formation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



 
@RestController
public class ServiceRestController {
	private Connection connect = null;
	   private Statement statement = null;
	   private ResultSet resultSet = null;
	   
	    public ServiceRestController ()
	    {
	        try {
	            //Class.forName("com.mysql.cj.jdbc.Driver");
	            //connect = DriverManager.getConnection("jdbc:mysql://localhost/cmpteurdb?"+"user=root&password=");
	           Class.forName("com.mysql.cj.jdbc.Driver");
	            connect = DriverManager.getConnection("jdbc:mysql://localhost/compteurdb?serverTimezone=UTC&user=root&password=rootroot");
	            statement = connect.createStatement();
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	    @CrossOrigin(origins = "*")
	    @RequestMapping(value="/compteurs/{user}",method = RequestMethod.GET,headers="Accept=application/json")
	    public int getcompteur (@PathVariable("user") String user){
	        int compteur=0;
	        // se connecter à la base + extraire le compteur
	        String req = String.format("select user, compteur from compteurs where user='%s'", user);

	        try {
	            resultSet = statement.executeQuery(req);
	            while (resultSet.next())
	            {
	                compteur = resultSet.getInt("compteur");
	            }
	        } catch (SQLException e) {
	                        e.printStackTrace();
	        }
	        return compteur;
	    }
	    @CrossOrigin(origins = "*")
	    @RequestMapping(value="/compteurs",method = RequestMethod.GET,headers="Accept=application/json")
	    public HashMap<String, Integer> getcompteurs (){
	        HashMap<String, Integer> compteurs = new HashMap<>();
	        // se connecter à la base + extraire le compteur
	        String req = "select * from compteurs";
	        try {
	            resultSet = statement.executeQuery(req);
	            while (resultSet.next())
	            {
	                compteurs.put(resultSet.getString("user"), resultSet.getInt("compteur"));
	            }
	        } catch (SQLException e) {
	                        e.printStackTrace();
	        }
	        return compteurs;
	    }
}