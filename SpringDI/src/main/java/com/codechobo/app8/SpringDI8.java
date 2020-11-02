package com.codechobo.app8;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;


public class SpringDI8 {
	public static void main(String[] args) {
		
		//Q8. @Component를 이용한 자동 컴포넌트 스캔이 되도록 변경

		//1. ac생성 spring/springcontext7.xml
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context8.xml");

		//2. ac에서 빈을 가져온다.
		SportsCar c = (SportsCar)ac.getBean("Car");

		System.out.println(c);

	}
}
@Component("Engine")
class Engine {}

class TurboEngine extends Engine{
	
}

@Component("Door")
class Door{
	
}

@Component("Car")
class SportsCar{
	int oil;
	String color;
	
	@Autowired
	Engine engine;
	@Autowired
	Door[] doors;
	
	@Override
	public String toString() {
		return "SportsCar [oil=" + oil + ", color=" + color + ", engine=" + engine + ", doors=" + Arrays.toString(doors)
				+ "]";
	}


}
