<%@page pageEncoding="utf-8"  %>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=request.getContextPath()%>/">
    <meta charset="UTF-8">
    <title>录入VIP客户</title>
</head>
<body>
<header>
    <h1>录入VIP客户</h1>
</header>
<main>
    <p>
        <strong>${message}</strong>
    <p>
<form action="/pit/update.do" method="post">

        <%--<form action="vip/add.do" method="post">--%>
    <p>
        <label>坑道:<input name="num" value="${param.num}" ></label>
    </p>
    <p>
        <label>顶部水平位移:<input name="toplateral" value="${param.toplateral}"></label>
    </p>
    <p>
        <label>顶部竖向位移:<input name="topvertical" value="${param.topvertical}" ></label>
    </p>
    <p>
        <label>倾斜角:<input name="slant" value="${param.slant}"></label>
    </p>
    <p>
        <label>底部水平位移:<input name="deeplateral" value="${param.deeplateral}"></label>
    </p>
    <p>
        <label>立柱竖向位移:<input name="columnvertical" value="${param.columnvertical}"></label>
    </p>
    <p>
        <label>水位:<input name="waterlevel" value="${param.waterlevel}"></label>
    </p>
    <p>
        <label>支撑内力:<input name="supportforce" value="${param.supportforce}"></label>
    </p>
    <p>
        <label>锚杆内力:<input name="boltstress" value="${param.boltstress}"></label>
    </p>
    <p>
        <label>裂隙:<input name="gap" value="${param.gap}"></label>
    </p>
    <p>
        <button type="submit">确定</button>
        <a href="/index.do">返回</a>

    </p>
    </form>
</main>
</body>
</html>
