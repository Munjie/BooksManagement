package com.ci.books.controller;

import com.ci.books.bean.Books;
import com.ci.books.service.BooksService;
import com.google.gson.Gson;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class BooksController {

    @Resource
    private BooksService booksService;



    @InitBinder
    public  void  bindDate(ServletRequestDataBinder requestDataBinder){
        requestDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),false));
    }


    @RequestMapping("addbook.do")
    @ResponseBody
    public  String addBook(Books books){

         boolean  flag = booksService.addBooks(books);
        if (flag)
            return "{'msg':'Your information added successfully'}";
             else
            return "display";

    }


   @RequestMapping("delete.do")
   @ResponseBody
    public  String delete(int bookId){
        boolean flag = booksService.deleteBook(bookId);
        if (flag)

            return "{'msg':'Deleted successfully'}";
        else

       return
               "display";


    }

    @RequestMapping("display.do")
    public String display(Model model){
        List<Books> list =  booksService.displayBook();
        int count = booksService.count();
        model.addAttribute("booklist" ,list);
        model.addAttribute("count",count);
        model.addAttribute("totalPages",Math.ceil(count/5));
        System.out.print(count);
        if (list != null)
            return  "display";

        else
            return "display";

    }
   @RequestMapping("page.do")
   @ResponseBody
    public String page(String targetPage, HttpServletResponse response){
         System.out.print(targetPage);
        Gson gson = new Gson();
        List<Books> list = booksService.displyPage(targetPage);
       String json = gson.toJson(list);
       if (list != null)
            return "{'list':}";
        else
            return  null;


    }



}
