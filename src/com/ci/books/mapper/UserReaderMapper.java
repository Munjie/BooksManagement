package com.ci.books.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserReaderMapper {


      int login(@Param("user")String user,@Param("password") String password);
}
