<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tagPage.jsp"%>

<html>
<head>
    <title>dict2</title>
</head>
<body>
<table border="1">
<tr>
    <th>序号</th>
    <th>模块</th>
    <th>类型</th>
    <th>内容</th>
    <th>操作</th>
    <th>操作</th>
</tr>

<c:forEach items="${tBdDictionaries}" var="tBdDictionary">
    <tr>
    <td>${tBdDictionary.dictionaryOrder}</td>
    <td>${tBdDictionary.dictionaryCommonCata}</td>
    <td>${tBdDictionary.dictionaryDetailCata}</td>
    <td>${tBdDictionary.dictionaryContent}</td>
    <td><a href="${webRoot}/goodsController/updateUI.do?gsId=${goods.gsId}">编辑</a> </td>
    <td><a href="${webRoot}/goodsController/delete.do?gsId=${goods.gsId}">删除</a> </td>
    </tr>
</c:forEach>
    </table>
</body>
</html>
