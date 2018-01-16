package com.ci.books.service;

import com.ci.books.bean.Books;
import com.ci.books.dao.BooksDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BooksService {


    @Resource
    private BooksDao booksDao;


    public  boolean addBooks(Books books){

        return booksDao.addBooks(books);
    }


    public  boolean deleteBook(int bookId){

       return  booksDao.deleteBook(bookId);
    }

    public List<Books> displayBook(){

       return  booksDao.displayBook();

    }
//显示总数
    public  int count(){

        return booksDao.count();
    }
//分页查询
    public List<Books> displyPage(String targetPage) {
        final int pageNumbers = 3;
        if(targetPage == null){
            targetPage = "1";
        }
        int currentPage = Integer.parseInt(targetPage);
        int end = currentPage*pageNumbers;
        int start = currentPage*pageNumbers-pageNumbers+1;
        return  booksDao.pageBook(start,end);
    }

}
