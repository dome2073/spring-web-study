package org.zerock.part6;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardCafe implements Board{
	@Autowired
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
