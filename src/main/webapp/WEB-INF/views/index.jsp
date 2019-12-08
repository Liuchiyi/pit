<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>

<%--<html>--%>
<%--<head>--%>
    <%--<meta charset="utf-8">--%>
    <%--<title>主页</title>--%>
    <%--<style>--%>
        <%--menu,h1,ul{--%>
            <%--margin: 0;--%>
        <%--}--%>
        <%--html,body{--%>
            <%--margin: 0;--%>
            <%--height: 100%;--%>
            <%--font-size: 14px;--%>
        <%--}--%>
        <%--body>header{--%>
            <%--line-height: 80px;--%>
            <%--text-align: center;--%>
            <%--background: #d6d8db;--%>
        <%--}--%>
        <%--body>header>h1{--%>
            <%--display: inline;--%>
        <%--}--%>
        <%--.body{--%>
            <%--position: absolute;--%>
            <%--top: 80px;--%>
            <%--bottom: 0;--%>
            <%--width: 100%;--%>
        <%--}--%>
        <%--.body>menu{--%>
            <%--position: absolute;--%>
            <%--left: 0;--%>
            <%--float: left;--%>
            <%--width: 200px;--%>
            <%--height: 100%;--%>
            <%--background: #d6d8db;--%>
            <%--box-sizing: border-box;--%>
        <%--}--%>
        <%--.body>main{--%>
            <%--margin-left: 200px;--%>
            <%--height: 100%--%>

        <%--}--%>
        <%--main>iframe{--%>
            <%--height: 100%;--%>
            <%--width: 100%;--%>
            <%--border: 0;--%>
            <%--display: block;--%>
        <%--}--%>
    <%--</style>--%>
<%--</head>--%>
<%--<body>--%>
<%--<header>--%>
    <%--<h1>深基坑监测系统</h1>--%>
    <%--<span>--%>
        <%--<b>${sessionScope.currentUser.name}</b>--%>
        <%--<a href="logout.do">退出登录</a>--%>
    <%--</span>--%>
<%--</header>--%>
<%--<section class="body">--%>
    <%--<menu>--%>
        <%--<ul>--%>
            <%--<li>--%>
                <%--<a href="pit/current.do" target="mainFrame">实时信息</a>--%>
            <%--</li>--%>
            <%--<li>--%>
                <%--<a href="pit/history.do" target="mainFrame">历史信息</a>--%>
            <%--</li>--%>
            <%--<li>--%>
                <%--<a target="mainFrame">现场状况</a>--%>
            <%--</li>--%>
            <%--<li>--%>
                <%--<a href="updatepassword.do" target="mainFrame">修改密码</a>--%>
            <%--</li>--%>
        <%--</ul>--%>
    <%--</menu>--%>
    <%--<main>--%>
        <%--<iframe name="mainFrame" src="welcome.do"></iframe>--%>
    <%--</main>--%>
<%--</section>--%>

<%--</body>--%>
<%--</html>--%>


<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>深基坑监测 | Starter</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="bower_components/Ionicons/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect. -->
    <link rel="stylesheet" href="dist/css/skins/skin-blue.min.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Google Font -->
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Main Header -->
    <header class="main-header">

        <!-- Logo -->
        <a href="index2.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>MENU</b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>深基坑监测</b></span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>
            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- User Account Menu -->
                    <li class="dropdown user user-menu">
                        <!-- Menu Toggle Button -->
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <!-- The user image in the navbar-->
                            <img src="dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <span class="hidden-xs">${sessionScope.currentUser.name}</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">
                                <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>
                                    东南大学-自动化学院
                                    <small>Member since Nov. 2015</small>
                                </p>
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="updatepassword.do" class="btn btn-default btn-flat">更改密码</a>
                                </div>
                                <div class="pull-right">
                                    <a href="logout.do" class="btn btn-default btn-flat">退出登录</a>
                                </div>
                            </li>
                        </ul>
                    </li>


                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">

        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">

            <!-- Sidebar Menu -->
            <ul class="sidebar-menu" data-widget="tree">
                <li class="header">HEADER</li>
                <!-- Optionally, you can add icons to the links -->

                <li><a href="pit/query.do" target=""><i class="fa fa-link"></i> <span>信息查询</span></a></li>
                <li><a href="pit/update.do" target=""><i class="fa fa-link"></i> <span>信息更新</span></a></li>
                <li class="treeview">
                    <a ><i class="fa fa-link"></i> <span>实时监控</span>

                        <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="pit/tunnel1.do">通道1</a></li>
                        <li><a href="pit/tunnel2.do">通道2</a></li>
                        <li><a href="pit/tunnel3.do">通道3</a></li>
                    </ul>
                </li>
                <li ><a href="pit/locate.do"><i class="fa fa-link"></i> <span>现场实景</span></a></li>
            </ul>
            <!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Page Header
                <small>Optional description</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
                <li class="active">Here</li>
            </ol>

        </section>

        <!-- Main content -->
        <section class="content container-fluid">

            <!--------------------------
              | Your Page Content Here |
              -------------------------->

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <!-- Control Sidebar -->

</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 3 -->
<script src="bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>

</body>
</html>