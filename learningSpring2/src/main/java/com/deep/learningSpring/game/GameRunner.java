package com.deep.learningSpring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//PacmanGame
@Component
public class GameRunner {
	
	private GamingConsole game;
	
	@Autowired
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}


