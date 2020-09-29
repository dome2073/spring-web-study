package org.zerock.part10;

import javax.annotation.PostConstruct;

public class FreeBoardWrite implements Write{
	
	private String sBoardName;
	
	//1. context.xml의 init-method가 초기화를 대신해주나봄 
//	public FreeBoardWrite() {
//		init();
//	}
	//xml에서 처리하고 싶지 않으면 PostConstruct 애너테이션으로 init-method와 똑같이 정의 가능
	@PostConstruct
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
