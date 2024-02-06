package com.deng.service.impl;

import com.deng.Dao.BookMapper;
import com.deng.pojo.Book;
import com.deng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public boolean save(Book book){
        return bookMapper.insert(book) > 0;
    }

    public boolean update(Book book){
        return bookMapper.update(book) > 0;
    }

    public boolean delete(Integer id){
        return bookMapper.deleteById(id) > 0;
    }

    @Override
    public Book seleceById(Integer id) {
        return bookMapper.selectById(id);
    }

    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }

    public List<Book> selectByPage(int currPage,int size){
        return bookMapper.selectByPage(currPage,size);
    }
}
