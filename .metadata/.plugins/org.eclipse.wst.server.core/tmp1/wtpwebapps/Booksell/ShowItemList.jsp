<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>商品一覧ページ</title>
</head>
<body>

<s:form action="ShowItemListAction">

		<button type="submit">商品一覧表示</button>
	</s:form>

	<s:form action="ShowItemListAction" method="POST">
		<button type="submit">商品一覧表示</button>
	</s:form>


</body>
</html>