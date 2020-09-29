package org.zerock.part12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/springcontext12.xml");
		
		Board board= ac.getBean("board", Board.class);
//		Profiler profiler = ac.getBean("profiler",Profiler.class);
//		profiler.trace();
		board.boardWrite();
		
		
	}
}
