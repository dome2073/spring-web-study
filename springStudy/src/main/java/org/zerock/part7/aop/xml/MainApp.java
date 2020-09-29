package org.zerock.part7.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/springcontext7_aop.xml");
		
		Board board= ac.getBean("board", Board.class);
		board.boardWrite();
		
		
	}
}
