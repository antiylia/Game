package by.htp.citygame.domain.entity;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CityNames {		
	
	private Map < String, List<String> > cityName = new HashMap<String, List <String>> ();
	
	public Map<String, List<String>> getCityName() {
		return cityName;
	}

	public void setCityName(Map<String, List<String>> cityName) {
		this.cityName = cityName;
	}	 		 	
		
}	