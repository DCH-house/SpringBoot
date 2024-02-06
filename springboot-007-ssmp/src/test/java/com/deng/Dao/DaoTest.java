package com.deng.Dao;

import com.deng.pojo.Book;
import org.apache.ibatis.annotations.Select;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTest {
    @Autowired
    private BookMapper bookMapper;
    @Test
    public void testInsert(){
        Book book = new Book(null,"小说","堂吉诃德","勇敢无畏的哭丧着脸的骑士堂吉诃德和他的侍从桑丘开始了一场荒唐滑稽的冒险");
        Book book1 = new Book(null,"人物传记","乔布斯传","讲述了乔布斯的一生");
        Book book2 = new Book(null, "abc", "aaa", "....");
        bookMapper.insert(book2);
        //bookMapper.insert(book);
        //bookMapper.insert(book1);
    }

    @Test
    public void testSelectById(){
        System.out.println(bookMapper.selectById(1));
    }

    @Test
    public void testSelectAll(){
        bookMapper.selectAll();
    }

    @Test
    public void testUpdate(){
        Book book = new Book(4, "bbb", "ccc", "...");
        bookMapper.update(book);
    }

    @Test
    public void testDelete(){
        bookMapper.deleteById(4);
    }

    @Test
    public void testSelectByPage(){
        bookMapper.selectByPage(0,2);
    }
}
