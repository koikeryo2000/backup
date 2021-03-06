<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>管理者登録画面確認ページ</title>
</head>
<body>
<h3>間違いがないか確認してください。</h3>
<table>
<s:form action="ManagerCreateCompleteAction">

<tr id="box">
<td>
<label>ログインID</label>
</td>
<td>
<s:property value="loginUserId" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>ログインパスワード</label>
</td>
<td>
<s:property value="loginUserPassword" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>ユーザー名</label>
</td>
<td>
<s:property value="userName" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>年齢</label>
</td>
<td>
<s:property value="year" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>役職</label>
</td>
<td>
<s:property value="position" escape="false" />
</td>
</tr>

<s:submit value="登録"/>
</s:form>
</table>

<p>管理者ページに移動する<a href='<s:url action="GoManagerPageAction" />'>こちら</a></p>



</body>
</html>