package org.zerock.part11;

import org.springframework.stereotype.Component;

@Component("freeWrite")
public class FreeBoardWrite implements Write{
	
	private String sBoardName;
	
	public FreeBoardWrite() {
		init();
	}
	
	public void init() {
		this.setBoardName("Free Board");
	}
	
	public void setBoardName(String sBoardName) {
		this.sBoardName = sBoardName;
	}
	
	public String getBoardName() {
		return sBoardName;
	}
	
	public void doWrite() {
		System.out.println(this.getBoardName() + "Write down!!");
	}
}
