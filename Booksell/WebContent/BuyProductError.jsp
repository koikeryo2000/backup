<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>購入失敗</title>
</head>
<body>
<h3>NetMoneyの残高が足りないため購入することができません。</h3>

<br>

<h3>購入方法を変えるかNetMoneyに新しくチャージしてから購入してください。</h3>

<p>mypageに移動する<a href='<s:url action="GoMypageAction" />'>こちら</a></p>
</body>
</html>