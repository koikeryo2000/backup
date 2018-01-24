<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>ユーザー登録情報変更ページ</title>
</head>
<body>

<table>

<s:iterator value="UserInfoList">
<tr id="box">
<td>
<label>ログインID</label>
</td>
<td>
<s:property value="loginId" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>ログインパスワード</label>
</td>
<td>
<s:property value="loginpass" escape="false" />
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
</s:iterator>
</table>

<table>
<s:form action="UserUpdateAction">
<p>変更する項目を選んでください</p>
<select required="required" name="column" >
<option value="">-</option>
<option value="login_pass">ログインパスワード</option>
<option value="user_name">ユーザー名</option>
<option value="year">年齢</option>
<option value="street_address">住所</option>
<option value="phone_number">電話番号</option>
<option value="mail_address">メールアドレス</option>

</select>

<p>変更内容を入力してください</p>
<input type="text"required="required" name="change" value="" />

<s:submit value="変更"/>

</s:form>
</table>




</body>
</html>