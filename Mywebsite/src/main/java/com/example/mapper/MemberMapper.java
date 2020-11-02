package com.example.mapper;

import java.util.List;

import com.example.domain.UserVO;

public interface MemberMapper {			
	public int selectUserOne(String user_id,String user_pw);
	
	public List<UserVO> selectAllUsers();
	
	public int deleteUser(String user_id);
	
	public int selectUser(String user_id);
	
	public int updateUser(UserVO u);
	
	public int insertUser(UserVO u);
}
