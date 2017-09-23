package by.htp.citygame.service.gametest;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.htp.citygame.service.game.Gameprocess;
import by.htp.citygame.service.game.GameprocessImpl;
import by.htp.citygame.service.players.Player;



public class GameprocessImplTest {
	
  private Gameprocess gameTest;
   	
   @BeforeClass
   public void init() {
	   gameTest = new GameprocessImpl ();
    }
		
    
   @Test 
   public void winnerIsNotNull() {
	   Player player = gameTest.play();
	   assertNotNull(player);
	}
   
     
}
