package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.MemberService;

@Controller 
@RequestMapping("/member/*")
public class MemberController {
	
	private MemberService service;
	
	@GetMapping("/loginForm")
	public String loginForm() {
		
		return "member/loginForm";
	}
	
	@GetMapping("registerForm")
	public String registerForm() {
		
		return "member/registerForm";
	}
	
	@PostMapping("loginAction")
	public String login(@RequestParam("id")String id, @RequestParam("pwd")String pw) {
		//@Request생략 가능
		
		//1. 로그인페이지에서 입력받은 값을 가져온다.(id, pw)
		System.out.println(id);
		System.out.println(pw);
		
		//2. DB에 데이터와 비교한다
		service.login(id,pw);
	
		return "";
	}
}

