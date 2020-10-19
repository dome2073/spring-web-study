package org.zerock.mapper;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringRunner.class)
@Log4j
public class ReplyMapperTests {
	
//	@Autowired
	
	//테스트전에 해당 번호의 게시물이 존재하는 지 확인
	private Long[] bnoArr = {3145755L, 3145754L, 3145753L, 3145752L, 3145751L};
	
	@Autowired
	private ReplyMapper mapper;
		
	
	@Test
	public void testMapper() {
		log.info(mapper);
	}
	
	@Test
	public void testCreate() {
		
		IntStream.rangeClosed(1,10).forEach( i-> {
			
			ReplyVO vo = new ReplyVO();
			
			//게시물번호 
			vo.setBno(bnoArr[i % 5]);
			vo.setReply("댓글 테스트" + i);
			vo.setReplyer("replyer" + i);
			
			
			System.out.println(vo);
			mapper.insert(vo);
		});
	}
	
	@Test
	public void testRead() {
		Long targetRno = 5L;
		
		ReplyVO vo = mapper.read(targetRno);
		
		log.info(vo);
	}
	
	@Test
	public void testDelete() {
		
		Long targetRno = 31L;
		
		mapper.delete(targetRno);
	}
	
	@Test
	public void testUpdate() {
		Long targetRno = 10L;
		
		ReplyVO vo = mapper.read(targetRno);
		
		vo.setReply("Update Reply" );
		
		int count = mapper.update(vo);
		
		log.info("UPDATE COUNT : " + count);
	
	}
	
}
