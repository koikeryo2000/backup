<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>エラーページ</title>
</head>
<body>
<h3>パスワード又はIDが間違ってるためログインできません</h3>

↓もう一度ログインする↓
<s:form action="LoginAction">
<tr>
					<td>
						<label>ログインID:</label>
					</td>
					<td>
						<input type="text" required="required" name="loginUserId" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>ログインPASS:</label>
					</td>
					<td>
						<input type="text" required="required" name="loginPassword" value="" />
					</td>
				</tr>
<s:submit value="ログイン"/>
</s:form>

<p></p>

パスワードを忘れた場合
<s:form action="SearchPasswordAction">

<tr>
					<td>
						<label>ログインID:</label>
					</td>
					<td>
						<input type="text" required="required" name="loginUserId" value="" />
					</td>
				</tr>

				<tr>
					<td>
						<label>ユーザー名:</label>
					</td>
					<td>
						<input type="text"required="required" name="userName" value="" />
					</td>
				</tr>

				<tr>
				<td>
						<label>電話番号:</label>
					</td>
				<td>
				<input type="text"required="required" name="phoneNumber" value="" />
				</td>
				</tr>

					<tr>
				<td>
						<label>メールアドレス:</label>
					</td>
				<td>
				<input type="text"required="required" name="mailAddress" value="" />
				</td>
				</tr>


<s:submit value="パスワード検索"/>


</s:form>

</body>
</html>