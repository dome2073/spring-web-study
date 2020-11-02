package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.MemberMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberMapper mapper;

	@Override
	public int login(String id, String pw) {
		// TODO Auto-generated method stub
		System.out.println("실행");
		final int SUC = 1;
		int result = 0;
		//1. id, pw 가 유효한 값인지 확인
		if(id != null && pw != null) {
			//2. DB와 비교
			
			result =  mapper.selectUserOne(id, pw);
			System.out.println(result);
			
		}
		
		return result;
		//3. 같을 경우
		
		//4. 다를 경우 
		
		
	}
	
	
	
	
}
