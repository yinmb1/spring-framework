package com.luban.dao;

import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

	@Select("select user")
	String selectById(Integer id);
}
