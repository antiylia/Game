package by.htp.citygame.service.playerstest;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.htp.citygame.dao.CityDao;
import by.htp.citygame.dao.CityDaoImpl;
import by.htp.citygame.service.players.Player;
import by.htp.citygame.service.players.PlayerImpl;

public class PlayerImplTest {

	private Player player1;
	private Player player2;
	String city = "";
	List<String> list = null;
	CityDao citiesDao;
	String responseIfDontKnow = "I don't remember such city";

	@BeforeClass
	public void init() {
		player1 = new PlayerImpl();
		player2 = new PlayerImpl();
		citiesDao = new CityDaoImpl ();
	}

	@Test
	public void firstCityIsCorrect() {
		city = player1.startGame();
		Map<String, List<String>> map = citiesDao.getCityName();
		list = map.get(city.substring(0, 1).toUpperCase());
		assertTrue(list.contains(city));
	}

	@Test
	public void playerResponseIsCorrect() {
		String cityForTest = "Dublin";
		city = player2.giveResponse(cityForTest);

		String lastLetter = cityForTest.substring(cityForTest.length() - 1, cityForTest.length());
		String firstLetter = city.substring(0, 1);

		if (!city.equalsIgnoreCase(responseIfDontKnow)) {
			assertTrue(firstLetter.equalsIgnoreCase(lastLetter));
		}
	}	

}
