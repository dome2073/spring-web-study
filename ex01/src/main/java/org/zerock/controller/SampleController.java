package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	//""매핑
	@RequestMapping("")
	public void basic() {
		log.info("basic......................");
	}
	
	//localhost:8080/controller/sample/basic 시 실행
	@RequestMapping(value ="/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		log.info("basic get ....................");
	}
	
	//localhost:8080/controller/sample/basicOnlyGet  --> get방식일때만 실행
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only get..............");
	}
	
	//localhost:8080/controller/sample/ex01  --> get방식일때만 실행
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("" + dto);
		
		return "ex01";
	}
	//localhost:8080/controller/sample/ex02  --> get방식일때만 실행
	//name, age값을 매개변수로 
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age")int age) {
		
		log.info("name:" +name);
		log.info("age:" +age);
		return "ex02";
	}
}
