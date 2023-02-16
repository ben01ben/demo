package com.web.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.web.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestBookDao {
    @Autowired
    private BookDao bookDao;
    @Test
    void test(){
        System.out.println(bookDao.selectById(2));
    }
    @Test
    void test2(){
        Book book=new Book();
        book.setId(13);
        book.setName("测试123rrrr");
        book.setType("测试123rrrrr");
        book.setDescription("测试123rrrrrrr");

        bookDao.updateById(book);
    }
    @Test
    void test3(){
        IPage page = new Page(1,5);
        bookDao.selectPage(page, null);
    }

}
