package org.zerock.part10;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardCafe implements Board{
	
	private Write write;
	
	public BoardCafe() {
		this.setWrite(Factory.getWriteInstance());
	}
	
	@Autowired
	public void setWrite(Write write) {
		this.write = write;

	}
	
	public void boardWrite() {
		write.doWrite();
	}

}
