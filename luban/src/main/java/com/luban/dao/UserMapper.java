package com.luban.dao;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {


  @Select("select '${profile}'")
  String selectById();

}
