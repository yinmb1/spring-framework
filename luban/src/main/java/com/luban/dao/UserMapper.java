package com.luban.dao;

import com.luban.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;


public interface UserMapper {

	@Select("select user")
	String selectById(Integer id);

	@Lookup
	public User getUser();
}
