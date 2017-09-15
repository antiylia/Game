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






















/*
// это перекочует в  XML   !!!!!!
	private String city [] = { "Abu Dhabi", "Abuja", "Addis_Ababa", "Andorra_la_Vella", "Antananarivo",
	"Beirut", "Belgrade", "Belmopan", "Belfast", "Berlin", "Bern",
	"Cairo", "Canberra", "Caracas",
	"Dakar", "Damascus", "Dhaka",
	"Edinburgh",
	"Freetown", "Frankfurt",
	"Georgetown", "Guatemala",
	"Hanoi", "Havana", "Helsinki",
	"Islamabad", "Istanbul",
	"Jakarta",
	"Kingston", "Kiev",
	"Luxembourg", "London","Lisbon",
	"Manila", "Mexico", "Minsk", "Moscow",
	"New_Delhi", "New_York", "Nagasaki",
	"Oslo", "Ottawa",
	"Paris", "Prague",
	"Quito",
	"Rome",
	"Santiago", "Sofia", "Stockholm",
	"Tallinn", "Tbilisi", "Tegucigalpa",
	"Ulaanbaatar",
	"Vienna", "Vilnius", "Valletta",
	"Warsaw", "Wellington", "Washington",
	"Yerevan", "Yamoussoukro",
	"Zagreb"};
*/




	/* частная собственность слоя DAO 
	public void initCityName () {	
		for (int q = 0; q < city.length; q++) {
			String letter = city[q].substring(0, 1);
			String cities[] = getCityByLetter(letter);
			cityName.put(letter, Arrays.asList(cities));
		  }				
	  }
	
	private String[] getCityByLetter (String letter) {
		int nessesarySize = 0;
		int i, y;
		for (i=0; i < city.length; i++) {
			String letterCity = city[i].substring(0, 1);
			if (letterCity.equalsIgnoreCase(letter)) {
				nessesarySize++;
			}
		}
	   String [] cities = new String [nessesarySize];
	   for (i=0, y=0; i< city.length & y<cities.length; i++) {
		   
			String letterCity = city[i].substring(0, 1);
			if (letterCity.equalsIgnoreCase(letter)) {
				cities[y]=city[i];
				y++;
			}
		}	   
	   return cities;
	}
	*/
	
  
	/*
	

personMap.put(new Person("Иван"), Arrays.asList(new Cat("Барсик"), new Cat("Мурзик")));
personMap.put(new Person("Маша"), Arrays.asList(new Cat("Васька"), new Dog("Бобик")));
personMap.put(new Person("Ирина"), Arrays.asList(new Cat("Рыжик"), new Dog("Шарик"), new Parrot("Гоша")));

System.out.println("personMap: " + personMap);
System.out.println("personMap.keySet(): " + personMap.keySet());

for(Person person : personMap.keySet()){
    System.out.println(person + " имеет");
    for (Pet pet : personMap.get(person)){
        System.out.println("  " + pet);
    }
}
	
	// Многомерные отображения	
	*/




/*
    private String cityA [] = { "Abu Dhabi", "Abuja", "Addis Ababa", "Andorra la Vella", "Antananarivo"};
	private String cityB [] = {"Beirut", "Belgrade", "Belmopan", "Belfast", "Berlin", "Bern"};
	private String cityC [] = {"Cairo", "Canberra", "Caracas"} ;
	private String cityD [] = {"Dakar", "Damascus", "Dhaka"};
	private String cityE [] = {"Edinburgh"};
	private String cityG [] = {"Georgetown", "Guatemala"};
	private String cityH [] = {"Hanoi", "Havana", "Helsinki"};
	private String cityI [] = {"Islamabad"};
	private String cityJ [] = {"Jakarta"};
	private String cityK [] = {"Kingston", "Kiev"};
	private String cityL [] = {"Luxembourg", "London","Lisbon"};
	private String cityM [] = {"Manila", "Mexico", "Minsk", "Moscow"};
	private String cityN [] = {"New Delhi"};
	private String cityO [] = {"Oslo", "Ottawa"};
	private String cityP [] = {"Paris", "Prague"};
	private String cityQ [] = {"Quito"};
	private String cityR [] = {"Rome"};
	private String cityS [] = {"Santiago", "Sofia", "Stockholm"};
	private String cityT [] = {"Tallinn", "Tbilisi", "Tegucigalpa"};
	private String cityU [] = {"Ulaanbaatar"};
	private String cityV [] = {"Vienna", "Vilnius", "Valletta"};
	private String cityW [] = {"Warsaw", "Wellington", "Washington"};
	private String cityY [] = {"Yerevan", "Yamoussoukro"};
	private String cityZ [] = {"Zagreb"};
 */
