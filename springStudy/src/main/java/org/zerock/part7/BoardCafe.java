package org.zerock.part7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board{
	@Autowired
//	@Qualifier("write") //자동설정제한 
	@Qualifier("qnaWrite")
	private Write write;
	
	//생성자 자동 주입
//	public BoardCafe() {
//		this.setWrite(Factory.getWriteInstance());
//	}
//  제거	
//	@Autowired
//	public void setWrite(Write write) {
//		this.write = write;
//
//	}
	
	public void boardWrite() {
		write.doWrite();
	}

}
