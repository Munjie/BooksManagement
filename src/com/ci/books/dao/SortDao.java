package com.ci.books.dao;

import com.ci.books.bean.Books;
import com.ci.books.bean.Sort;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class SortDao {

    @Resource
    private  JdbcTemplate jdbcTemplate;

    public List<Sort> displaySort(){

        String sql = "select * from tbsort";
        List<Sort> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Sort>(Sort.class));
        return  list;

    }

    public  boolean addSort(String sortName){

        String sql = "insert into tbsort values(sort_seq.nextval,?)";
        int count = jdbcTemplate.update(sql,new Object[]{sortName});

        return  count >0;
    }
}
