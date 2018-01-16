<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/4
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/diplay.css" />
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/deletebook.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ajax_display_books.js"></script>
<body style="background: url(${pageContext.request.contextPath}/images/bg3.jpg)">
<div class="container wrap1" style="height:450px;">
    <div><a href="sortt.do">添加图书</a></div>
    <form id="deleteform" action="dele.do" method="post">
    <table border="1px" width="100%" height="10%" cellpadding="0px" cellspacing="0px"  class="table table-hover" id="tableContent1">

        <tr align="center" class="display" >

            <td>图书名称</td>
            <td>作者</td>
            <td>购买时间</td>
            <td>图书分类</td>
            <td>操作</td>

        </tr>
    </table>
        <table border="1px" width="100%" height="10%" cellpadding="0px" cellspacing="0px"  class="table table-hover" id="tableContent">
        <c:forEach items="${booklist}"  var="li" >
            <tr align="center" class="trshow">
                <td>${li.bookName}</td>
                <td>${li.author}</td>
                <td>${li.buyTime}</td>
                <td>${li.sortName}</td>
               <td><input type="button" value="删除"  name="bookId" onclick="deletee('${li.bookId}')" ></td>
             <%--   <td> <a href="delete.do?bookId=${li.bookId}" >删除</a></td>--%>
            </tr>
        </c:forEach>

    </table>


    </form>
    <div style="background-color: powderblue" class="contropage">
        共<span id="count" >${count}</span>条结果,分成<span id="pageCount">${totalPages}</span>页面显示,当前第<span
            id="pageNum">${currentPage}</span>页

        <div class="actions">
            <input type="button" value="首页" onclick="topPage()" />
            <input type="button" value="上页" onclick="upPage()" />
            <input type="button" value="下页" onclick="nextPage()" />
            <input type="button" value="末页" onclick="lastPage()"/>
            调到第 <input type="text" name="page" id="inputNum" />页
            <input type="button" value="跳转" onclick="goTo()"/>

        </div>
    </div>

</div>
</div>
</body>
</html>
