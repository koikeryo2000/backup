<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>パスワード検索結果</title>
</head>
<body>
<h3>検索に成功しました。</h3>
パスワードはこちらになります
<s:iterator value="#session.searchDTOList">
<s:property value="loginpass"/>
<s:property value="session.loginpass" /><br>

</s:iterator>
<s:property value="session.loginpass" /><br>
<s:property value="session.login_pass" /><br>

<p></p>

こちらからログインしてください
<s:form action="LoginAction">
				<s:textfield name="loginUserId"/>
				<s:password name="loginPassword"/>
				<s:submit value="ログイン"/>
			</s:form>


<s:property value="Loginpass" escape="false" />
</body>
</html>