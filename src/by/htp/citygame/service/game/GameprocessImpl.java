package by.htp.citygame.service.game;

import java.util.ArrayList;
import java.util.List;

import by.htp.citygame.service.players.Player;
import by.htp.citygame.service.players.PlayerImpl;

public class GameprocessImpl implements Gameprocess {

	private Player player1;
	private Player player2;

	public GameprocessImpl() {
		player1 = new PlayerImpl();
		player2 = new PlayerImpl();
	}
	
	/**
	 Method represent the game process, player's answers are being registering in the list "listResponses"
	 which provides, answers are not duplicated. If player response "I don't remember such city", 
	 another player becomes winner
	 */
	@Override
	public Player play() {
		List<String> listResponses = new ArrayList<>();
		String response = "";
		
		response = player1.startGame();
		listResponses.add(response);
		System.out.println("player1" + " " + response);

		do {			

			do {
				response = player2.giveResponse(response);
				if (response.equalsIgnoreCase("I don't remember such city")) {
					System.out.println("player2" + " " +response);
					return player1;
				}
			} while (listResponses.contains(response));
			listResponses.add(response);
			System.out.println("player2" + " " + response);

			
			do {
				response = player1.giveResponse(response);
				if (response.equalsIgnoreCase("I don't remember such city")) {
					System.out.println("player1" + " " + response);
					return player2;
				}
						
			} while (listResponses.contains(response));
			listResponses.add(response);
			System.out.println("player1" + " " + response);
					

		} while (!response.equalsIgnoreCase("I don't remember such city"));

		return player1;
	}

}
