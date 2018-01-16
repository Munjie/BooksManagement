<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/4
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.0.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/addbook.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js" ></script>
<body style="background: url(${pageContext.request.contextPath}/images/bg3.jpg)">
<div class="container wrap1" style="height:800px;">
    <div class="col-sm-8 col-md-5 center-auto pd-sm-50 pd-xs-20 main_content" style="background:url(${pageContext.request.contextPath}/images/main_bg.png)" >

        <form action="addbook.do" method="post" id="fom">
            <p class="text-center font16" id="errorinfo">


            </p>


            <div class="form-group mg-t20">
                <i class="icon-lock icon_font"></i>

                <input type="text" id="bookName" name="bookName" class="login_input" placeholder="请输入图书名称" />
            </div>
            <div class="form-group mg-t20">
                <i class="icon-lock icon_font"></i>

                <input type="text"  name="author"  id="author" class="login_input" placeholder="请输入图书作者" />
            </div>


            <div class="form-group mg-t20">
                <i class="icon-lock icon_font"></i>

                <input type="text"  name="buyTime" id="buyTime" class="login_input" placeholder="请输入购买日期" id = "starttime" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',minDate:'%y-%M-%d'})" />
            </div>
            <div class="form-group mg-t20">
                <i class="icon-lock icon_font"></i>
                <select class="login_select" name="sortId" >
                    <option>选择所属分类</option>
                    <c:forEach items="${sort}" var="li">
                        <option id="${li.sortId}" value="${li.sortId}">${li.sortName}</option>
                    </c:forEach>
                </select>

            </div>



            <input type="button"  id="add" value="添加图书"  onclick="addbook()" class="login_btn" />

        </form>
    </div>
</div>
</body>
</html>
