package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	//어노테이션을 통한 SQL처리
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	//Mybatis를 통한 SQL처리 (XML)
	public String getTime2();
}
