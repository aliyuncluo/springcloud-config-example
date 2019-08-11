package com.cluo.config.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {
	@Select("select id,name,ip from test_tbl")
	public List<Map<String,Object>> findAll(); 

}
