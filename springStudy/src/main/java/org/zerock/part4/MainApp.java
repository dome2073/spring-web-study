package org.zerock.part4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		
//		Board board = Factory.getBoardInstance();
//		board.boardWrite();
		//Bean을 을 spring/context4.xml로 주입
		ApplicationContext ac = new GenericXmlApplicationContext("spring/springcontext4.xml");
		
		Board board= ac.getBean("board", Board.class);
		board.boardWrite();
		
		
	}
}
