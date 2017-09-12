package by.htp.citygame.logic;

import by.htp.citygame.domain.Player;

public interface Gameprocess {
	
	
	Player announceWinner ();
	
	boolean gameProcess (Player player, String city) throws IllegalArgumentException;
		
}
