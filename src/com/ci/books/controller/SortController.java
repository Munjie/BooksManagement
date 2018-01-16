package com.ci.books.controller;


import com.ci.books.bean.Sort;
import com.ci.books.service.SortService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class SortController {

    @Resource
    private SortService sortService;

    @RequestMapping("sortt.do")
    public String displaySort(Model model){


      List<Sort> list =  sortService.displaySort();
      model.addAttribute("sort" ,list);

      if (list != null)
          return "add_book";
     else
         return
         "add_book";

    }

    @RequestMapping("addSort.do")
    public  String addSort(String sortName){

        boolean flag = sortService.addSort(sortName);

        if (flag)
            return "{'msg' : 'ok'}";
        else
            return "{'msg' : 'error'}";
    }
}
