<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>トップページ</title>
</head>
<body>
<h1>BookSell</h1>
<s:form action="LoginAction">
<s:textfield name="loginUserId"/>
<s:password name="loginPassword"/>
<s:submit value="ログイン"/>

<p>新規ユーザー登録は<a href='<s:url action="UserCreateAction" />'>こちら</a></p>
</s:form>

</body>
</html>