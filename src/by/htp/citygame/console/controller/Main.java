package by.htp.citygame.console.controller;


import by.htp.citygame.service.game.Gameprocess;
import by.htp.citygame.service.game.GameprocessImpl;

public class Main {

	public static void main(String[] args) {
		
		Gameprocess game = new GameprocessImpl();
		game.play();
		
			
	}

}
