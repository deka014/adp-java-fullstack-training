package com.deep.learningSpring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.deep.learningSpring.game.GameRunner;
import com.deep.learningSpring.game.GamingConsole;
import com.deep.learningSpring.game.PacmanGame;

@Configuration
@ComponentScan("com.deep.learningSpring.game")

public class SpringApp {
	
//	@Bean
//	public GamingConsole game() {
//		var game = new PacmanGame();
//		return game;
//	}
//	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		GameRunner gameRunner = new GameRunner(game);
//		return gameRunner;
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringApp.class);
			
			context.getBean(GameRunner.class).run();
			
			
			
			
	}

}



 