package by.htp.citygame.logic;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.htp.citygame.domain.Player;


public class GameprocessImplTest {
	
   Gameprocess process;
   Player player1;
   Player player2;
	
   @BeforeClass
   public void init() {
	   player1 = new Player();
	   player2 = new Player();
	   Gameprocess process = new GameprocessImpl ();
    }
		
   @Test
   public void winnerIsNotNull () {
	  Player player = process.announceWinner();
	  assertNotNull(player);  
	 }
    
   
   @Test (expectedExceptions = IllegalArgumentException.class)
   public void exceptionIsOccur () {
	String namecity = "Moscow";
	boolean result = process.gameProcess(player1, namecity);
	result = process.gameProcess(player2, namecity);
	
	 }
   
   
   
 
   
}
