package org.zerock.part7.aop.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board{
	@Autowired
//	@Qualifier("write") //�ڵ��������� 
	@Qualifier("qnaWrite")
	private Write write;
	
	//������ �ڵ� ����
//	public BoardCafe() {
//		this.setWrite(Factory.getWriteInstance());
//	}
//  ����	
//	@Autowired
//	public void setWrite(Write write) {
//		this.write = write;
//
//	}
	
	public void boardWrite() {
		write.doWrite();
	}

}
