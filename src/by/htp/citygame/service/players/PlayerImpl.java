package by.htp.citygame.service.players;

import java.util.List;
import java.util.Random;

import by.htp.citygame.dao.CityDao;
import by.htp.citygame.dao.CityDaoImpl;
import by.htp.citygame.domain.entity.CityNames;

public class PlayerImpl implements Player {
	
 	private CityDao cities;
	private CityNames cityNamesMap; 
	
	 {
	  cities = new CityDaoImpl();
	  cityNamesMap = new CityNames();
	  cityNamesMap.setCityName(cities.getCityName());
	  }
	 
	/**
	 Method returns city, randomly selected	from array with cities
	 */
    public String startGame() {
    	String firstCity = "";
    	int cityIndex = -1;
    	Random r = new Random();
    	do {
    		cityIndex  = r.nextInt();
    	} while (cityIndex >= cities.getArrayCities().length || cityIndex < 0);
    	    	
    	firstCity = cities.getArrayCities()[cityIndex];   
    	return firstCity;
	 }

	/**
	 Method returns city, randomly selected	from list of cities, which begin with letter,
	 the parameter (city) ends
	 If player don't know answer, it is returned response "I don't remember such city"
	 */	
    public String giveResponse (String previousCity) {
    	String response = "I don't remember such city";
		String letter = getLastLetter(previousCity);
    	if (ifPlayerKnowCity()) {
	//	if (true) {
			List<String> listCities = cities.getCityName().get(letter);			
			Random r = new Random();
			int i =-1;
			do {
			  i  = r.nextInt(100_000_000);
			} while (i>= listCities.size() || i<0);
			response = listCities.get(i);
		}
		return response;		
	}
    
    /**
	 Utility method, which returns last letter of the specified city
	 */	
	private String getLastLetter (String previousCity) {
		String letter = previousCity.substring(previousCity.length()-1, previousCity.length());
		return letter.toUpperCase();
	}
	
	/**
	 Utility method, which randomly returns true/false 
	 */	
	private boolean ifPlayerKnowCity () {
		Random r = new Random();
		int i = r.nextInt(10);
		if (i > 8) {
			return false;
		}		
		return true;
	}
	
	
}
