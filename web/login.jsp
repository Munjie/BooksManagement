<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" />
</head>
<body style="background: url(${pageContext.request.contextPath}/images/bg2.jpg)">
<div class="container wrap1" style="height:450px;">
    <h2 class="mg-b20 text-center">SHOPPING</h2>
    <div class="col-sm-8 col-md-5 center-auto pd-sm-50 pd-xs-20 main_content" style="background:url(${pageContext.request.contextPath}/images/main_bg.png)" >

        <form  id="loginform" method="post" action="login.do" >
            <p class="text-center font16" id="errorinfo">


                </p>
            <div class="form-group mg-t20">
                <i class="icon-user icon_font"></i>

                <input type="text" id="myInitial" name="myInitial" class="login_input" placeholder="请输入用户名"/>
            </div>

            <div class="form-group mg-t20">
                <i class="icon-lock icon_font"></i>

                <input type="password"  name="password" id="password" class="login_input" placeholder="请输入密码" />
            </div>
            <div class="form-group mg-t20">
                <i class="icon-user icon_font"></i>
                <input type="text"  name="ucode" class="login_input" placeholder="请输入验证码"/>
            </div>
            <img src="Number.jsp"/>
            <input type="submit"  id="login" value="登录"  class="login_btn" />

            <div><input type="checkbox" value ="30" name="freelogin">记住我</div>
            <div class="link-area"><a id='reg' href="register.jsp">注册账号</a> <span class="spliter">|</span> <a id='forgetPassword'>忘记密码</a>
        </form>
    </div>
</div>
</body>
</html>
