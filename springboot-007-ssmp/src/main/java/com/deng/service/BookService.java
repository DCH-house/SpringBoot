package com.deng.service;

import com.deng.pojo.Book;

import java.util.List;

public interface BookService {
    //增
    boolean save(Book book);
    //删
    boolean delete(Integer id);
    //改
    boolean update(Book book);
    //查
    Book seleceById(Integer id);
    List<Book> selectAll();
    List<Book> selectByPage(int currentPage,int size);
}
