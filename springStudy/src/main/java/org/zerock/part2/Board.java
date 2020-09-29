package org.zerock.part2;

public class Board {
	private FreeBoardWrite write;
	
	public Board() {
		this.setWrite(new FreeBoardWrite());
	}
	public void setWrite(FreeBoardWrite write) {
		this.write = write;
	}
	
	public void boardWrite() {
		write.doWrite();
	}
	
	
}
