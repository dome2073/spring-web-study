package org.zerock.part8;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board{
//	@Autowired
	@Resource(name = "write")
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
