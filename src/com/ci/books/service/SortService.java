package com.ci.books.service;

import com.ci.books.bean.Sort;
import com.ci.books.dao.SortDao;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SortService {

   @Resource
   private SortDao sortDao;
    public List<Sort> displaySort(){

        return  sortDao.displaySort();
    }
    public  boolean addSort(String sortName){

        return  sortDao.addSort(sortName);
    }
}
