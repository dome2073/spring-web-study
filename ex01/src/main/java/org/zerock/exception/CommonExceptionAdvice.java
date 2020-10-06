package org.zerock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import lombok.extern.log4j.Log4j;


@ControllerAdvice //컨트롤러에서 발생하는예외를 처리하는 존재임을 명시
@Log4j
public class CommonExceptionAdvice {
	
	//지정된 예외타입을 처리
	@ExceptionHandler(Exception.class)
	public String except(Exception ex, Model model) {
		log.error("Excetion ...." + ex.getMessage());
		model.addAttribute("exception",ex);
		log.error(model);
		return "error_page";
	}
	
	//404에러일때 
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handle404(NoHandlerFoundException ex) {
		
		return "custom404";
	}
}

