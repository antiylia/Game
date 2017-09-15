package by.htp.citygame.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CityDaoImpl implements CityDao {
	
	private List <String> listAllCities = new ArrayList<>();
	
	
	@Override
    public  Map < String, List<String> > getCityName () {
	  Map < String, List<String> > cities = new HashMap <String, List <String>> (); 
	  String letterKey = "";
	  
	  List <String> list  = new ArrayList<>();
        try {        	
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = documentBuilder.parse("resources\\Cities.xml");
			
            Node root = document.getDocumentElement();                            
            NodeList letters = root.getChildNodes(); // Letters
            
                                
            for (int i = 0; i < letters.getLength(); i++) {
                Node letter = letters.item(i);
                letterKey = letter.getNodeName();
                
               if (letterKey.trim().matches("[A-Z]")) {
            	   list  = new ArrayList<>();
                	
                                                                  
               if (letter.getNodeType() != Node.TEXT_NODE) {
            	  NodeList specifiedCities = letter.getChildNodes();
            	  
            	   for(int j = 0; j < specifiedCities.getLength(); j++) {          	   
            		   NodeList citiesLetter = specifiedCities.item(j).getChildNodes();
            		     
            		   for (int q=0; q<citiesLetter.getLength(); q++) { 
            			   Node city = citiesLetter.item(q);
            			   String nameCity = city.getTextContent().trim();
            		       if (!nameCity.isEmpty()) {
            		    	   
            		          list.add (nameCity);
            		          listAllCities.add(nameCity);
               		       }
            		     }            	     
            	      }          	
                   }              
             
          }
               cities.put(letterKey, list);
      }
                  
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}  catch (SAXException e)  {
			e.printStackTrace();
		} catch (IOException ex) {
            ex.printStackTrace(System.out);
        }	
        return cities;
	}


	public List<String> getListAllCities() {
		return listAllCities;
	}


	public void setListAllCities(List<String> listAllCities) {
		this.listAllCities = listAllCities;
	}
	
	public String [] getArrayCities () {
		String [] arrLoc = new String [20];
		return listAllCities.toArray(arrLoc);
	}
	
}
