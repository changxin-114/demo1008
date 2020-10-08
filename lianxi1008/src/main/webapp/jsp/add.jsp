<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/add">
    <table border="1px">
        <tr align="center">
            <td colspan="2">
                <h3>新增固定资产</h3>
            </td>
        </tr>
        <tr>
            <td>资产编号</td>
            <td><input type="text" name="assetid"></td>
        </tr>
        <tr>
            <td>资产名称</td>
            <td><input type="text" name="assetname"></td>
        </tr>
        <tr>
            <td>资产类型</td>
            <td><input type="text" name="assettype"></td>
        </tr>
        <tr>
            <td>入库日期</td>
            <td><input type="text" name="intodate"></td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="增加">
                <input type="reset" value="清空">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
