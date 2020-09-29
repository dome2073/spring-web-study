package org.zerock.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ac = new GenericXmlApplicationContext("spring/context-text.xml");
		
		Board board = ac.getBean("board",Board.class); //spirng은 new연산자 ㄴㄴ
		board.boardWrite();
		ac.close();
	}
}
