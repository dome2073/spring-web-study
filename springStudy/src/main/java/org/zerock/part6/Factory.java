package org.zerock.part6;

public class Factory {
	public static Write getWriteInstance() {
		return new FreeBoardWrite();
	}
	
	public static Board getBoardInstance() {
		return new BoardCafe();
	}
}
