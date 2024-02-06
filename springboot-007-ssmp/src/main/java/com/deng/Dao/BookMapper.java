package com.deng.Dao;

import com.deng.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper{
    @Insert("insert into t_book values(#{id},#{type},#{name},#{description})")
    int insert(Book book);

    @Select("select * from t_book where id = #{id}")
    Book selectById(int id);

    @Select("select * from t_book")
    List<Book>selectAll();

    @Delete("delete from t_book where id = #{id}")
    int deleteById(int id);

    @Update("update t_book set name = #{name},type = #{type},description = #{description} where id = #{id}")
    int update(Book book);

    @Select("select * from t_book limit #{page},#{size}")
    List<Book>selectByPage(int page,int size);
}
