<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>ユーザー登録確認ページ</title>
</head>
<body>
<h3>登録する内容は以下でよろしいですか。</h3>

<table>
<s:form action="UserCreateCompleteAction">

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
<label>住所</label>
</td>
<td>
<s:property value="streetAddress" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>性別</label>
</td>
<td>
<s:property value="sex" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>電話番号</label>
</td>
<td>
<s:property value="phoneNumber" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>メールアドレス</label>
</td>
<td>
<s:property value="mailAddress" escape="false" />
</td>
</tr>



<tr>
<s:submit value="完了"/>
</tr>
<div>
				<span>前画面に戻る場合は</span><a href='<s:url action="goUserCreateAction" />'>こちら</a>
			</div>


</s:form>
</table>

</body>
</html>