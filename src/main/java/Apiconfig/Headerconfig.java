package Apiconfig;

import java.util.HashMap;
import java.util.Map;

public class Headerconfig {
	public Map<String,String> defaultHeaders(){
	Map<String,String> defaultHeaders= new HashMap<String ,String>();
	defaultHeaders.put("Content-Type", "application/json");
	
	return defaultHeaders;
	

}
}
