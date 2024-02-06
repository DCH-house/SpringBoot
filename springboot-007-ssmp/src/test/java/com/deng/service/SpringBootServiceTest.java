package com.deng.service;

import com.deng.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void testSelect(){
        //System.out.println(bookService.selectAll());
        //System.out.println(bookService.seleceById(1));
        System.out.println(bookService.selectByPage(1,2));
    }
    @Test
    public void testSave(){
        bookService.save(new Book(null,"aaa","bbb","ccc"));
    }

    @Test
    public void testUpdate(){
        bookService.update(new Book(5,"bbb","aaaa","cccc"));
    }

    @Test
    public void testDelete(){
        bookService.delete(5);
    }
}
