package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyPageDTO;
import org.zerock.domain.ReplyVO;

public interface ReplyService {

	//insert 서비스
	public int register(ReplyVO vo);
	
	//read -1 개
	public ReplyVO get(Long rno);
	
	//update
	public int modify(ReplyVO vo);
	
	//delete
	public int remove(Long rno);
	
	//getListWithPaging
	public List<ReplyVO> getList(Criteria cri, Long bno);
	
	public ReplyPageDTO getListPage(Criteria cri, Long bno);
}
