package com.deng.controller;

import com.deng.controller.utils.R;
import com.deng.pojo.Book;
import com.deng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    //查询所有
    @GetMapping
    public R getAll(){
        return new R(true,bookService.selectAll());
    }
    //查询单个
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,bookService.seleceById(id));
    }
    //分页查询
    @GetMapping("/{curPage}/{pageSize}")
    public R getByPage(@PathVariable Integer curPage,@PathVariable Integer pageSize){
        int total = bookService.selectAll().size();
        //如果当前页面大于最大页面重新发送请求定位到最后一页
        int maxPage = (total + pageSize - 1) / pageSize;
        if(curPage > maxPage){
            return new R(true,total,bookService.selectByPage((maxPage - 1) * pageSize,pageSize));
        }else {
            return new R(true, total, bookService.selectByPage((curPage - 1) * pageSize, pageSize));
        }
    }
    //添加书籍
    @PostMapping
    public R save(@RequestBody Book book){
        boolean frag = bookService.save(book);
        //模拟异常
//        String str = null;
//        str.toString();
        return new R(frag,frag ? "添加成功^_^" : "添加失败-_-!");
    }
    //修改书籍
    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.update(book));
    }
    //删除书籍
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.delete(id));
    }
}
