package by.htp.citygame.dao;

import java.util.List;
import java.util.Map;

public interface CityDao {
	
	Map < String, List<String> > getCityName ();
	String [] getArrayCities ();
	
}
