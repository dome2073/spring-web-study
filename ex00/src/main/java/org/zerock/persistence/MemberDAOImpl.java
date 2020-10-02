package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

@Repository //DAO를 스프링에 인식시키기 위해서 주로 사용
public class MemberDAOImpl implements MemberDAO{
	
	//sql-template 
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = 
			"org.zerock.mapper.MemberMapper";
	
	public String getTime() {
		return sqlSession.selectOne(namespace+ ".getTime");
	}
	
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);
	}
}
