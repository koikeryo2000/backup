<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>パスワード検索失敗</title>
</head>
<body>
<h3>パスワード検索に失敗しました </h3>
<p>もう一度確認しパスワード検索をするか ruberia69@softbank.ne.jpまでメールをください</p>

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

<span>ログインページに戻る</span><a href='<s:url action="gotopPageAction" />'>こちら</a>

</body>
</html>