package com.ci.books.bean;

import java.util.Date;

public class Books {


    private  int bookId;
    private  String bookName;
    private  int sortId;
    private  String author;
    private Date buyTime;
    private  String sortName;


    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }


    public Books() {
    }

    public Books(int bookId, String bookName, int sortId, String author, Date buyTime) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.sortId = sortId;
        this.author = author;
        this.buyTime = buyTime;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", sortId=" + sortId +
                ", author='" + author + '\'' +
                ", buyTime=" + buyTime +
                '}';
    }
}
