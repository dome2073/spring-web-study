package org.zerock.part10;

import javax.annotation.PostConstruct;

public class FreeBoardWrite implements Write{
	
	private String sBoardName;
	
	//1. context.xml�� init-method�� �ʱ�ȭ�� ������ֳ��� 
//	public FreeBoardWrite() {
//		init();
//	}
	//xml���� ó���ϰ� ���� ������ PostConstruct �ֳ����̼����� init-method�� �Ȱ��� ���� ����
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
