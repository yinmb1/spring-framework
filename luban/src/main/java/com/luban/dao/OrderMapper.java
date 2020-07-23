package com.luban.dao;

import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

	@Select("select order")
	String selectById(Integer id);
}
