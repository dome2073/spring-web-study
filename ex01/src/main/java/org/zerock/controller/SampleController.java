package org.zerock.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat,false));
//	}
	
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
	
	//리스트로 파라미터 전달가능
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids ) {
		
		log.info("ids:" + ids);
		
		return "ex02List";
	}
	
	//배열로 전달가능 
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		
		log.info("array ids :"  + Arrays.toString(ids));
		
		return "ex02Array";
	}
	
	//리스트 객체로
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		
		log.info("list dtos: " + list);
		
		return "ex02Bean";
	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		log.info("todo: " +todo);
		return "ex03";
	}
	
	
}
