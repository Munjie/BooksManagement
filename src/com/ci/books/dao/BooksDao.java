package com.ci.books.dao;



import com.ci.books.bean.Books;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class BooksDao {

  @Resource
    private  JdbcTemplate jdbcTemplate;


  public  boolean addBooks(Books books){

   //   String sql = "insert into tbbooks values(books_seq.nextval,?,?,?,?)";
      String sql = "INSERT INTO tbbooks (bookid,bookname,buytime,author,sortid)VALUES (books_seq.nextval,?,?,?,?)";

      int count = jdbcTemplate.update(sql,new Object[]{books.getBookName(),books.getBuyTime(),books.getAuthor(),books.getSortId()});


      return count > 0;
  }


  public  boolean deleteBook(int bookId){

      String sql = "delete from tbbooks where bookid = ?";
       int count =  jdbcTemplate.update(sql,new Object[]{bookId});
       return  count > 0;
  }
//显示书
  public List<Books> displayBook(){


        String sql = "SELECT * FROM tbbooks b,tbsort s WHERE b.sortid = s.sortid ORDER BY buytime DESC  ";
        List<Books> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Books>(Books.class));
        return  list;

    }
  //显示总共数据
    public  int count(){

        String sql = "SELECT COUNT (1) FROM tbbooks";
          int  count = jdbcTemplate.queryForInt(sql);
         return count;
    }

    //分页查询

    public List<Books> pageBook(int start,int end){
        String sql = "SELECT * FROM (SELECT ROWNUM RN,bookid,bookname,author,buytime,sortname FROM (SELECT * FROM tbbooks b,tbsort s WHERE b.sortid = s.sortid))  WHERE RN BETWEEN "+start+" AND "+ end;
        List<Books> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Books>(Books.class));
        return  list;

    }


}
