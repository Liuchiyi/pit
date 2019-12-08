<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>深基坑监测系统</title>

    <link rel="stylesheet" type="text/css" href="bower_components/bootstrap/dist/css/style.css">

    <script type="text/javascript" src="bower_components/bootstrap/dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="bower_components/bootstrap/dist/js/vector.js"></script>

</head>
<body>

<div id="container">
    <div id="output">
        <div class="containerT">

            <h1>用户登录</h1>
            <form action="login.do" method="post" class="form" id="entry_form">
                <p>
                    <label>账户:<input name="account"></label>
                </p>
                <p>
                    <label>密码:<input name="password"></label>
                </p>
                <p>
                    <button type="submit">登录</button>
                </p>
                <%--<strong>${message}</strong>--%>
                <div id="prompt" class="prompt"></div>
            </form>
        </div>
    </div>
</div>

<script type="text/javascript">
    $(function(){
        Victor("container", "output");   //登录背景函数
        $("#entry_name").focus();
        $(document).keydown(function(event){
            if(event.keyCode==13){
                $("#entry_btn").click();
            }
        });
    });
</script>
<div style="text-align:center;">
</div>
</body>
</html>
