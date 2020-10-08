<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    资产编号:
    <input type="text" name="assetid">
    <input type="submit" value="查询">
    <table border="1px">
        <tr align="center">
            <td colspan="4">
                <h3>固定资产查询</h3>
            </td>
        </tr>
        <tr>
            <td>资产编号</td>
            <td>资产名称</td>
            <td>资产类型</td>
            <td>入库日期</td>
        </tr>
        <c:forEach items="${assteslist}" var="item">
        <tr>
            <td>${item.assetid}</td>
            <td>${item.assetname}</td>
            <td>${item.assettype}</td>
            <td>
                <fmt:formatDate value="${item.intodate}" pattern="yyyy-MM-dd" ></fmt:formatDate>
            </td>
        </tr>
        </c:forEach>
    </table>
</form>
<a href="/jsp/add.jsp">添加新资产</a>
</body>
</html>
