package com.wx.common;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AbstractDao<T> {
void  insert(T t)throws  Exception;
void  update(T t)throws  Exception;

void  delate(@Param("key") String ukfield, @Param("value") Object value)throws  Exception;
T select(@Param("key") String ukfield, @Param("value") Object value) throws Exception;
boolean exsits(@Param("key") String ukfield, @Param("value") Object value)throws  Exception;
List<T> selectLike(@Param("key") String key)throws  Exception;
}
