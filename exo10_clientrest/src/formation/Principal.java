package formation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class Principal {

	public static void main(String[] args) {
		
	     final String uri = "http://localhost:8080/exo10_servicerest/datajson2/{item}";	     
	     RestTemplate restTemplate = new RestTemplate();
	     Map<String, String> params = new HashMap<String, String>();
	     params.put("item", "NOUVEAU");
	     /*
	     HttpHeaders headers = new HttpHeaders();
	     headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	     HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class, params);
	     */
	     String result = restTemplate.getForObject(uri, String.class, params);
	     
	     System.out.println(result);
	}
}
