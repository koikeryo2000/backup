<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>管理者画面ログイン成功</title>
</head>
<body>
<h3>管理者画面ログイン成功</h3>

<p>新しい管理者を登録する<a href='<s:url action="GoManagerCreateAction" />'>こちら</a></p>

<p>新しい商品を登録する<a href='<s:url action="GoItemCreateAction" />'>こちら</a></p>

<p>登録した商品を表示する<a href='<s:url action="GoShowItemListAction" />'>こちら</a></p>

<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>

<p>商品の情報を変更する<a href='<s:url action="GoUpdateItemAction" />'>こちら</a></p>

<p>仮想通貨を発行する<a href='<s:url action="GoNetMoneyAction" />'>こちら</a></p>

</body>
</html>